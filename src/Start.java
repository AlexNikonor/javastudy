import java.util.Random;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(101);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int a = scanner.nextInt();
            if (num > a) {
                System.out.println("Больше");
            } else if (num < a) {
                System.out.println("Меньше");
            } else {
                System.out.println(num + " Угадал");
                break;
            }
        }
    }
}