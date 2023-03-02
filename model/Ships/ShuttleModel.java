package spaceCthulhu.model.Ships;

import spaceCthulhu.model.enums.EnumBody;

public class ShuttleModel extends ShipModel {
    
        public ShuttleModel(int shipID, String shipName, int shipHealth, int shipShield, EnumBody.shipSize shipSize) {
            super(shipID, shipName, shipHealth, shipShield, shipSize);
            this.shipClass = EnumBody.shipClass.SHUTTLE;
            
        }
    
}
