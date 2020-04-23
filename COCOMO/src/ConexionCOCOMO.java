import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexionCOCOMO {
    
    Connection cn;
    String bd = "taller";
    String url = "jdbc:mysql://127.0.0.1:3306/" + bd;
    String user = "dennis";
    String pass = "jhondennis";
    
    public Connection conectar()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = (Connection)DriverManager.getConnection(url,user,pass);            
        } catch (ClassNotFoundException|SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return cn;
    }
    
    public void desconectar()
    {
        try {
            cn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
