// import java.math.min;
public class Employee implements userInterface 
{
    String fname, lname;
    int registration,age,daysWorked,vacationDaysTaken,yearWorked;
    double salary;
    private String UserName;
    private String passWord;


    public Employee(String fname, String lname, int registration, int age, int daysWorked, int vacationDaysTaken,
            int yearWorked, double salary, String userName, String passWord) {
        this.fname = fname;
        this.lname = lname;
        this.registration = registration;
        this.age = age;
        this.daysWorked = daysWorked;
        this.vacationDaysTaken = vacationDaysTaken;
        this.yearWorked = yearWorked;
        this.salary = salary;
        this.UserName = userName;
        this.passWord = passWord;
    }
    @Override
    public boolean login(String username,String password){
        return this.UserName.equals(username)&&this.passWord.equals(password);
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
