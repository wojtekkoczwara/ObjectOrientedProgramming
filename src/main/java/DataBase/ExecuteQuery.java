package DataBase;

import java.sql.*;
import java.util.List;

public class ExecuteQuery
{

    public static final String DB_NAME = "test.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:C:\\SQLitedb\\" + DB_NAME;

    public static final String TABLE_CONTACTS = "contacts";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_PHONE = "phone";
    public static final String COLUMN_EMAIL = "email";

    public static void main(String[] args) {
        try{
            Connection conn = DriverManager.getConnection(CONNECTION_STRING);
            Statement statement = conn.createStatement();

//            execute query
            statement.execute("DROP TABLE IF EXISTS " + TABLE_CONTACTS);
            statement.execute("CREATE TABLE IF NOT EXISTS " + TABLE_CONTACTS + " ( " + COLUMN_NAME + " text, " + COLUMN_PHONE + " integer, " + COLUMN_EMAIL + " text" + " ) ");
            insertContact(statement, "TIM", 654678, "tim@email.com");

            insertContact(statement, "JOE", 45632 , "joe@anywhere.com");
            insertContact(statement, "Jane", 4829484, "jane@somewhere.com");
           insertContact(statement, "Fido", 9038, "dog@email.com");
            statement.execute("UPDATE " + TABLE_CONTACTS + " SET " + COLUMN_PHONE + "=5566789" + " WHERE " + COLUMN_NAME + "='Jane'");
            statement.execute("DELETE FROM " + TABLE_CONTACTS + " WHERE " + COLUMN_NAME + "='JOE'");

            ResultSet result = statement.executeQuery("Select * from " + TABLE_CONTACTS);

            while (result.next()){
                System.out.println(result.getString(COLUMN_NAME) + " " + result.getInt(COLUMN_PHONE) + " " + result.getString(COLUMN_EMAIL));
            }
            result.close();
            statement.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Something went wrong");
            throw new RuntimeException(e);
        }
    }

    private static void insertContact(Statement statement, String name, int phone, String email) throws SQLException{
        statement.execute("INSERT INTO " + TABLE_CONTACTS + " Values('" + name + "', " + phone + ", '" + email + "')");
    }

}
