import java.util.Random;
import java.util.Scanner;

public class RandomGame {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(100) + 1;
        System.out.println("Введи число в диапазоне от 1 до 100. У вас 7 попыток");
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        while (true) {
            counter++;
            if(counter > 7){
                System.out.println("Попыток больше нет. Вы не угадали число " + num);
                break;
            }
            int a = scanner.nextInt();
            if (num > a) {
                System.out.println("Больше");
            } else if (num < a) {
                System.out.println("Меньше");
            } else {
                System.out.println(num + " Угадал c " + counter + " попытки" );
                break;
            }
        }
    }
}