package Adapter;

public class EmployeeAdapter implements  Employee {
    LegacyEmployee emp;
    EmployeeAdapter( LegacyEmployee empl)
    {
        this.emp = empl;
    }
    public int getAge() {
        return emp.getemplAge();
    }

    public String getName() {
        return emp.getemplName();
    }

    public String getEmail() {
        return emp.getEmplAddress();
    }
}
