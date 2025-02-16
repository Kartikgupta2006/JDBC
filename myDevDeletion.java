import java.sql.*;

public class myDevDeletion {
    public static void main(String[] args) throws ClassNotFoundException{

        String url="jdbc:mysql://localhost:3306/mydatabase";
        String username="root";
        String password="kartik@0";
        String query= " DELETE FROM employee WHERE id=4;";

        try {
            Class.forName("com.mysql.jdbc.driver");
            System.out.println("driver loaded successfully");
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        try{
            Connection con =DriverManager.getConnection(url,username,password);
            System.out.println("connection stabilies successfully");
            Statement stmt = con.createStatement();
            int rowsAffected =stmt.executeUpdate(query);
            System.out.println("no. of rows insert in database :"+rowsAffected);

            stmt.close();
            con.close();

            System.out.println("connection close successfully");
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
