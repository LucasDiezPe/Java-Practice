import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AdministradorDeConexiones {
    public static Connection obtenerConexion () throws SQLException, ClassNotFoundException {
        //Establecer el nombre del Driver
        String DBDriver="com.mysql.cj.jdbc.Driver";
        //Establecer la URL y BASE de datos a  utiliar
        String DBConnLine="jdbc:mysql://localhost:3306/refugiocanino";
        //Establecer el Usuario de la DB
        String DBUser="root";
        //Establecer la Contraseña de la DB
        String DBPassword="root";
        //Establecer conexion con Driver
        Class.forName(DBDriver);
        //Retornar Conexion
        Connection conn= DriverManager.getConnection(DBConnLine,DBUser,DBPassword);
        return conn;
    }
}
