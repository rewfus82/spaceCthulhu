package spaceCthulhu.model.AiNPCModel;

import spaceCthulhu.model.enums.EnumBody;

public class AiNPCModel {

    // Variables for the AiNPCModel class

    private String name;
    private int ID;
    private EnumBody.aiNPC role;

    // this set of variables represents the following AI NPC stats:
    // Functionality (FCT): representing the AI's ability to perform their job as
    // described by their programming.
    // Adaptability (ADP): representing the AI's ability to do and learn things not
    // related to their programming.
    // Agility (AGL): representing the AI's ability to act and react dynamically.
    // Communication (COM): representing the AI's ability to communicate with other
    // beings or machines effectively.

    private int statFCT = 10;
    private int statADP = 10;
    private int statAGL = 10;
    private int statCOM = 10;

    // Constructors for the AiNPCModel class

    // Default constructor
    public AiNPCModel() {
    }

    // Constructor with only name and ID
    public AiNPCModel(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    // Constructor with name, ID, and role
    public AiNPCModel(String name, int ID, EnumBody.aiNPC role) {
        this.name = name;
        this.ID = ID;
        this.role = role;
    }

    // Constructor with name, ID, role, and stats
    public AiNPCModel(String name, int ID, EnumBody.aiNPC role, int statFCT, int statADP, int statAGL, int statCOM) {
        this.name = name;
        this.ID = ID;
        this.role = role;
        this.statFCT = statFCT;
        this.statADP = statADP;
        this.statAGL = statAGL;
        this.statCOM = statCOM;
    }

    // Getters

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public EnumBody.aiNPC getRole() {
        return role;
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

    // Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setRole(EnumBody.aiNPC role) {
        this.role = role;
    }

    // a function that sets the AI NPC stat FCT to the value passed in the
    // parameter, but only if it is between 10 and 90
    public void setStatFCT(int statFCT) {
        try {
            this.statFCT = Math.min(Math.max(statFCT, 10), 90);
        } catch (Exception e) {
            this.statFCT = 10;
        }
    }

    // a function that sets the AI NPC stat ADP to the value passed in the
    // parameter, but only if it is between 10 and 90
    public void setStatADP(int statADP) {
        try {
            this.statADP = Math.min(Math.max(statADP, 10), 90);
        } catch (Exception e) {
            this.statADP = 10;
        }
    }

    // a function that sets the AI NPC stat AGL to the value passed in the
    // parameter, but only if it is between 10 and 90
    public void setStatAGL(int statAGL) {
        try {
            this.statAGL = Math.min(Math.max(statAGL, 10), 90);
        } catch (Exception e) {
            this.statAGL = 10;
        }
    }

    // a function that sets the AI NPC stat COM to the value passed in the
    // parameter, but only if it is between 10 and 90
    public void setStatCOM(int statCOM) {
        try {
            this.statCOM = Math.min(Math.max(statCOM, 10), 90);
        } catch (Exception e) {
            this.statCOM = 10;
        }
    }

    // a function that sets the AI NPC stats to the values passed in the parameters,
    // but only if they are between 10 and 90
    public void setStats(int statFCT, int statADP, int statAGL, int statCOM) {
        try {
            this.statFCT = Math.min(Math.max(statFCT, 10), 90);
            this.statADP = Math.min(Math.max(statADP, 10), 90);
            this.statAGL = Math.min(Math.max(statAGL, 10), 90);
            this.statCOM = Math.min(Math.max(statCOM, 10), 90);
        } catch (Exception e) {
            this.statFCT = 10;
            this.statADP = 10;
            this.statAGL = 10;
            this.statCOM = 10;
        }
    }

    // a function that sets the AI NPC stats to the values passed in the parameters,
    // but only if they are between 10 and 90
    public void setStats(int[] stats) {
        try {
            this.statFCT = Math.min(Math.max(stats[0], 10), 90);
            this.statADP = Math.min(Math.max(stats[1], 10), 90);
            this.statAGL = Math.min(Math.max(stats[2], 10), 90);
            this.statCOM = Math.min(Math.max(stats[3], 10), 90);
        } catch (Exception e) {
            this.statFCT = 10;
            this.statADP = 10;
            this.statAGL = 10;
            this.statCOM = 10;
        }
    }

    // a function that returns the AI NPC's stats as an array of integers
    public int[] getStats() {
        int[] stats = { statFCT, statADP, statAGL, statCOM };
        return stats;
    }

    // a function that returns the AI NPC's stats as a string
    public String getStatsString() {
        return "FCT: " + statFCT + " ADP: " + statADP + " AGL: " + statAGL + " COM: " + statCOM;
    }
    
    @Override
    public String toString() {
        return "AiNPCModel{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", role=" + role +
                ", statFCT=" + statFCT +
                ", statADP=" + statADP +
                ", statAGL=" + statAGL +
                ", statCOM=" + statCOM +
                '}';

    }
}
