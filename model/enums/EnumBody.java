package spaceCthulhu.model.enums;

import  spaceCthulhu.model.enums.EnumBody;

public interface EnumBody {
    public enum shipSize { SOLO, LIGHT, MEDIUM, HEAVY }
    public enum shipClass {
        SHUTTLE(shipSize.SOLO, shipSize.LIGHT),
        FIGHTER(shipSize.SOLO, shipSize.LIGHT, shipSize.MEDIUM),
        TRANSPORT(shipSize.LIGHT, shipSize.MEDIUM, shipSize.HEAVY),
        FREIGHTER(shipSize.LIGHT, shipSize.MEDIUM, shipSize.HEAVY);
        

        private final shipSize[] allowedSizes;

        shipClass(shipSize... allowedSizes) {
            this.allowedSizes = allowedSizes;
        }

        public shipSize[] getAllowedSizes() {
            return allowedSizes;
        }

        public boolean isSizeAllowed(shipSize size) {
            for (shipSize allowedSize : allowedSizes) {
                if (allowedSize == size) {
                    return true;
                }
            }
            return false;
        }
    }
        
    public enum bayType { REFRIGERATED, CARGO, FUEL, WEAPONS, HABITATION, MEDICAL, RESEARCH, ENGINEERING, COMMUNICATIONS, NAVIGATION }

    /** an enum for artificial intelligence npc classes found on ships */
    public enum aiRole { CAPTAIN, ENGINEER, NAVIGATOR, SCIENTIST, MEDIC, PSYCHOLOGIST, SECURITY, ENTERTAINMENT, CARGO, WEAPONS, CREW, EDUCATION, ADMINISTRATION;

}
