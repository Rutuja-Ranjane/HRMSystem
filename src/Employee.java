// import java.math.min;
public class Employee 
{
    String fname, lname;
    int registration,age,daysWorked,vacationDaysTaken,yearWorked;
    double salary;


    public Employee(String fname, String lname, int registration, int age, int daysWorked, int vacationDaysTaken,double salary, int yearWorked) {
        this.fname = fname;
        this.lname = lname;
        this.registration = registration;
        this.age = age;
        this.daysWorked = daysWorked;
        this.vacationDaysTaken = vacationDaysTaken;
        this.salary = salary;
        this.yearWorked = yearWorked;
    }

    public int timeToRetirement(int age,int yearsWorked)
    {
        // time to retirement = min(60 - age, 40 - yearsWorked)
        return Math.min(60-age, 40 - yearsWorked);
    }
  
    public int vacationTimeLeft()
    {
        // vacation time left = (daysWorked/360)*(30 - vacationDaysTaken)
        return (daysWorked/360)*(30 - vacationDaysTaken);
    }
  
    public double calculateBonus()
    {
        // bonus = 2.2*salary
        return 2.2 * salary;
    }

}
