package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MusicDataBase {

    public static final String DB_NAME = "music.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:C:\\SQLitedb\\" + DB_NAME;

    public static void main(String[] args) {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(CONNECTION_STRING);
            Statement statement = conn.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
