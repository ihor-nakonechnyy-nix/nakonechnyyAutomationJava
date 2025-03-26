package ua.nix.autoMation.figur;

public class Trapezium extends GeoFigures {
    public int length_1;
    public int length_2;
    public int height;


    public Trapezium(String name, int length_1, int length_2, int height) {
        super(name);
        this.length_1 = length_1;
        this.length_2 = length_2;
        this.height = height;
    }

    @Override
    public float getAreas() {
        int area = (length_1 + length_2) * height / 2;
        System.out.println("Площа трапеції: " + area);
        return area;

    }
}

