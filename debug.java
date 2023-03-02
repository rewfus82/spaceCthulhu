package spaceCthulhu;

import spaceCthulhu.model.Bays.RefrigeratedStorageBay;
import spaceCthulhu.model.Ships.ShipModel;
import spaceCthulhu.model.enums.EnumBody;

public class debug {
    public static void main(String[] args) {
        ShipModel ship = new ShipModel(1, "testShip", 100, 100, EnumBody.shipSize.SMALL, EnumBody.shipClass.SHUTTLE);
        RefrigeratedStorageBay coldBay1 = new RefrigeratedStorageBay(1.0, 1.0, 1.0, "CB1", true);
        
        ship.addBay(coldBay1);

    
    }
    
}
