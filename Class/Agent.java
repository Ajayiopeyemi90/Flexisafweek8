public class Agent extends AbstractAgent {
    private String AgentLevel;
    private String AgentID;
    
    public Agent (String name, String DateOfBirth, int Experience, String Location, String AgentContractPeriod, String Agentlevel, 
    String AgentID){
        super(name, DateOfBirth, Experience, Location, AgentContractPeriod);
        this.AgentLevel = Agentlevel;
        this.AgentID = AgentID;
    }
    
     // Getter and Setter for AgentLevel
    public String getAgentLevel() {
        return AgentLevel;
    }

    public void setAgentLevel(String agentLevel) {
        this.AgentLevel = agentLevel;
    }

    // Getter and Setter for AgentID
    public String getAgentID() {
        return AgentID;
    }

    public void setAgentID(String agentID) {
        this.AgentID = agentID;
    }
    
     @Override
    public String toString() {
    return "Agent information:  \n Name =  " + getName() + "\n Date Of Birth =  " + getDateOfBirth() + 
    "\n Experience =  " + getExperience() +"years Experience" + "\n Agent location = " +
    getlocation() + "\n Agent Contract Period = " + getAgentContractPeriod() +
    "\n Agent Level = " + this.AgentLevel + "\n Agent ID = " + this.AgentID;
}
}