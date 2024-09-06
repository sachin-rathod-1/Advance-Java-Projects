package com.cdac.Action;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.cdac.Beans.RegistrationBeans;

public class RegistrationAction {

	private PreparedStatement ps = null;
	private ResultSet rs = null;
	private String sql = null;
	private int i = 0;

	public int Adduser(Connection con, RegistrationBeans rb ) {
		
		try {
			sql="INSERT INTO users (First_name, Last_name, Gender, Contact_no, Email_id, Password, photo)"
					+ "VALUES(?,?,?,?,?,?,?)";
			ps=con.prepareStatement(sql);
			ps.setString(1, rb.getFirst_name());
			ps.setString(2, rb.getLast_name());
			ps.setString(3, rb.getGender());
			ps.setString(4, rb.getContact_no());
			ps.setString(5, rb.getEmail_id());
			ps.setString(6, rb.getPassword());
			ps.setBlob(7, rb.getInputStream());
			
			i=ps.executeUpdate();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return i;
	}
}
