package com.learn.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import com.bank.BankApp;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/servlettrial1") // Fixed: Added slash
public class servlettrial1 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public servlettrial1() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();

        String name = request.getParameter("name");
        String acNumStr = request.getParameter("ACnumber");

        // Show message if accessed directly without form
        if (name == null || acNumStr == null || acNumStr.isEmpty()) {
            pw.println("<html><body>");
            pw.println("<h2>This servlet expects a form submission.</h2>");
            pw.println("<p><a href='index.jsp'>Go back to form</a></p>");
            pw.println("</body></html>");
            return;
        }

        int ACnumber = Integer.parseInt(acNumStr);
        String address = request.getParameter("Address");
        String type = request.getParameter("type");
        double balance = Double.parseDouble(request.getParameter("balance"));

        BankApp bankApp = new BankApp();
        bankApp.insert(name, ACnumber, address, type, balance);

        pw.println("<html><body>");
        pw.println("<h2>Account created successfully!</h2>");
        pw.println("<h3>List of All Accounts:</h3>");

        try {
            var accounts = bankApp.listAccount();

            pw.println("<table border='1'>");
            pw.println("<tr><th>Name</th><th>AC Number</th><th>Address</th><th>Type</th><th>Balance</th></tr>");
            for (var row : accounts) {
                pw.println("<tr>");
                pw.println("<td>" + row.get("name") + "</td>");
                pw.println("<td>" + row.get("AC_number") + "</td>");
                pw.println("<td>" + row.get("Address") + "</td>");
                pw.println("<td>" + row.get("Type_of_AC") + "</td>");
                pw.println("<td>" + row.get("Balance") + "</td>");
                pw.println("</tr>");
            }
            pw.println("</table>");

        } catch (Exception e) {
            pw.println("<p style='color:red;'>Error fetching accounts: " + e.getMessage() + "</p>");
            e.printStackTrace();
        }

        pw.println("<br><a href='index.jsp'>Add Another Account</a>");
        pw.println("</body></html>");
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
