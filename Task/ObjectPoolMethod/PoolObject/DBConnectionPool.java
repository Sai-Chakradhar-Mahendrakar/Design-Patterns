package PoolObject;

public class DBConnectionPool extends ObjectPool<DBConnection> {

    public DBConnectionPool(int maxSize) {
        super(maxSize, new PoolObjectFactory<DBConnection>() {
            @Override
            public DBConnection createObject() {
                DBConnection connection = new DBConnection();
                connection.connect();
                return connection;
            }
        });
    }

    @Override
    public void returnObject(DBConnection connection) {
        connection.disconnect();
        super.returnObject(connection);
    }
}
