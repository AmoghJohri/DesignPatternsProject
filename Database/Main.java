package Database;
// to test the QuestionDatabaseConnectionPool singleton
public class Main {
    public static void main(String[] args)
    {
        QuestionDatabaseConnectionPool pool1 = QuestionDatabaseConnectionPool.getConnectionPool(); // called once
        QuestionDatabaseConnectionPool pool2 = QuestionDatabaseConnectionPool.getConnectionPool(); // called twice
        pool1.showConnectionPoolStatus();    
        pool2.showConnectionPoolStatus();    
        // occupying connections repeatedly without releasing
        for(int i = 0; i < 10; i++)
        {
            System.out.println(pool1.getConnection());
            System.out.println(pool2.getConnection());
        }
    }
}
