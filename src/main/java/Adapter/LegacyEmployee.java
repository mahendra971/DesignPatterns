package Adapter;

public class LegacyEmployee {
    private int emplage;
    private String emplName;
    private String emplAddress;

    LegacyEmployee(int age, String name, String address) {
        emplage = age;
        emplName = name;
        emplAddress = address;

    }

    public int getemplAge() {
        return emplage;
    }

    public String getemplName()
    {
        return emplName;
    }

    public String getEmplAddress()
    {
        return emplAddress;
    }
}
