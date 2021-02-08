package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DatabaseMain {

	public static void main(String[] args) throws Exception {

		String url = "jdbc:mysql://localhost:3306/tbl_graph?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String username = "root";
		String password = "";
		String name = "test";
		String sql = "";
		Statement stmt;
		ResultSet rs;
		Connection con;

		// 1. get the connection object
		con = DriverManager.getConnection(url, username, password);
		// 2. prepare sql string

		// add two vertex
		addVertex("test2", 34.345, 12.345, con);
		addVertex("test21", 323.345, 12.345, con);
		addVertex("test22", 343.345, 12.345, con);

		sql = "SELECT * FROM vertex";
		// 3. prepare sql statement to be executed
		stmt = (Statement) con.createStatement();
		// 4 get the resultset from execution
		rs = stmt.executeQuery(sql);
		//
		/*
		 * use rs.get... to get the data from result rs. next check if there is data on
		 * next row also automatically moves the cursor to next row of data
		 */
		java.util.List<Vertex> vList = new ArrayList<>();
		while (rs.next()) {
			Vertex v = new Vertex();
			v.setId(rs.getInt(1));
			v.setName(rs.getString(2));
			v.setLati(rs.getDouble(3));
			v.setLogi(rs.getDouble(4));
			vList.add(v);
		}
		for (Vertex v : vList) {
			System.out.println(v);
		}

		rs.close();
		stmt.close();
		con.close();
	}

	public static void addVertex(String name, double latitude, double longitude, Connection con) throws Exception {
//		String sql = "Insert into vertex" + "(name,latitude,longitude)" + "Values('" + name + "'," + latitude + ","
//				+ longitude + ")";
		String sql = String.format("Insert into vertex" + "(name,latitude,longitude)" + "Values('%s',%f,%f)", name,
				latitude, longitude);
		Statement stmt = con.createStatement();
		stmt.executeUpdate(sql);
		stmt.close();
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