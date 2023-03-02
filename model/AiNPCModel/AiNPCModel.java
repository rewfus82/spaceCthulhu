package spaceCthulhu.model.AiNPCModel;

import spaceCthulhu.model.enums.EnumBody;

public class AiNPCModel {
    private String aiNPCName;
    private int aiNPCID;
    //* a variable for the aiNPC's role that is defined by the aiNPC enum */
    private EnumBody.aiNPC aiNPCRole;

    //* this set of variables represents the following AI NPC stats:
    // Functionality (FCT): representing the AI's ability to perform their job as described by their programming.
    // Adaptability (ADP): representing the AI's ability to do and learn things not related to their programming.
    // Agility (AGL): representing the AI's ability to act and react dynamically.
    // Communication (COM): representing the AI's ability to communicate with other beings or machines effectively.

    private int aiNPCFCT;
    private int aiNPCADP;
    private int aiNPCAGL;
    private int aiNPCCOM;
    
    public AiNPCModel() {
    }

// Constructor with only name and ID

    public AiNPCModel(String aiNPCName, int aiNPCID) {
        this.aiNPCName = aiNPCName;
        this.aiNPCID = aiNPCID;
        this.setAiNPCStats(50, 50, 50, 50);

    }

// Constructor with name, ID, and role

    public AiNPCModel(String aiNPCName, int aiNPCID, EnumBody.aiNPC aiNPCRole) {
        this.aiNPCName = aiNPCName;
        this.aiNPCID = aiNPCID;
        this.aiNPCRole = aiNPCRole;
        this.setAiNPCStats(50, 50, 50, 50);
    }

// Constructor with name, ID, role, and stats

    public AiNPCModel(String aiNPCName, int aiNPCID, EnumBody.aiNPC aiNPCRole, int aiNPCFCT, int aiNPCADP, int aiNPCAGL, int aiNPCCOM) {
        this.aiNPCName = aiNPCName;
        this.aiNPCID = aiNPCID;
        this.aiNPCRole = aiNPCRole;
        this.setAiNPCStats(aiNPCFCT, aiNPCADP, aiNPCAGL, aiNPCCOM);

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

    public int getAiNPCFCT() {
        return aiNPCFCT;
    }

    public int getAiNPCADP() {
        return aiNPCADP;
    }

    public int getAiNPCAGL() {
        return aiNPCAGL;
    }

    public int getAiNPCCOM() {
        return aiNPCCOM;
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
            this.aiNPCFCT = Math.min(Math.max(aiNPCFCT, 10), 90);
        } catch (Exception e) {
            System.out.println("Error setting AI NPC FCT: " + e.getMessage());
        }
    }

// a function that sets the AI NPC stat ADP to the value passed in the parameter, but only if it is between 10 and 90
    public void setStatADP(int aiNPCADP) {
        try {
            this.aiNPCADP = Math.min(Math.max(aiNPCADP, 10), 90);
        } catch (Exception e) {
            System.out.println("Error setting AI NPC ADP: " + e.getMessage());
        }
    }

// a function that sets the AI NPC stat AGL to the value passed in the parameter, but only if it is between 10 and 90
    public void setStatAGL(int aiNPCAGL) {
        try {
            this.aiNPCAGL = Math.min(Math.max(aiNPCAGL, 10), 90);
        } catch (Exception e) {
            System.out.println("Error setting AI NPC AGL: " + e.getMessage());
        }
    }

// a function that sets the AI NPC stat COM to the value passed in the parameter, but only if it is between 10 and 90
    public void setStatCOM(int aiNPCCOM) {
        try {
            this.aiNPCCOM = Math.min(Math.max(aiNPCCOM, 10), 90);
        } catch (Exception e) {
            System.out.println("Error setting AI NPC COM: " + e.getMessage());
        }
    }

// a function that sets the AI NPC stats to the values passed in the parameters, but only if they are between 10 and 90
    public void setStats(int aiNPCFCT, int aiNPCADP, int aiNPCAGL, int aiNPCCOM) {
        try {
            this.aiNPCFCT = Math.min(Math.max(aiNPCFCT, 10), 90);
            this.aiNPCADP = Math.min(Math.max(aiNPCADP, 10), 90);
            this.aiNPCAGL = Math.min(Math.max(aiNPCAGL, 10), 90);
            this.aiNPCCOM = Math.min(Math.max(aiNPCCOM, 10), 90);
        } catch (Exception e) {
            System.out.println("Error setting AI NPC stats: " + e.getMessage());
        }
    }
    

    
    



    @Override

    public String toString() {
        return "AiNPCModel{" +
                "aiNPCName='" + aiNPCName + '\'' +
                ", aiNPCID=" + aiNPCID +
                ", aiNPCRole=" + aiNPCRole +
                ", aiNPCFCT=" + aiNPCFCT +
                ", aiNPCADP=" + aiNPCADP +
                ", aiNPCAGL=" + aiNPCAGL +
                ", aiNPCCOM=" + aiNPCCOM +
                '}';
    }




}

