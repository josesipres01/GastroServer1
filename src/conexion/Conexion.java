package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author 222206941 JOSE GUADALUPE VENEGAS SIPRES
 */
public class Conexion {

  private final String HOST="localhost";
  private final String PUERTO="5432";
  private final String DB="GastrocServer";
  private final String USER="postgres";
  private final String PASSWORD="sono1306";
  
  public Connection getConnection(){
      Connection conexion= null;
      
      
      try{
        Class.forName("org.postgresql.Driver");
        String url="jdbc:postgresql://"+HOST+":"+PUERTO+"/"+DB;
        conexion= (Connection) DriverManager.getConnection(url,USER,PASSWORD);
          JOptionPane.showMessageDialog(null, "Conexion exitosa");
      }catch(Exception e){
          JOptionPane.showMessageDialog(null, e.getMessage());
      }
      
      return conexion;
  }
    
}
