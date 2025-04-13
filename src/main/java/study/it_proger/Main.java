package study.it_proger;

public class Main {
    public static void main(String[] args) {

        Transport bmw = new Transport();
        bmw.setValues(200.5f, 2000, "Black", new byte[]{0, 0, 0});


        Transport track = new Transport();
        track.speed = 130.5f;
        track.weight = 5000;
        track.color = "White";
        track.coordinates = new byte[]{0, 100, 0};


        System.out.println(bmw.getValues());
        System.out.println(track.getValues());


    }
}
