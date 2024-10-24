// import java.math.*;
public class SalesRep extends Employee {

    private double salesMade;
    
    public SalesRep(String fname, String lname, int registration, int age, int daysWorked, int vacationDaysTaken,
            int yearWorked, double salary, String userName, String passWord, double salesMade) {
        super(fname, lname, registration, age, daysWorked, vacationDaysTaken, yearWorked, salary, userName, passWord);
        this.salesMade = salesMade;
    }

    public double getSalesMade() {
        return salesMade;
    }

    public void setSalesMade(double salesMade) {
        this.salesMade = salesMade;
    }
    public double calculateComission(){
        // comission = 0.1 * salesMade
        return  (int)0.1 * (int)salesMade;
    }
    public void profileVisit(){
        System.out.println("*********Profile of= "+ fname + "***********");
        System.out.println("Full Name= " +fname+" "+lname);
        System.out.println("Registration number= " + registration);
        System.out.println("Age= " + age);
        System.out.println("Sales made= "+salesMade);
        System.out.println("Total Commision Earned= "+ calculateComission());
        System.out.println("Profile Closed");
    }
    
}
