package Database;
public class Main {
    public static void main(String[] args)
    {
        QuestionDatabaseConnectionPool pool1 = QuestionDatabaseConnectionPool.getConnectionPool();
        QuestionDatabaseConnectionPool pool2 = QuestionDatabaseConnectionPool.getConnectionPool();
        pool1.showConnectionPoolStatus();    
        pool2.showConnectionPoolStatus();    
        for(int i = 0; i < 10; i++)
        {
            System.out.println(pool1.getConnection());
            System.out.println(pool2.getConnection());
        }
    }
}
