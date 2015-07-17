package Main;

public abstract class ConnectionDetails {
    public static String databaseName = "substi";
    public static String pass = "";
    public static String user = "root";
    
    public static void chcgDB(String x, String y, String z){
        ConnectionDetails.databaseName = x;
        ConnectionDetails.pass = z;
        ConnectionDetails.user = y;
    }
    
    public static String db(){
        return databaseName;
    }
    public static String pw(){
        return pass;
    }
    public static String un(){
        return user;
    }
}
