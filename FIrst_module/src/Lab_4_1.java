import java.sql.SQLOutput;

public class Lab_4_1 {
    public static void main(String[] args) {
        String str1 = "понедельник";
        String str2 = "вторник";
        String str3 = "среда";
        String str4 = "четверг";
        String str5 = "пятница";
        String str6 = "суббота";
        String str7 = "воскресенье";

        switch (str7) {
            case "понедельник": {
                System.out.println("понедельник будний день");
                break;
            }

            case "вторник": {
                System.out.println("вторник будний день");
                break;
            }
            case "среда": {
                System.out.println("среда будний день");
                break;
            }
            case "четверг": {
                System.out.println("четверг будний день");
                break;
            }
            case "пятница": {
                System.out.println("пятница будний день");
                break;
            }
            case "суббота": {
                System.out.println("суббота выходной");
                break;
            }
            case "воскресенье": {
                System.out.println("воскресенье выходной");
                break;
            }
            default:
                System.out.println("введите корректный день");

        }
    }
}