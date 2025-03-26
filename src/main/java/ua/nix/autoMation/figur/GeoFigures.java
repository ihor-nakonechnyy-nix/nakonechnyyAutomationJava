package ua.nix.autoMation.figur;

public abstract class GeoFigures {

    protected String name;

    public GeoFigures(String name) {
        this.name = name;
    }

    public abstract float getAreas();
}
