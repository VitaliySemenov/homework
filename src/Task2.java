import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

/*      Дан массив целых чисел. Массив не отсортирован, числа могут повторяться.
        Необходимо найти в данном массиве такие два числа n и m, чтобы их сумма была равна 7.
        Например, 2 + 5 = 7, 6 + 1 = 7, -2 + 9 = 7. Постарайтесь решить задачу наиболее оптимальным способом*/

        int[] someArr = new int[20];
        Random rnd = new Random();
        for (int i = 0; i < someArr.length; i++) {
            someArr[i] = rnd.nextInt(20) - 10;
        }
        int a = 7;
        Arrays.sort(someArr);
        System.out.println("Дан массив");
        System.out.println(Arrays.toString(someArr));
        for (int i = 0; i < someArr.length - 1; i++) {
            for (int j = i + 1; j < someArr.length; j++) {
                if (someArr[i] + someArr[j] == a) {
                    System.out.println("эл[" + i + "] = " + someArr[i]);
                    System.out.println("эл[" + j + "] = " + someArr[j]);
                    System.out.println("эл[" + i + "] + эл[" + j + "] = " + a);

                }
            }
        }
    }
}

