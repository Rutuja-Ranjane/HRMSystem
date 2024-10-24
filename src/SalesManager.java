public class SalesManager extends SalesRep 
{

    double salesbyteam;
    // System.out.println("the managers commision is ---------->" + salesbyteam);


    public SalesManager(String fname, String lname, int registration, int age, int daysWorked, int vacationDaysTaken,
            int yearWorked, double salary, String userName, String passWord, double salesMade, double salesbyteam) {
        super(fname, lname, registration, age, daysWorked, vacationDaysTaken, yearWorked, salary, userName, passWord,
                salesMade);
        this.salesbyteam = salesbyteam;
    }


    public void calculateCom()
    {
        // 0.03 * all sales made by team
        // return 0.03f*salesbyteam;
        System.out.println("the managers commision is ---------->" + 0.03f*salesbyteam);
     }

    
}
