import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int mitad;
        if (num % 2 == 0){
            System.out.println("Número no válido");
        } else {
            for (int i = 0; i < (num / 2); i++){
                for (int j = 0; j < (num / 2) ;j++){
                    System.out.print(" ");
                }
                for (int j = 0; j < 1; j++){
                    System.out.print("X");
                }
                System.out.println();
            }
            for (int i = 0; i < (num % 2); i++){
                for (int j = 0; j < num; j++){
                    System.out.print("X");
                }
                System.out.println();
            }
            for (int i = 0; i < (num / 2); i++){
                for (int j = 0; j < (num / 2) ;j++){
                    System.out.print(" ");
                }
                for (int j = 0; j < 1; j++){
                    System.out.print("X");
                }
                System.out.println();
            }
        }
    }
}
