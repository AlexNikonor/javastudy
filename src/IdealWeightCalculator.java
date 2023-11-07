import java.util.Scanner;

public class IdealWeightCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int weight = scanner.nextInt();
        int height = scanner.nextInt();
        String sex = scanner.nextLine();
        calculate(weight,height,sex);
    }
    public static void calculate(int weight, int height, String sex) {
        int idealWeight = 0;

        if(sex == "m") {
            idealWeight = height - 100;
        } else if(sex == "w") {
           idealWeight = height - 110;
        }
       if( weight > idealWeight) {
           System.out.println("похудеть");
       } else if ( weight < idealWeight ) {
           System.out.println("потолстеть");
       }
       else {
           System.out.println("норма");
        }
    }

}
