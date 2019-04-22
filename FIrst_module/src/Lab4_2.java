public class Lab4_2 {
    public static void main(String[] args) {
        long x = 1;
        long i = 1;
        while (x < 1000) {

            x = x * i;
            if (x > 1000) {
                System.out.println("Достигнут максимум");

            }
            System.out.println(x);
            i++;
        }

    }
}