package study.myTasks;

public class FoxMinded {
    public static void main(String[] args) {

        float i = 6;
        float j = 7;
        float answer = i / j;
        //boolean isMoreThanOne = answer > 1 ? true: false;
        boolean isMoreThanOne;


        if (answer > 1) {
            isMoreThanOne = true;
        } else {
            isMoreThanOne = false;
        }

        String message = "Hello World!!!";
        String stringAnswer = message + " " + answer;
        System.out.println(message);
        System.out.println(stringAnswer + " " + isMoreThanOne);


    }


}
