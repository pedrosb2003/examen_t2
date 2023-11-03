import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double introducido = 0;
        double total = 0;
        int aprobado = 0;
        int suspenso = 0;

        do{
        introducido = sc.nextInt();
            if (introducido != -1) {
                if (introducido >= 5) {
                    aprobado++;
                } else {
                    suspenso++;
                }
                total += introducido;
                System.out.println("La media es " + total / (aprobado + suspenso));
                System.out.println("Aprobados: " + aprobado + " - Suspensos: " + suspenso);
            } else {
                System.out.println("No se han introducido calificaciones");
            }
        } while (introducido != -1);
    }
}
