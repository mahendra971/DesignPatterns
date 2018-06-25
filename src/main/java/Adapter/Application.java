package Adapter;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String args[])
    {
        System.out.println("Starting application");
        List<Employee> empl = new ArrayList<Employee>();

        empl.add(new SoftwareEmployee(12,"mahendra","mahendra.971@gmail.com"));
        empl.add(new SoftwareEmployee(21,"mahe","mahendra@gmail.com"));
        empl.add(new EmployeeAdapter(new LegacyEmployee(20,"me","mahe@gmail.com")));
        System.out.println(empl);
    }
}
