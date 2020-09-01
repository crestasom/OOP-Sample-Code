package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class DatabaseMain {

	public static void main(String[] args) throws Exception {

		String url = "jdbc:mysql://localhost:3366/tbl_graph?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String username = "root";
		String password = "";
		String sql = "";
		Statement stmt;
		ResultSet rs;
		Connection con;

		// 1. get the connection object
		con = (Connection) DriverManager.getConnection(url, username, password);
		// 2. prepare sql string
		sql = "SELECT * FROM vertex ";
		// 3. prepare sql statement to be executed
		stmt = (Statement) con.createStatement();
		// 4 get the resultset from execution
		rs = stmt.executeQuery(sql);
		stmt.close();
		/*
		 * use rs.get... to get the data from result rs. next check if there is data on
		 * next row also automatically moves the cursor to next row of data
		 */
		java.util.List<Vertex> vList=new ArrayList<>();
		while (rs.next()) {
			Vertex v = new Vertex();
			v.setId(rs.getInt(1));
			v.setName(rs.getString(2));
			v.setLati(rs.getDouble(3));
			v.setLogi(rs.getDouble(4));
			vList.add(v);
		}
		for(Vertex v:vList) {
			System.out.println(v);
		}

		rs.close();
		//stmt.close();
		con.close();
	}

}

class Vertex {
	private int id;
	private String name;
	private double lati;
	private double logi;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getLati() {
		return lati;
	}

	public void setLati(double lati) {
		this.lati = lati;
	}

	public double getLogi() {
		return logi;
	}

	public void setLogi(double logi) {
		this.logi = logi;
	}

	@Override
	public String toString() {
		return "Vertex [id=" + id + ", name=" + name + ", lati=" + lati + ", logi=" + logi + "]";
	}

}