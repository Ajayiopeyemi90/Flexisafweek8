public class Finance extends Employee {
    private String AccountWorking;
    private String ProfessionalExam;
    
    public Finance(String name, String DateOfBirth, int Experience, String AccountWorking, String ProfessionalExam){
        super(name, DateOfBirth, Experience);
        this.AccountWorking = AccountWorking;
        this.ProfessionalExam = ProfessionalExam;
    }
        // Getter and Setter for AccountWorking
    public String getAccountWorking() {
        return AccountWorking;
    }

    public void setAccountWorking(String accountWorking) {
        this.AccountWorking = accountWorking;
    }

    // Getter and Setter for ProfessionalExam
    public String getProfessionalExam() {
        return ProfessionalExam;
    }

    public void setProfessionalExam(String professionalExam) {
        this.ProfessionalExam = professionalExam;
    }
    
     @Override
    public String toString() {
    return "Finace Team information:  \n account Working on =  " + this.AccountWorking + "\n professional Exam =  " + this.ProfessionalExam + 
    "\n Name =  " + getName() + "\n Date Of Birth =  " + getDateOfBirth() + "\n Experience =  " + getExperience() +"years Experience";
}
    
}