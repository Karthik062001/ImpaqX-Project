package com.bank;

import java.sql.*;
import java.util.*;

public class BankApp extends DataConnection {

    public void insert(String name, int AC_no, String address, String type, double balance) {
        String sql = "INSERT INTO BANK(name, AC_number, Address, Type_of_AC, Balance) VALUES (?, ?, ?, ?, ?)";

        try (Connection con = DataConnection.getConection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, name);
            ps.setInt(2, AC_no);
            ps.setString(3, address);
            ps.setString(4, type);
            ps.setDouble(5, balance);
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Map<String, Object>> listAccount() throws SQLException {
        List<Map<String, Object>> list = new ArrayList<>();
        String sql = "SELECT * FROM bank";

        try (Connection con = DriverManager.getConnection(URL, USER_N, PASS);
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Map<String, Object> row = new HashMap<>();
                row.put("name", rs.getString("name"));
                row.put("AC_number", rs.getInt("AC_number"));
                row.put("Address", rs.getString("Address"));
                row.put("Type_of_AC", rs.getString("Type_of_AC"));
                row.put("Balance", rs.getDouble("Balance"));
                list.add(row);
            }
        }

        return list;
    }

    public Map<String, Object> particularData(int ACno) throws SQLException, ClassNotFoundException {
        Map<String, Object> row = new HashMap<>();
        String sql = "SELECT * FROM bank WHERE AC_number = ?";

        try (Connection con = DataConnection.getConection();
             PreparedStatement stmt = con.prepareStatement(sql)) {

            stmt.setInt(1, ACno);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                row.put("name", rs.getString("name"));
                row.put("AC_number", rs.getInt("AC_number"));
                row.put("Address", rs.getString("Address"));
                row.put("Type_of_AC", rs.getString("Type_of_AC"));
                row.put("Balance", rs.getDouble("Balance"));
            } else {
                System.out.println("Invalid Account Number");
            }
        }

        return row;
    }
}
