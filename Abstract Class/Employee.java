public abstract class Employee{
    private String Name;
    private String DateOfBirth;
    private int Experience;
    
    public Employee(String name, String DateOfBirth, int Experience){
        this.Name = name ;
        this.DateOfBirth = DateOfBirth;
        this.Experience = Experience;
    }
    
    
    // Getters
    public String getName() {
        return Name;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public int getExperience() {
        return Experience;
    }
}