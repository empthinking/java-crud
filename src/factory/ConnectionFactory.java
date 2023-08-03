package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory {
    private String db;
    private String ip;
    private String port;
    private String user;
    private String password;
    private String url;

    public Connection getConnection() throws SQLException {
        this.url = "jbdc:mysql://" + ip + ":" + port + "/" + db;
        return DriverManager.getConnection(url, user, password);
    }

    public ConnectionFactory() {
        ip = "localhost";
        port = "3305";
        db = "JAVACRUD";
        user = "root";
        password = "";
    }
}
