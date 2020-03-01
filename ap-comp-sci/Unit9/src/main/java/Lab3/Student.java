package Lab3;

public abstract class Student {
    private String name;
    private String major;
    private int unitsTaken;

    //3-arg constructor
    public Student(String name, String major, int unitsTaken) {
        this.name = name;
        this.major = major;
        this.unitsTaken = unitsTaken;
    }

    //gets overriden in grad classes
    public abstract int calculateTuition(int units);


    //all getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getUnitsTaken() {
        return unitsTaken;
    }

    public void setUnitsTaken(int unitsTaken) {
        this.unitsTaken = unitsTaken;
    }

    //prints out all variables
    public String toString() {
        String output = "";
        output = "Name: " + name + "\n" +
                 "Major: " + major + "\n" +
                 "Units Taken: " + unitsTaken;
        return output;
    }
}
