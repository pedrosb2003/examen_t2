import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int planta = 0;
        int actual = 0;
        int calculo = 0;
        do {
            planta = sc.nextInt();
            if (planta != -1){
                for (int i = 1; i < planta; i++){
                    calculo ++;
                }
                System.out.println(calculo);
            }
        } while (planta != -1);
    }
}