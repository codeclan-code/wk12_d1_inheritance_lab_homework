package staff.techStaff;

public class Developer extends staff.Employee  {

    public Developer(String name, String ninumber, Double salary){
        super(name,ninumber,salary);
    }

    public Double raiseSalary(){
        return null;
    }

    public Double payBonus(){
        return super.getSalary() * 0.01;
    }
}
