package engenharia.cine.festa.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

/**
 *
 * @author LuisFernando
 */
public class ConexaoUtil {

    private static ConexaoUtil _conexaoUtil;
    private static ResourceBundle _config;

    private ConexaoUtil() {
        _config = ResourceBundle.getBundle("config");
    }

    public static ConexaoUtil getInstance() {
        if (_conexaoUtil == null) {
            _conexaoUtil = new ConexaoUtil();
        }
        return _conexaoUtil;
    }

    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName(_config.getString("engenharia.cine.festa.db.driver.mysql"));
        return DriverManager.getConnection(
                _config.getString("engenharia.cine.festa.db.url.conexao"),
                _config.getString("engenharia.cine.festa.db.usuario"),
                _config.getString("engenharia.cine.festa.db.senha")
        );
    }
}
