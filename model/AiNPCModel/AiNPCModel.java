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
    }

// Constructor with name, ID, and role

    public AiNPCModel(String aiNPCName, int aiNPCID, EnumBody.aiNPC aiNPCRole) {
        this.aiNPCName = aiNPCName;
        this.aiNPCID = aiNPCID;
        this.aiNPCRole = aiNPCRole;
    }

// Constructor with name, ID, role, and stats

    public AiNPCModel(String aiNPCName, int aiNPCID, EnumBody.aiNPC aiNPCRole, int aiNPCFCT, int aiNPCADP, int aiNPCAGL, int aiNPCCOM) {
        this.aiNPCName = aiNPCName;
        this.aiNPCID = aiNPCID;
        this.aiNPCRole = aiNPCRole;
        this.aiNPCFCT = aiNPCFCT;
        this.aiNPCADP = aiNPCADP;
        this.aiNPCAGL = aiNPCAGL;
        this.aiNPCCOM = aiNPCCOM;
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

    public void setAiNPCFCT(int aiNPCFCT) {
        this.aiNPCFCT = aiNPCFCT;
    }

    public void setAiNPCADP(int aiNPCADP) {
        this.aiNPCADP = aiNPCADP;
    }

    public void setAiNPCAGL(int aiNPCAGL) {
        this.aiNPCAGL = aiNPCAGL;
    }

    public void setAiNPCCOM(int aiNPCCOM) {
        this.aiNPCCOM = aiNPCCOM;
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

