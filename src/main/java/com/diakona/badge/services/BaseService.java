package com.diakona.badge.services;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BaseService {
    @Autowired
    private DataSource dataSource;

    public void initBase() {
        try {
            Connection c = dataSource.getConnection();
            Statement stmt = c.createStatement();
            stmt.executeUpdate("TRUNCATE TABLE groupe CASCADE;");
            stmt.executeUpdate("TRUNCATE TABLE categorie CASCADE;");
            stmt.executeUpdate("TRUNCATE TABLE personne CASCADE;");
            stmt.executeUpdate("TRUNCATE TABLE sequence_personne CASCADE;");

            stmt.executeUpdate("DROP SEQUENCE groupe_seq;");
            stmt.executeUpdate("DROP SEQUENCE categorie_seq;");

            stmt.executeUpdate("CREATE SEQUENCE groupe_seq;");
            stmt.executeUpdate("CREATE SEQUENCE categorie_seq;");

            stmt.executeUpdate(
                    "INSERT INTO groupe (id, anarana, acronyme) \r\n" + //
                            "VALUES \r\n" + //
                            "((SELECT CONCAT('GRP000', nextval('groupe_seq'))), 'FANILO', 'FNL'),\r\n"
                            + //
                            "((SELECT CONCAT('GRP000', nextval('groupe_seq'))), 'FANASINA', 'FNS'),\r\n"
                            + //
                            "((SELECT CONCAT('GRP000', nextval('groupe_seq'))), 'FAHAZAVANA', 'FZV'),\r\n"
                            + //
                            "((SELECT CONCAT('GRP000', nextval('groupe_seq'))), 'FANANTENANA', 'FNT'),\r\n"
                            + //
                            "((SELECT CONCAT('GRP000', nextval('groupe_seq'))), 'FANDRESENA', 'FDS');");

            stmt.executeUpdate(
                    "INSERT INTO categorie (id, anarana, acronyme) \r\n" + //
                            "VALUES \r\n" + //
                            "((SELECT CONCAT('CAT000', nextval('categorie_seq'))), 'LOHOLONA', 'LH'),\r\n"
                            + //
                            "((SELECT CONCAT('CAT000', nextval('categorie_seq'))), 'DIAKONA', 'DK');");

            stmt.close();
            c.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
