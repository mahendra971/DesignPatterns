package SingleTon;

public class DbSingleTonDemo {

    public static void main(String[] args){

        DBSingleTon ob = DBSingleTon.getIntstance();
        System.out.println(ob.hashCode());
        DBSingleTon ob1 = DBSingleTon.getIntstance();
        System.out.println(ob1.hashCode());

    }
}
