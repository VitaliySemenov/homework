import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

//1. Найти наибольший общий делитель (НОД) двух чисел

        Scanner in = new Scanner(System.in);
            System.out.println("Введите целое число");
        int i = in.nextInt();
            System.out.println("Введите целое число");
        int j = in.nextInt();
        while (i != j) {
            if (i > j) {
                i = i - j;
            } else
                j = j - i;
        }
        System.out.println("наибольший общий делитель = " +i);
    }
}
