package Database;
import java.util.ArrayList;
public class QuestionDatabaseConnectionPool
{
    private static QuestionDatabaseConnectionPool connectionPool = null;
    private        Integer                        numberOfConnections = 10;
    private        ArrayList<Boolean>             connections;

    private        QuestionDatabaseConnectionPool(){}

    public  static QuestionDatabaseConnectionPool getConnectionPool()
    {
        if(connectionPool == null)
        {   
            connectionPool             = new QuestionDatabaseConnectionPool();  
            connectionPool.connections = new ArrayList<Boolean>();
            for(int i = 0; i < connectionPool.numberOfConnections; i++)
            {
                connectionPool.connections.add(true);
            }
        }
        return connectionPool;
    }

    public void releaseConnection(Integer i)
    {
        connectionPool.connections.set(i, true);
    }

    public Integer getConnection()
    {
        for(int i = 0; i < connectionPool.numberOfConnections; i++)
        {
            if(connectionPool.connections.get(i))
            {
                connectionPool.connections.set(i, false);
                return i;
            }
        }
        return -1;
    }

    public void showConnectionPoolStatus()
    {
        for(int i = 0; i < connectionPool.numberOfConnections; i++)
        {
            System.out.print(connectionPool.connections.get(i).toString() + " ");
        }
        System.out.println();
    }
}