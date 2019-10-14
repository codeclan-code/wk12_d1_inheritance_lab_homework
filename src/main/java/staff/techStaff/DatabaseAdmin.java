package staff.techStaff;

public class DatabaseAdmin extends staff.Employee  {

    public DatabaseAdmin(String name, String ninumber, Double salary){
        super(name,ninumber,salary);
    }

    public Double raiseSalary(){
        return super.getSalary() * 2;
    }

    public Double payBonus(){
        return super.getSalary() * 0.01;
    }
}
