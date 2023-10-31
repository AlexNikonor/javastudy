import java.time.LocalDateTime;


public class Main {
    public static String dayPart(int h){
        if (h >= 5 && h <= 11)
            return "утро";
        else if (h > 11 && h <= 16)
            return "день";
        else if (h > 16 && h <= 22)
            return "вечер";
        else
            return "ночь";
    }
    public static void main(String[] args) {

        int h = LocalDateTime.now().getHour();
        for(int x = 0; x <= 23; x++) {
            String result = dayPart(x);
            System.out.print(x);
            System.out.println(" " + result);
        }


    }
}




