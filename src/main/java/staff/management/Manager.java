package staff.management;

public class Manager extends staff.Employee {

    private String deptName;

    public Manager(String name, String ninumber, Double salary, String deptName) {
        super(name, ninumber, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }

    public Double raiseSalary(){
        return null;
    }

    public Double payBonus(){
        return super.getSalary() * 0.01;
    }

}
