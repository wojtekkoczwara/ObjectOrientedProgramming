package DataBase;

import java.sql.*;

public class Main
{
    public static void main(String[] args) {
        try{
//            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\wkoczwara\\Documents\\Projects\\TimBuchalkaProgramming\\ObjectOrientedProgramming\\test.db");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\SQLitedb\\test.db");
//            conn.setAutoCommit(false);
            Statement statement = conn.createStatement();
            statement.execute("CREATE TABLE IF NOT Exists" +
                    " contacts(name TEXT, phone INTEGER, email TEXT)");

//            statement.execute("INSERT INTO contacts (name, phone, email)"
//            + "Values('TIM', 654678, 'tim@email.com')");
//
//            statement.execute("INSERT INTO contacts (name, phone, email)"
//            + "Values('JOE', 45632, 'joe@anywhere.com')");
//            statement.execute("INSERT INTO contacts (name, phone, email)"
//            + "Values('Jane', 4829484, 'jane@somewhere.com')");
//            statement.execute("INSERT INTO contacts (name, phone, email)"
//            + "Values('Fido', 9038, 'dog@email.com')");
//
//            statement.execute("UPDATE contacts set phone=5566789 where name='Jane'");
//            statement.execute("DELETE FROM contacts where name='JOE'");

            statement.execute("SELECT * FROM contacts");
            ResultSet result = statement.getResultSet();
            while (result.next()){
                System.out.println(result.getString("name") + " " + result.getInt("phone") + " " + result.getString("email"));
            }
            result.close();
            statement.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Something went wrong");
            throw new RuntimeException(e);
        }
    }
}
