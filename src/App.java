public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


        SalesRep s1 = new SalesRep("A", "zzz", 10, 23, 730, 05, 30000.0, 2, 10000);
        System.out.println("name= "+s1.fname+" "+s1.lname);
        SalesRep s2=new SalesRep("B", "ss", 10, 30, 730, 05, 30000, 2, 20000);
        SalesRep s3=new SalesRep("C", "sss", 10, 30, 730, 05, 30000, 2, 30000);
         
        SalesManager sm = new SalesManager("xyz", "pqr", 10, 30, 730, 05, 30000, 2, 30000, s1.getSalesMade()+s2.getSalesMade()+s3.getSalesMade());
        sm.calculateCom();
    }
}
