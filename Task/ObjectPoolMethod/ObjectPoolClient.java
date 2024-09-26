import PoolObject.DBConnection;
import PoolObject.DBConnectionPool;

public class ObjectPoolClient {
    public static void main(String arg[]) throws InterruptedException{
        DBConnectionPool pool = new DBConnectionPool(5);

        // Borrow 
        DBConnection conn1 = pool.borrowObjects();
        DBConnection conn2 = pool.borrowObjects();
        

        // Return 
        pool.returnObject(conn1);
        pool.returnObject(conn2);
    }
}
