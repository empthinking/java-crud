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

    public ConnectionFactory(String ip, String port, String db, String user, String password ) {
        this.ip = ip;
        this.port = port;
        this.db = db;
        this.user = user;
        this.password = password;
    }
}
