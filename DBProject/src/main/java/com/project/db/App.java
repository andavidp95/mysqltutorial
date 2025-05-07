package main.java.com.project.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class App {
    public static void main(String[] args) {
        try (Connection conn = DBConnection.getConnection()) {
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM Employees";
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                // The rs.next() method moves the cursor to the next row of the result set.
                // The rs.next() loops through the result set, and for each row, it retrieves the values of the specified columns.
                int id = rs.getInt("employee_id");
                String name = rs.getString("first_name")  + " " + rs.getString("last_name");
                System.out.println ("Employee " + name +" has id: " + id);
            }
        } catch (Exception e) {
            System.err.println("ERROR connecting to the database");
            e.printStackTrace();
        }
    }
}
