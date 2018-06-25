package SingleTon;

public class DBSingleTon {

    private  static  DBSingleTon intstance = new DBSingleTon();

    private DBSingleTon()
    {

    }
    public static DBSingleTon getIntstance()
    {
        return  intstance;
    }
}
