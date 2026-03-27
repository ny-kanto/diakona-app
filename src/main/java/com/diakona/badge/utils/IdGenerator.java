package com.diakona.badge.utils;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Service
public class IdGenerator {

    @Autowired
    private DataSource dataSource;

    public String generateId(String productIdPrefix, String sequenceName) {
        String productId = "";
        try {
            Connection connection = this.dataSource.getConnection();
            String query = "SELECT nextval(?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, sequenceName);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                productId = productIdPrefix + String.format("%02d", resultSet.getInt(1));
            } else {
                throw new SQLException("Impossible de récupérer la prochaine valeur de la séquence.");
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return productId;
    }

    public String generateId(String prefix) {
        String id = "";

        try (Connection connection = dataSource.getConnection()) {

            // 1. Vérifier si le prefix existe
            String selectQuery = "SELECT valeur FROM sequence_personne WHERE prefix = ? FOR UPDATE";
            PreparedStatement selectStmt = connection.prepareStatement(selectQuery);
            selectStmt.setString(1, prefix);
            ResultSet rs = selectStmt.executeQuery();

            int nextValue;

            if (rs.next()) {
                nextValue = rs.getInt("valeur") + 1;

                // update
                String updateQuery = "UPDATE sequence_personne SET valeur = ? WHERE prefix = ?";
                PreparedStatement updateStmt = connection.prepareStatement(updateQuery);
                updateStmt.setInt(1, nextValue);
                updateStmt.setString(2, prefix);
                updateStmt.executeUpdate();
                updateStmt.close();

            } else {
                nextValue = 1;

                // insert
                String insertQuery = "INSERT INTO sequence_personne(prefix, valeur) VALUES (?, ?)";
                PreparedStatement insertStmt = connection.prepareStatement(insertQuery);
                insertStmt.setString(1, prefix);
                insertStmt.setInt(2, nextValue);
                insertStmt.executeUpdate();
                insertStmt.close();
            }

            id = prefix + String.format("%02d", nextValue);

            rs.close();
            selectStmt.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return id;
    }
}
