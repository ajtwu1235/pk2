package Repository;

import Connection.JDBCController;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductRepository {

    public void insertProduct(String name, int price, int count){
        Connection conn = new JDBCController().getConn();

        String sql ="insert into product (p_name,price,count) values (?,?,?);";

        try {
            PreparedStatement psmt = conn.prepareStatement(sql);
            psmt.setString(1,name);
            psmt.setInt(2,price);
            psmt.setInt(3,count);
            psmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
