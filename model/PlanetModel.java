package spaceCthulhu.model;

public class PlanetModel {

    private String planetName;
    private String planetType;
    private String planetSize;
    private String planetAtmosphere;
    private String planetGravity;
    private String planetTemperature;
    private String planetPopulation;

    public PlanetModel(String planetName, String planetType, String planetSize, String planetAtmosphere,
            String planetGravity, String planetTemperature, String planetPopulation) {
        super();
        this.planetName = planetName;
        this.planetType = planetType;
        this.planetSize = planetSize;
        this.planetAtmosphere = planetAtmosphere;
        this.planetGravity = planetGravity;
        this.planetTemperature = planetTemperature;
        this.planetPopulation = planetPopulation;
    }

    public String getPlanetName() {
        return planetName;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    public String getPlanetType() {
        return planetType;
    }

    public void setPlanetType(String planetType) {
        this.planetType = planetType;
    }

    public String getPlanetSize() {
        return planetSize;
    }

    
    
}
