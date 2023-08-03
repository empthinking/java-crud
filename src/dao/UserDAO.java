package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import factory.ConnectionFactory;
import model.User;
import model.UserTable;

public class UserDAO {
    private Connection conn;
//  private User u; 
    private UserTable ut;

    public UserDAO() throws SQLException {
        ut = new UserTable();
        conn = new ConnectionFactory().getConnection();
    }

    public boolean add(User u) {
        String sql = String.format("INSERT INTO %s(%s, %s, %s) VALUES (?, ?, ?, ?)", ut.getTitle(), ut.getNameColumn(), ut.getCpfColumn(), ut.getEmailColumn(), ut.getNumberColumn());
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, u.getName());
            stmt.setString(2, u.getCpf());
            stmt.setString(3, u.getEmail());
            stmt.setString(4, u.getNumber());
            stmt.execute();
            stmt.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void close() throws SQLException {
        conn.close();
    }
}
