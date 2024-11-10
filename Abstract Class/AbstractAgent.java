public abstract class AbstractAgent extends Employee{
    private String Location;
    private String AgentContractPeriod;
    
    public AbstractAgent(String name, String DateOfBirth, int Experience, String Location, String AgentContractPeriod){
        super(name, DateOfBirth, Experience);
        this.Location = Location;
        this.AgentContractPeriod = AgentContractPeriod;
    }
    
    public String getlocation(){
        return Location;
    }
    
    public String getAgentContractPeriod(){
        return AgentContractPeriod;
    }
    
    public void setLocation(String Location){
        this.Location = Location;
    }
    
    public void setAgentContractPeriod(String AgentContractPeriod){
        this.AgentContractPeriod = AgentContractPeriod;
    }
    
}