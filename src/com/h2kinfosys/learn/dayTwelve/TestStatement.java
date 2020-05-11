package com.h2kinfosys.learn.dayTwelve;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;

public class TestStatement {

	public static void main(String[] args) throws SQLException {
		String query = "select * from sakila.city";
		Connection conn = null;
		try {
		 conn = TestConnection.getConnection();
		 // 4 - Create Statement
		 Statement stat = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		 // Execute a Query  Step 5 = Get the result from DB
		 ResultSet rs = stat.executeQuery(query);
		 String cityName = null;
		 Timestamp lastUpdate = null;
		 if(rs != null) {
			while(rs.next()) {
				int cityId = rs.getInt("city_id");
				cityName = rs.getString("city");
				if(cityName.equals("Akron")) {
					int rowId = rs.getRow();
					System.out.println("Akron is on Row Number :: " + rowId);
					rs.updateString("city", "Akroun");
				}
				int countryId = rs.getInt("country_id");
				lastUpdate = rs.getTimestamp("last_update");
				rs.updateRow(); // Updates the row in db
				rs.refreshRow(); // refreshes resultset with new changes
				cityName = rs.getString("city");
				System.out.println(cityId + " " + cityName + " " + countryId + " " + lastUpdate);
			}
		 }else {
			 System.out.println("Result is not provided");
		 }
		 
		 
		}catch(SQLException sql) {
			sql.printStackTrace();
		}finally {
			if(conn != null) conn.close();
		}

	}

}
