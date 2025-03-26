package ua.nix.autoMation.figur;

public class PracticTask {
    public static void main(String[] args) {

        Circle circle_1 = new Circle("myCircle", 100);
        Circle circle_2 = new Circle("myCircle", 200);


//        System.out.println(circle_1.name);
//        System.out.println(circle_2.radius);
//        System.out.println(circle_1.getArea());

        Rectangle rectangle_1 = new Rectangle("myRectangke", 50, 100);
        Triangle triangle_1 = new Triangle("myTriangle", 7, 9);
        Trapezium trapezium_1 = new Trapezium("myTrapezium", 10,10, 15);

        GeoFigures[] figuresArray = {
                circle_1,
                circle_2,
                rectangle_1,
                triangle_1,
                trapezium_1


        };

        for (int i = 0; i < figuresArray.length; i++){
            figuresArray[i].getAreas();

        }



//        System.out.println(rectangle_1.getArea());
//        System.out.println(triangle_1.getArea());


    }
}
