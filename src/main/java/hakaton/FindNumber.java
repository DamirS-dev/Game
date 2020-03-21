package hakaton;

import java.util.Scanner;

public class FindNumber {
    Scanner sc = new Scanner(System.in);
    int unknownNum = (int) (100.0 * Math.random());
    int num;
    public void start() {
        String userInput = sc.nextLine();
        System.out.println("Компьютер загадал число от 0 до 100. Угадайте какое.");
        do {

            num = new Scanner(System.in).nextInt();

            if (num < unknownNum) {
                System.out.println("Ваше число меньше загадонного. Повторите попытку");
            } else if (num > unknownNum) {
                System.out.println("Ваше число больше загадонного. Повторите попытку");
            } else if (userInput.equals("выйти")){
                break;
            } else if (num == unknownNum){
                System.out.println("Поздравляю, Вы угадали число!!!");
            } else {
                System.out.println("Неверная команда. Попробуйте ещё раз.");
            }

        } while (num != unknownNum);
    }
}



