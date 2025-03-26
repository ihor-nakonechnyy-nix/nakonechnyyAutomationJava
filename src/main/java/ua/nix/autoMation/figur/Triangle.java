package ua.nix.autoMation.figur;

public class Triangle extends GeoFigures {

    public int sideA;
    public int height;

    public Triangle(String name, int sideA, int height) {
        super(name);
        this.sideA = sideA;
        this.height = height;
    }

    public int getArea() {
        int area = sideA * height / 2;
        return area;

    }

    @Override
    public float getAreas() {
        int area = sideA * height / 2;
        System.out.println("Площа трикутника: " + area);
        return area;
    }
}

