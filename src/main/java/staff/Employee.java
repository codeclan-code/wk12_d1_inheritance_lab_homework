package staff;

public abstract class Employee {
    private String name;
    private String ninumber;
    private Double salary;

    public Employee(String name, String ninumber, Double salary){
        this.name = name;
        this.ninumber = ninumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNinumber() {
        return ninumber;
    }

    public Double getSalary() {
        return salary;
    }

    public abstract Double raiseSalary();

    public abstract Double payBonus();
    }

