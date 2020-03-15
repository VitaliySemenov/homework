public class StringTask1 {
    public static void main(String[] args) {


        //1. Даны 2 слова, состоящие из четного числа букв.
        // Получить слово состоящее из первой половины первого слова и второй половины второго слова.

        String someString1 = "Первое";
        String someString2 = "Второе";
        String someString3 = (someString1.substring(0, someString1.length()/2)) +
                (someString2.substring(someString2.length()/2, someString2.length()));
        System.out.println(someString3);

    }
}
