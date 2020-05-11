package com.h2kinfosys.learn.dayTwelve;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestUpdate {

	public static void main(String[] args) throws SQLException {
		String insertQuery = "INSERT INTO city (city_id, city, country_id, last_update) " + 
						"VALUES (?,?,?, CURRENT_TIMESTAMP)" ;
		
		String updateQuery = " UPDATE city set city = ? where city_id = ?";
		
		String deleteQuery = "Delete from city where city_id = ?";
		
		Connection conn = null;

		try {
		 conn = TestConnection.getConnection();
		 PreparedStatement pStat = conn.prepareStatement(insertQuery);
		 pStat.setInt(1, 603);
		 pStat.setString(2, "Macon");
		 pStat.setInt(3, 103);
		 
		 int numOfRowsInserted = pStat.executeUpdate();
		 
		 if(numOfRowsInserted > 0) {
			 System.out.println("Data inserted successfully");
		 }
		 conn.commit();
		 
		 pStat.close();
		 pStat = conn.prepareStatement(updateQuery);
		 pStat.setString(1, "Smyrna");
		 pStat.setInt(2, 601);
		 
		 int numOfRowsUpdated = 0;
				 // pStat.executeUpdate();
		 

		 if(numOfRowsUpdated > 0) {
			 System.out.println("Data Updated successfully");
		 }
		 pStat.close();
		 
		 pStat = conn.prepareStatement(deleteQuery);
		 pStat.setInt(1, 601);
		 
		 int numOfRowsDeleted = 0;
				 // pStat.executeUpdate();
		 if(numOfRowsDeleted > 0) {
			 System.out.println("Data Deleted successfully");
		 }
		 
		}catch(SQLException ex) {
			if(conn != null) conn.rollback();
			ex.printStackTrace();
		}finally {
			if(conn != null) conn.close();
		}

	}

}
