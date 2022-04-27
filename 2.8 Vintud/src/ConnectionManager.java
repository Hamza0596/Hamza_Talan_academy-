import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager { 
	
	/** Constructeur priv� */
	private ConnectionManager()
    {}

	  /** Instance unique non pr�initialis�e */
    private static ConnectionManager INSTANCE = null;
	
	private static String url = "#####...";
    private static String driverName = "org.postgresql.Driver";
    private static String username = "postgres";
    private static String password = "123456";
    private static Connection con;
    private static String urlstring ="jdbc:postgresql://localhost:5432/vintud";
    
    
  
    
    
    /** Point d'acc�s pour l'instance unique du singleton */
    public static ConnectionManager getInstance()
    {   
        if (INSTANCE == null)
        {   
            synchronized(ConnectionManager.class)
            {
                if (INSTANCE == null)
                {   INSTANCE = new ConnectionManager();
                }
            }
        }
        return INSTANCE;
    }
    
    
    
    


    public  Connection getConnection() {
        try {
            Class.forName(driverName);
            try {
                con = DriverManager.getConnection(urlstring, username, password);
            } catch (SQLException ex) {
                // log an exception. fro example:
                System.out.println("Failed to create the database connection.");
            }
        } catch (ClassNotFoundException ex) {
            // log an exception. for example:
            System.out.println("Driver not found.");
        }
        return con;
    }
}



