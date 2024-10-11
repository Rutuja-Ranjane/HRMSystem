// import java.math.*;
public class SalesRep extends Employee {

    private double salesMade;

    public SalesRep(String fname, String lname, int registration, int age, int daysWorked, int vacationDaysTaken,
            double salary, int yearWorked, double salesMade) {
        super(fname, lname, registration, age, daysWorked, vacationDaysTaken, salary, yearWorked);
        this.salesMade = salesMade;
    }

    public double calculateComission(){
        // comission = 0.1 * salesMade
        return  (int)0.1 * (int)salesMade;
    }

    public double getSalesMade() {
        return salesMade;
    }

    public void setSalesMade(double salesMade) {
        this.salesMade = salesMade;
    }
    
}
