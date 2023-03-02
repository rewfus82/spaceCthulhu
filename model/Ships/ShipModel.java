package spaceCthulhu.model.Ships;

import spaceCthulhu.model.AiNPCModel.AiNPCModel;
import spaceCthulhu.model.Bays.ModularBayModel;
import spaceCthulhu.model.enums.EnumBody;
import spaceCthulhu.model.enums.EnumBody.aiRole;

import java.lang.Math;

public class ShipModel {

    protected int shipID;
    protected String shipName;
    protected AiNPCModel[] aiSlots;
    protected int passengerCapacity;
    protected EnumBody.shipSize shipSize;
    protected EnumBody.shipClass shipClass;
    protected ModularBayModel[] baySlots;
    protected int shipHealth;
    protected int shipShield;

//Constuctors

    //the default constructor
    public ShipModel() {
    }

    //constructor with only shipID and shipName
    // public ShipModel(int shipID, String shipName) {
    //     this.shipID = shipID;
    //     this.shipName = shipName;
    // }

    //constructor with shipID, shipName, shipSize, and shipClass
    public ShipModel(int shipID, String shipName, EnumBody.shipSize shipSize, EnumBody.shipClass shipClass) {
        this.shipID = shipID;
        this.shipName = shipName;
        this.shipSize = shipSize;
        this.shipClass = shipClass;
        this.baySlots = new ModularBayModel[calculateBaySlots()];
        this.shipHealth = 100;
        this.shipShield = 100;
        this.passengerCapacity = calculatePassengerSize();
    }

    //constructor with shipID, shipName, shipSize, shipClass, and aiSlots
    public ShipModel(int shipID, String shipName, EnumBody.shipSize shipSize, EnumBody.shipClass shipClass, int aiSlots, int shipHealth, int shipShield) {
        this.shipID = shipID;
        this.shipName = shipName;
        this.shipSize = shipSize;
        this.shipClass = shipClass;
        this.baySlots = new ModularBayModel[calculateBaySlots()];
        this.passengerCapacity = calculatePassengerSize();

        if (shipHealth > 100) {
            this.shipHealth = 100;
        } else if (shipHealth < 0) {
            this.shipHealth = 0;
        } else {
            this.shipHealth = shipHealth;
        }

        if (shipShield > 100) {
            this.shipShield = 100;
        } else if (shipShield < 0) {
            this.shipShield = 0;
        } else {
            this.shipShield = shipShield;
        }

    }

//functions

    /** a function that takes in the enum shipClass and outputs the number of bays determined by class and size */
    private int calculateBaySlots() {
        int baySlots = 0;
        switch (shipClass) {
            case SHUTTLE:
                baySlots = 1;
                break;
            case FIGHTER:
                baySlots = 2;
                break;
            case TRANSPORT:
                baySlots = 4;
                break;
            case FREIGHTER:
                baySlots = 8;
                break;
        }
        switch (shipSize) {
            case SOLO:
                baySlots -= 1;
                break;
            case MEDIUM:
                baySlots = Math.round(baySlots * 1.5f);
                break;
            case HEAVY:
                baySlots *= 3;
                break;
            default:
                break;
        }
        return baySlots;
    }
    //a function that calculates the passenger size based on the ship class and size
    private int calculatePassengerSize() {
        int passengerSize = 0;

        switch (shipClass) {
            case SHUTTLE:
                passengerSize = 2;
                break;
            case FIGHTER:
                passengerSize = 2;
                break;
            case TRANSPORT:
                passengerSize = 4;
                break;
            case FREIGHTER:
                passengerSize = 8;
                break;
            default:
                break;
        }

        switch (shipSize) {
            case SOLO:
                passengerSize -= 1;
                break;
            case LIGHT:
                break;
            case MEDIUM:
                passengerSize = (int) Math.round(passengerSize*1.5);
                break;
            case HEAVY:
                passengerSize = passengerSize*3;
                break;
            default:
                break;
        }
        return passengerSize;
    }

    //a function that adds an aiNPC to the aiSlots array */
    public void addAiNPC(AiNPCModel aiNPC) {
        for (int i = 0; i < aiSlots.length; i++) {
            if (aiSlots[i] == null) {
                aiSlots[i] = aiNPC;
                break;
            }
        }
    }

    //a function the returns a given aiNPC by aiNPC name from the aiSlots array, wrapped in a try and catch */
    public AiNPCModel getAiNPC(String aiNPCName) {
        try {
            for (int i = 0; i < aiSlots.length; i++) {
                if (aiSlots[i].getName().equals(aiNPCName)) {
                    return aiSlots[i];
                }
            }
        } catch (NullPointerException e) {
            System.out.println("No aiNPC with that name");
        }
        return null;
    }

    public void setAll(int shipID, String shipName, int shipHealth, int shipShield) {
        this.shipID = shipID;
        this.shipName = shipName;
        this.shipHealth = shipHealth;
        this.shipShield = shipShield;
    }

    public void setVitals () {
        
    }

    /** a function with a try and catch that adds bay children of ModulBayModel to the ship's bayslots if there are available baySlots */
    public void addBay(ModularBayModel bay) {
        try {
            for (int i = 0; i < baySlots.length; i++) {
                if (baySlots[i] == null) {
                    baySlots[i] = bay;
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("No more bay slots available");
        }
    }



//Getters
    public int getShipID() {
        return shipID;
    }

    public String getShipName() {
        return shipName;
    }

    public aiNPC[] getAiSlots() {
        return aiSlots;
    }

    public int getPassengerSize() {
        return passengerSize;
    }

    public EnumBody.shipSize getShipSize() {
        return shipSize;
    }

    @Override
    public String toString() {
        return "ShipModel{" + "shipID=" + shipID + ", shipName=" + shipName + ", shipHealth=" + shipHealth + ", shipShield=" + shipShield + '}';
    }



    /** A function that evaluates the shipsize enum and the shipclass enum to determine how many bays ar eavailable */

}
