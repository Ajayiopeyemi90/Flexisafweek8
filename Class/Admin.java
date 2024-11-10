public class Admin extends Employee{
    private String adminID;
    private String contactNumber;
    private String email; 
    
    public Admin (String adminID, String contactNumber, String email, String name, String DateOfBirth, int Experience){
        super(name, DateOfBirth, Experience);
        this.adminID = adminID;
        this.contactNumber = contactNumber;
        this.email = email;
    }
    
    // getter and setter for adminID
    public String getadminID(){
        return adminID;
    }
    
    public void setadminID(String adminID){
        this.adminID = adminID;
    }
    
     // getter and setter for contactNumber
    public String getcontactNumber(){
        return contactNumber;
    }
    
    public void setcontactNumber(String contactNumber){
        this.contactNumber = contactNumber;
    }
    
    // getter and setter for email
    public String getemail(){
        return email;
    }
    
    public void setemail(String email){
        this.email = email;
    }
    
    @Override
    public String toString() {
    return "Admin information:  \n Admin ID =  " + this.adminID + "\n Contact =  " + this.contactNumber + "\n E-mail =  " + 
    this.email + "\n Name =  " + getName() + "\n Date Of Birth =  " + getDateOfBirth() + "\n Experience =  " + getExperience() +"years Experience";
}

}