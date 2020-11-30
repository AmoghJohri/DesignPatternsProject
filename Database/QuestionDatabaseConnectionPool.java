package Database;
import  java.util.ArrayList;
// sigleton for pool of open database connection
public class QuestionDatabaseConnectionPool
{
    private static QuestionDatabaseConnectionPool connectionPool = null;    // single instance
    private        Integer                        numberOfConnections = 10; // number of open connections
    private        ArrayList<Boolean>             connections;              // open connections have been mocked by an array of bool (true == connection available)

    private        QuestionDatabaseConnectionPool(){}                       // private constructor

    public  static QuestionDatabaseConnectionPool getConnectionPool()       // getting the connection pool
    {
        if(connectionPool == null)                                          // instantiates only if this has been called for the first time
        {   
            connectionPool             = new QuestionDatabaseConnectionPool();  
            connectionPool.connections = new ArrayList<Boolean>();
            for(int i = 0; i < connectionPool.numberOfConnections; i++)
            {
                connectionPool.connections.add(true);
            }
        }
        return connectionPool;                                              // returns the connection pool
    }

    // explicitly releasing the connection (client needs to do this when they are done using the connection)
    public void releaseConnection(Integer i)
    {
        connectionPool.connections.set(i, true);
    }

    // getting an open connection
    public Integer getConnection()
    {
        // searching through the pool for an open connection
        // returns the index of the connection if found, otherwise returns -1
        for(int i = 0; i < connectionPool.numberOfConnections; i++)
        {
            // if an open connection is found, the entry is set to false
            // and the index is returned
            if(connectionPool.connections.get(i))
            {
                connectionPool.connections.set(i, false);
                return i;
            }
        }
        return -1;
    }

    // shows the status of the connections
    // i.e., shows how and which connections and free/occupied
    public void showConnectionPoolStatus()
    {
        for(int i = 0; i < connectionPool.numberOfConnections; i++)
        {
            System.out.print(connectionPool.connections.get(i).toString() + " ");
        }
        System.out.println();
    }
}