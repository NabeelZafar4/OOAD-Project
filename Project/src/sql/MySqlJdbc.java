package sql;

/*****************************************************************/
/* Copyright 2013 Code Strategies */
/* This code may be freely used and distributed in any project. */
/* However, please do not remove this credit if you publish this */
/* code in paper or electronic form, such as on a web site. */
/*****************************************************************/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import com.mysql.jdbc.PreparedStatement;

//import com.mysql.jdbc.Driver;

public class MySqlJdbc {
	private Connection conn;

	public void initMySqlJdbc() {

		// new com.mysql.jdbc.Driver();
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			String connectionUrl = "jdbc:mysql://localhost:3306/collegedb";
			String connectionUser = "root";
			String connectionPassword = "";
			conn = DriverManager.getConnection(connectionUrl, connectionUser,
					connectionPassword);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null,
					"Kindly check if all wamp services are enabled.",
					"Database Connection Error", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
	}

	public boolean isDatabaseConnected() {
		initMySqlJdbc();
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt
					.executeQuery("SELECT * FROM `student` WHERE 1");
			if (rs.next())
				return true; // connection is valid
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public ResultSet executeSelect(String query) {
		initMySqlJdbc();
		System.out.println(query);
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);

			return rs;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	//OUTPUT INSERTED.p_key
	//db.execute("select scope_identity()")
	
	public int execute2(String query) {
		String generatedColumns[] = {"ID"};
		Statement pStatement;
		try {
			pStatement = conn.prepareStatement(query, generatedColumns);
		
		//pStatement.setString(1,"blabla");

		pStatement.executeUpdate(query);
		ResultSet rs = pStatement.getGeneratedKeys();
		
		while (rs.next()){
		  System.out.println("id "+ rs.getInt("id"));
		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
	
	public boolean execute(String query) {
		initMySqlJdbc();
		System.out.println(query);
		try {
			Statement stmt = conn.createStatement();
			stmt.execute(query);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public boolean init(String query) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			String connectionUrl = "jdbc:mysql://localhost:3306/";
			String connectionUser = "root";
			String connectionPassword = "";
			conn = DriverManager.getConnection(connectionUrl, connectionUser,
					connectionPassword);
			System.out.println(query);

			Statement stmt = conn.createStatement();
			stmt.execute(query);
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}