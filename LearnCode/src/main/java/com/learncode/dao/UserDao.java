package com.learncode.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpSession;

import com.learncode.entities.User;

public class UserDao {
	private Connection conn;

	public UserDao(Connection conn) {
		super();
		this.conn = conn;
	}

	public boolean checkEmail(String email) {
		boolean user = false;
		try {
			String sql = "select * from user where email = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, email);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				if (email.equals(rs.getString("email"))) {
					user = true;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;

	}

	public boolean saveUser(User user) {
		boolean f = false;
		try {

			String sql = "insert into user(name, email, password) values (?, ?, ?)";
			this.conn.prepareStatement(sql);
			PreparedStatement ps = this.conn.prepareStatement(sql);
			ps.setString(1, user.getName());
			ps.setString(2, user.getEmail());
			ps.setString(3, user.getPassword());
			ps.executeUpdate();
			f = true;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	public User getUserByEmailAndPassword(String email, String password) {
		User user = null;
		try {
			String sql = "select * from user where email=? and password=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, email);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				user = new User();
				String name = rs.getString("name");
				user.setName(name);
				user.setId(rs.getInt("id"));
				user.setEmail(rs.getString("email"));
				user.setPassword(rs.getString("password"));
				/****
				 * String name = rs.getString("name");
				user.setName(name);
				user.setId(rs.getInt("id"));
				user.setEmail(rs.getString("email"));
				user.setPassword(rs.getString("password"));
				 * 
				 * *****/
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;

	}

	

	public boolean updateUser(User user) {
		boolean f = false;
		try {
			String sql = "update user set email=? , name=? , password=? where id=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, user.getEmail());
			ps.setString(2, user.getName());
			ps.setString(3, user.getPassword());
			ps.setInt(4, user.getId());
			ps.executeUpdate();
			f = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

}
