package com.learncode.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.learncode.entities.Category;
import com.learncode.entities.Post;

public class PostDao {
	Connection conn;

	public PostDao(Connection conn) {
		this.conn = conn;
	}

	public ArrayList<Category> getAllCategories() {
		ArrayList<Category> list = new ArrayList<Category>();
		try {
			String sql = "select * from categories";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int cid = rs.getInt("cid");
				String name = rs.getString("name");
				String description = rs.getString("description");
				Category c = new Category(cid, name, description);
				list.add(c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;

	}

	public boolean savePost(Post p) {
		boolean f = false;
		try {
			String sql = "insert into posts(pTitle, pContent, pCode, pPic, catId, userId) values(?, ?, ?, ?, ?, ?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, p.getpTitle());
			ps.setString(2, p.getpContent());
			ps.setString(3, p.getpCode());
			ps.setString(4, p.getpPic());
			ps.setInt(5, p.getCatId());
			ps.setInt(6, p.getUserId());
			ps.executeUpdate();
			f = true;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return f;
	}

	public List<Post> getAllPosts() {
		List<Post> list = new ArrayList<Post>();
		try {
			String sql = "Select * from posts";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int pid = rs.getInt("pid");
				String pTitle = rs.getString("pTitle");
				String pContent = rs.getString("pContent");
				String pCode = rs.getString("pCode");
				String pPic = rs.getString("pPic");
				int catId = rs.getInt("catId");
				int userId = rs.getInt("userId");
				Post post = new Post(pid, pTitle, pContent, pCode, pPic, catId, userId);
				list.add(post);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;

	}

	public List<Post> getPostByCatId(int catId) {

		List<Post> list = new ArrayList<Post>();
		try {
			String sql = "Select * from posts where catId = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, catId);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int pid = rs.getInt("pid");
				String pTitle = rs.getString("pTitle");
				String pContent = rs.getString("pContent");
				String pCode = rs.getString("pCode");
				String pPic = rs.getString("pPic");
				int userId = rs.getInt("userId");
				Post post = new Post(pid, pTitle, pContent, pCode, pPic, catId, userId);
				list.add(post);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;

	}

	public Post getPostByPostId(int postId) {
		Post post = new Post();
		String sql = "select * from posts where pid=?";
		try {
			PreparedStatement ps = this.conn.prepareStatement(sql);
			ps.setInt(1, postId);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				int cid = rs.getInt("catId");
				int pid = rs.getInt("pid");
				String pTitle = rs.getString("pTitle");
				String pContent = rs.getString("pContent");
				String pCode = rs.getString("pCode");
				String pPic = rs.getString("pPic");
				int userId = rs.getInt("userId");
				post = new Post(pid, pTitle, pContent, pCode, pPic, cid, userId);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return post;
	}
}
