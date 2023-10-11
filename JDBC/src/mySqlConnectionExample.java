
import javax.xml.transform.Result;
import java.sql.*;

public class mySqlConnectionExample {
    public static Connection getMyConnection() throws SQLException {
        String hostName = "localhost"; //127.0.1
        String dbName = "javaExample";
        String username = "root";
        String password = "";
        //chuoi ket noi den database
        //"jdbc:myqsql://localhost:3306/javaexample,username,password"
        String connectionUrl = "jdbc:mysql://" + hostName + ":3306/" + dbName;
        Connection connection = DriverManager.getConnection(connectionUrl,username,password);
        return connection;
    }
    //Create new record : Insert Into Emplyee value( 1, "Hoang", "Ha Noi")
    public static void createEmployee() throws SQLException {
        // ket noi, dung lai connection
        Connection connection = getMyConnection();
        // tao statement
        Statement statement = connection.createStatement();
        // 3. tao query String Database thao tac db
        String query = "insert into employee(Id,Name,Address)" +
                "values(2,'Hoàng','Ha Noi')";
        //4. thuc hien insert
        int count = statement.executeUpdate(query);
        System.out.println("Count: " + count);
    }
    public static void getDataEmployee() throws SQLException {
        Connection connection = getMyConnection();
        Statement statement = connection.createStatement();
        String query = "select * from employee";
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()){
            int id = resultSet.getInt(1);
            String name =resultSet.getString(2);
            String address = resultSet.getString(3);
            System.out.println("================");
            System.out.println(id);
            System.out.println(name);
            System.out.println(address);
        }
        connection.close();
    }
    public static void CRUDMySQLDB() throws SQLException{
        //1.tao connection on object
        Connection connection = getMyConnection();
        //2.tao statement object de thuc thi
        Statement statement = connection.createStatement();
        //3. create table
        // create table product (id int primary key, ProName varchar(50),
        statement.execute("drop table if exists users");
        statement.execute("create table users(id int PRIMARY KEY, username varchar(50),password varchar(100))");
        //insert data
        statement.execute("insert into users values (2,'admin','admin')");
        //select data with statement
        ResultSet resultSet = statement.executeQuery("select * from users");
        while (resultSet.next()){
            System.out.println("User Name: " + resultSet.getString("username")); //or (proName)
        }
    }
    //login with statement
    public static void loginWithStatement(String username,String password) throws SQLException{
        //tao ket noi database
        Connection connection = getMyConnection();
//2.tao truy van(query)
        String query = "Select username from users WHERE username like '"+username+" and like '"+password+"'";
        // 3. tao statement
        Statement statement = connection.createStatement();
        //4.tao resultset
        ResultSet resultSet = statement.executeQuery(query);
        //5.
        while (resultSet.next()){
            System.out.println("username: "+ resultSet.getString(username));
        }
    }
    //login with
    public static void loginWithPreparedStatement()throws SQLException{}
    public static void main(String[] args) throws SQLException {
        //getMyConnection();
        if (getMyConnection() != null){
            System.out.println("Connect success");
            createEmployee();
//            getDataEmployee();
//            CRUDMySQLDB();
//            loginWithStatement("admin","admin");
        }else {
            System.out.println("connect fail");
        }
    }
    //Login with PrepareStatement