package ua.nix.autoMation.figur;

public class Rectangle extends GeoFigures {

    private int length;
    private int width;


    public Rectangle(String name, int length, int width) {
        super(name);
        this.length = length;
        this.width = width;
    }

//    public int getArea(){
//        int area =  length * width;
//        return area;
//    }

    @Override
    public float getAreas() {
        int area =  length * width;
        System.out.println("Площа прямокутника: " + area);
        return area;
    }
}
