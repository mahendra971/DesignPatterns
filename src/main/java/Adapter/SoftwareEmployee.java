package Adapter;

public class SoftwareEmployee implements Employee {
    private int age;
    private String name;
    private String email;

    SoftwareEmployee(int age,String name, String email)
    {
        this.age=age;
        this.name=name;
        this.email=email;

    }
    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String toString()
    {
        return  age +"---" + name +"---" + email;
    }
}
