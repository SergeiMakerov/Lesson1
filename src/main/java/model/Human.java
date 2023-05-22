package model;

public class Human {
    private String name;
    private String gender;
    private int age;
    private PassportData data;

    public Human(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
