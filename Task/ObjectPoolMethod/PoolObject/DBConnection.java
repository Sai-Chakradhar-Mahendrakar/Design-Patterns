package PoolObject;

public class DBConnection {
    private boolean inUse;

    public void connect(){
        System.out.println("Database Connected");
    }

    public void disconnect(){
        System.out.println("Database disconnected");
    }

    public boolean isInUse(){
        return this.inUse;
    }

    public void setInUse(boolean inUse){
        this.inUse = inUse;
    }
}
