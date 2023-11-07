import java.util.Scanner;

public class IdealWeightCalculator {
    public static void main(String[] args) {
        System.out.println("Введите свои данные (вес, рост, пол)");
        Scanner scanner = new Scanner(System.in);
        String sweight = scanner.nextLine();
        String sheight = scanner.nextLine();
        String sex = scanner.nextLine();
        int weight = Integer.valueOf(sweight);
        int height = Integer.valueOf(sheight);
        calculate(weight,height,sex);
    }
    public static int calculate(int weight, int height, String sex) {
        int idealWeight = 0;

        if(sex.startsWith("m")) {
            idealWeight = height - 100;
        } else if(sex.startsWith("w")) {
           idealWeight = height - 110;

        }
        else {
            System.out.println("ошибка указания пола");
            System.exit(1);
        }
       if( weight > idealWeight) {
           System.out.println("похудеть");
           return -1;
       } else if ( weight < idealWeight ) {
           System.out.println("потолстеть");
           return +1;
       }
       else {
           System.out.println("норма");
           return 0;
        }
    }

}
