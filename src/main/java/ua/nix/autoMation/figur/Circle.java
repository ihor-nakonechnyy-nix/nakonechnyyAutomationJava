package ua.nix.autoMation.figur;

public class Circle extends GeoFigures {
    public int radius;


    public Circle(String name, int radius) {
        super(name);
        this.radius = radius;


    }

//    public float getArea(){
//        return 3.14f * radius*radius;
//
//    }

    @Override
    public float getAreas() {
        float area = 3.14f * radius*radius;
        System.out.println("Площа кола: " + area);
        return area;    }
}
