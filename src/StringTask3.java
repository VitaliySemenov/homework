public class StringTask3 {
    public static void main(String[] args) {


       //3. Имеются две строки. Найти количество вхождений одной строки в другую.

        String str1 = "Найти";
        String str2 = "Имеются две строки. Найти количество вхождений одной строки в другую. Найти то нибудь еще";
        System.out.println(str2.split(str1).length - 1);

    }
}
