package com.getidone;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/mydb";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root123";
    private static final String INSERT_QUERY = "INSERT INTO mytable (column1, column2, column3) VALUES (?, ?, ?)";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD)) {
            // Disable auto-commit to use batch updates
            connection.setAutoCommit(false);

            // Create the prepared statement for batch updates
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_QUERY);

            // Read the input data from file
            String filePath = "\"D:\\Ineuron Notes\\input.txt\"";
            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    // Parse the line and set values in the prepared statement
                    String[] data = line.split(",");
                    preparedStatement.setString(1, data[0]);
                    preparedStatement.setString(2, data[1]);
                    preparedStatement.setString(3, data[2]);

                    // Add the prepared statement to the batch
                    preparedStatement.addBatch();
                }

                // Execute the batch update
                int[] updateCounts = preparedStatement.executeBatch();

                // Commit the changes
                connection.commit();

                // Print the update counts
                for (int count : updateCounts) {
                    System.out.println("Rows updated: " + count);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

