public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


        SalesRep s1 = new SalesRep("A", "zzz", 10, 23, 730, 05, 30000, 2, "aa", "1001", 200000);
        s1.profileVisit();
        SalesRep s2=new SalesRep("B", "ss", 10, 30, 730, 05, 30000, 2, "bbb","123",40000);
        s2.profileVisit();
        SalesRep s3 = new SalesRep("c", "sss", 10, 30, 730, 05, 30000, 2, "err", "45678", 30000);
        s3.profileVisit();
         
        SalesManager sm = new SalesManager("RR", "pqr", 10, 30, 730, 05, 30000, 2, "RR","7654", 30000, s1.getSalesMade()+s2.getSalesMade()+s3.getSalesMade());

        // sm.calculateCom();

        if(sm.login("RR", "7654")){
            sm.profileVisit();
        }
    }
}
