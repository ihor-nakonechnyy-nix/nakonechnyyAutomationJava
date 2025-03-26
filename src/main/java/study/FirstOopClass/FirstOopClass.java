package study.FirstOopClass;

public class FirstOopClass {
    public static void main(String[] args) {

        Box myBox = new Box();
        myBox.width = 2;
        myBox.height = 3;
        myBox.length = 4;

        double Obyem = myBox.Obyem();
        System.out.println(Obyem);

        Box myBox2 = new Box();
        myBox2.width = 5;
        myBox2.height = 6;
        myBox2.length = 7;
        System.out.println(myBox2.Obyem());

        /*Питання:
        якщо ми маємо створений метод Obyem() в класі Box, який множить параметри
        тоді чому нам ще тут в класі FirstOopClass потрібно створювати змінну Obyem.
        При чому для обох обєктів: myBox та myBox2
         */

    }
}
