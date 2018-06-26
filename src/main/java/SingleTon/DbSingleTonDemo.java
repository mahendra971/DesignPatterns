package SingleTon;

public class DbSingleTonDemo {

    public static void main(String[] args){

        DBSingleTon ob = DBSingleTon.getIntstance();
        System.out.println(ob.hashCode());
        DBSingleTon ob1 = DBSingleTon.getIntstance();
        System.out.println(ob1.hashCode());
        
        System.out.println("Testing Git");
        
        ThreadSafeSingleTon tob = ThreadSafeSingleTon.getInstance();
        System.out.println(tob.hashCode());
        System.out.println(tob);
        ThreadSafeSingleTon tob1 = ThreadSafeSingleTon.getInstance();
        System.out.println(tob1.hashCode());
        System.out.println(tob1);

    }
}
