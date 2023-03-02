package spaceCthulhu.model.AiNPCModel;

import spaceCthulhu.model.enums.EnumBody;

public class AiNPCModel {

//Variables for the AiNPCModel class

    private String aiNPCName;
    private int aiNPCID;
    private EnumBody.aiNPC aiNPCRole;

    // this set of variables represents the following AI NPC stats:
    // Functionality (FCT): representing the AI's ability to perform their job as described by their programming.
    // Adaptability (ADP): representing the AI's ability to do and learn things not related to their programming.
    // Agility (AGL): representing the AI's ability to act and react dynamically.
    // Communication (COM): representing the AI's ability to communicate with other beings or machines effectively.
    private int statFCT = 10;
    private int statADP = 10;
    private int statAGL = 10;
    private int statCOM = 10;

//Constructors for the AiNPCModel class

    // Default constructor
    public AiNPCModel() {
    }

    // Constructor with only name and ID
    public AiNPCModel(String aiNPCName, int aiNPCID) {
        this.aiNPCName = aiNPCName;
        this.aiNPCID = aiNPCID;
        this.setStats(50, 50, 50, 50);
    }

    // Constructor with name, ID, and role
    public AiNPCModel(String aiNPCName, int aiNPCID, EnumBody.aiNPC aiNPCRole) {
        this.aiNPCName = aiNPCName;
        this.aiNPCID = aiNPCID;
        this.aiNPCRole = aiNPCRole;
        this.setStats(50, 50, 50, 50);
    }

    // Constructor with name, ID, role, and stats
    public AiNPCModel(String aiNPCName, int aiNPCID, EnumBody.aiNPC aiNPCRole, int aiNPCFCT, int aiNPCADP, int aiNPCAGL, int aiNPCCOM) {
        this.aiNPCName = aiNPCName;
        this.aiNPCID = aiNPCID;
        this.aiNPCRole = aiNPCRole;
        this.setStats(aiNPCFCT, aiNPCADP, aiNPCAGL, aiNPCCOM);

    }


//Getters

    public String getAiNPCName() {
        return aiNPCName;
    }

    public int getAiNPCID() {
        return aiNPCID;
    }

    public EnumBody.aiNPC getAiNPCRole() {
        return aiNPCRole;
    }

    public int getStatFCT() {
        return statFCT;
    }

    public int getStatADP() {
        return statADP;
    }

    public int getStatAGL() {
        return statAGL;
    }

    public int getStatCOM() {
        return statCOM;
    }

//Setters
    
    public void setAiNPCName(String aiNPCName) {
        this.aiNPCName = aiNPCName;
    }

    public void setAiNPCID(int aiNPCID) {
        this.aiNPCID = aiNPCID;
    }

    public void setAiNPCRole(EnumBody.aiNPC aiNPCRole) {
        this.aiNPCRole = aiNPCRole;
    }

    
// a function that sets the AI NPC stat FCT to the value passed in the parameter, but only if it is between 10 and 90
    public void setStatFCT(int aiNPCFCT) {
        try {
            this.statFCT = Math.min(Math.max(aiNPCFCT, 10), 90);
        } catch (Exception e) {
            this.statFCT = 10;
        }
    }

// a function that sets the AI NPC stat ADP to the value passed in the parameter, but only if it is between 10 and 90
    public void setStatADP(int aiNPCADP) {
        try {
            this.statADP = Math.min(Math.max(aiNPCADP, 10), 90);
        } catch (Exception e) {
            this.statADP = 10;
        }
    }

// a function that sets the AI NPC stat AGL to the value passed in the parameter, but only if it is between 10 and 90
    public void setStatAGL(int aiNPCAGL) {
        try {
            this.statAGL = Math.min(Math.max(aiNPCAGL, 10), 90);
        } catch (Exception e) {
            this.statAGL = 10;
        }
    }   

// a function that sets the AI NPC stat COM to the value passed in the parameter, but only if it is between 10 and 90
    public void setStatCOM(int aiNPCCOM) {
        try {
            this.statCOM = Math.min(Math.max(aiNPCCOM, 10), 90);
        } catch (Exception e) {
            this.statCOM = 10;
        }
    }

// a function that sets the AI NPC stats to the values passed in the parameters, but only if they are between 10 and 90
    public void setStats(int aiNPCFCT, int aiNPCADP, int aiNPCAGL, int aiNPCCOM) {
        try {
            this.setStatFCT(aiNPCFCT);
            this.setStatADP(aiNPCADP);
            this.setStatAGL(aiNPCAGL);
            this.setStatCOM(aiNPCCOM);
        } catch (Exception e) {
            System.out.println("Error setting AI NPC stats: " + e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "AiNPCModel{" + "aiNPCName=" + aiNPCName + ", aiNPCID=" + aiNPCID + ", aiNPCRole=" + aiNPCRole + ", statFCT=" + statFCT + ", statADP=" + statADP + ", statAGL=" + statAGL + ", statCOM=" + statCOM + '}';
    }   



}

