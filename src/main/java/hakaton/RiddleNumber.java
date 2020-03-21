package hakaton;

import java.util.Random;
import java.util.Scanner;

public class RiddleNumber {

    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    int maximum = 100;
    int minimum = 0;

    int compNum = rand.nextInt(maximum - minimum);

    public void start2() {

        System.out.println("Загадайте число от 0, до 100. А я отгадаю.");
        System.out.println(compNum);

        while (sc.hasNext()) {
            String userInput = sc.nextLine();
            if (userInput.equals("меньше")) {
                maximum = compNum;
                compNum = rand.nextInt(maximum - minimum)+minimum;
                System.out.println(compNum);

            } else if (userInput.equals("больше")) {
                minimum = compNum + 1;
                compNum = rand.nextInt(maximum - minimum)+minimum;
                System.out.println(compNum);

            } else if (userInput.equals("выйти")) {
                break;
            } else if (userInput.equals("правильно")) {
                System.out.println("Компьютера угадал число. Ваше число:" + compNum);
            } else {
                System.out.println("Неверная команда");
            }
        }
    }
}
