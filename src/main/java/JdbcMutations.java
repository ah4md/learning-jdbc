import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcMutations {

static void insertCourse(Connection con,String title,double price){
    String sql = "INSERT INTO courses(title,price) VALUES (?,?)";

}


    public static void main(String[] args) throws SQLException {
        String jdbcUrl="jdbc:mysql://localhost:3306/school_db";
        String userName="root";
        String password="password";

        try(Connection connection= DriverManager.getConnection(jdbcUrl,userName,password)){
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter course title: ");
            String title=scanner.nextLine();
            System.out.println("Enter course price: ");
            double price = scanner.nextDouble();
            insertCourse(connection,title,price);

        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
