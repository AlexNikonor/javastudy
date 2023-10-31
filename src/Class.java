import java.time.LocalDateTime;
import java.util.Scanner;

public class Class {
    public static void main(String[] args) {

        int h = LocalDateTime.now().getHour();
        if (h >= 5 && h <= 11)
            System.out.println("утро");
        else if (h > 11 && h <= 16)
            System.out.println("день");
        else if (h > 16 && h <= 22)
            System.out.println("вечер");
        else
            System.out.println("ночь");

    }
}




