package com.learn.jdbc.template.springjdbc.template;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.SingleColumnRowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository{

	@Autowired
    JdbcTemplate jdbcTemp;
	
//	public  List<User> getNameById(int id)
//	{
//		String sql="select u.userFirstName as FirstName,u.userLastName as LastName from user u where userId=?";
//		 return jdbcTemp.queryForObject(sql, new RowMapper<User>() {
//			 @Override
//			public User mapRow(ResultSet rs, int rowNum) throws SQLException
//			{
//				User us=new User();
//				us.setUserFirstName(rs.getString("userFirstName"));
//				us.setUserLastName(rs.getString("userLastName"));
//				return us;
//			}
//	},id);
//	}
	
	public List<User> getUserById(int id)
	{
		String sql="select * from user where userId=?";
		RowMapper<User>mapper=(ResultSet rs, int rowNum) -> {
				User u=new User();
				u.setUserId(rs.getLong("userId"));
				u.setUserFirstName(rs.getString("userFirstName"));
				u.setUserLastName(rs.getString("userLastName"));
				u.setUserAddress(rs.getString("userAddress"));
				u.setUserMobNo(rs.getLong("userMobNo"));
				return u;
			
		};
		return jdbcTemp.query(sql, mapper,id);
	}
	
	public List<Map<String, Object>> getNameById(int id)
	{
		String sql = "select userFirstName,userLastName,userMobNo from user where userId=?";
//		List<Object> result = jdbcTemp.query(sql, (rs, rowNum) -> rs.getString("userFirstName"),id);
//		List<String> result = jdbcTemp.query(sql, new SingleColumnRowMapper<>(String.class),id);
		List<Map<String, Object>> result = jdbcTemp.queryForList(sql,id);
		
		return result;
	}

	public Map<String, String> Insert(User user)
	{
	    String sql = "INSERT INTO user(userId, userFirstName, userLastName, userMobNo, userAddress) VALUES (?, ?, ?, ?, ?)";

	    jdbcTemp.update(sql,user.getUserId(),user.getUserFirstName(),user.getUserLastName(),user.getUserMobNo(),user.getUserAddress());

	    Map<String,String> map=new HashMap();
		map.put("message", "Row is inserted");
	    return map;
	}

	public Map<String, String> updateUser(User user) {
		String sql="update user set userFirstName=?,userLastName=?, userMobNo=?, userAddress=? where userId=?";
		jdbcTemp.update(sql,user.getUserFirstName(),user.getUserLastName(),user.getUserMobNo(),user.getUserAddress(),user.getUserId());
		Map<String,String> map=new HashMap();
		map.put("message", "Row is updated");
		return map;
	}

	public List<User>getAllUsers()
	{
		String sql="select * from user ";
		BeanPropertyRowMapper rowMApper = new BeanPropertyRowMapper<>(User.class);
		return jdbcTemp.query(sql, rowMApper);
			
		
	}

	public Map<String, String> deleteUser(int id) {
		String sql="delete from user where userId=?";
		jdbcTemp.update(sql,id);
		Map<String,String>map=new HashMap<>();
		map.put("message", "Row is deleted");
		return map;
	}
			 
	}
	

