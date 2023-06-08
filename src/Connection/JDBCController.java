package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCController {

    private final String url = "jdbc:mysql://localhost:3306/pk2"
            +"?serverTimezone=Asia/Seoul&characterEncoding=UTF-8";
    private final String root = "root";
    private final String password = "1q2w3e4r";

    public Connection getConn(){
        Connection conn;

        try {
            conn= DriverManager.getConnection(url,root,password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("연동 성공");

        return conn;
    }

}
