
public class StringTask4 {
    public static void main(String[] args) {

        //4. Написать функцию, которая проверяет, является ли строка палиндромом.
        // Палиндром — это слово или фраза, которые одинаково читаются по буквам или по словам как слева направо,
        // так и справа налево.

        String somestr = "ADDA";
        System.out.println(somestr.equalsIgnoreCase(new StringBuilder(somestr).reverse().toString()));






    }
}
