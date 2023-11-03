import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int total = 10;
        if (num % 2 == 0) {
            while (total < num) {
                System.out.print(total + " ");
                total += 5;
            }
        } else {
            while (total < num) {
                System.out.print(total + " ");
                total += 3;
            }
        }
    }
}
