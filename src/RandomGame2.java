import java.util.Scanner;
public class RandomGame2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int mid = 0;
        int min = 0;
        int max = 100;
        int counter = 0;
        while (counter < 7 ) {
            mid = (max + min)/2;
         System.out.println("Ты загадал число " + mid + " ?" );
            String s = scanner.nextLine();
            counter++;

            if(s.equals("верно")){
                System.out.println("твое число " + mid + " с попытки " + counter);
                   break;
                } else if (s.equals("больше")){
                min = mid;

            }
            else if(s.equals("меньше")){
                max = mid;
            }
            else {
                System.out.println("вводите только больше , меньше , верно");
            }
        }
        System.out.println("попыток больше нет");
        }
    }

