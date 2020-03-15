import java.util.Arrays;

public class StringTask2 {
    public static void main(String[] args) {

        //2. Найдите самое длинное слово в предложении, при условии, что в предложении все слова разной длины.

        String somestring = "Найдите самое длинно слово в предложении"; //исходное предложение
        String[] slova = somestring.split("\\s"); //Разбиваем слова и создаем массив
        System.out.println(Arrays.toString(slova)); //Выводим, для того чтобы было видно
        int a = 0;
        for (int i = 0; i <slova.length ; i++) {
            String max = slova[i];
            if (max.length() > slova[a].length()) {
                a = i;
            }
        }
        System.out.println("Самое длинное слово - " +a);

    }
}
