public class Task5 {
    public static void main(String[] args) {


        //Создать двумерный массив из 5 строк по 8 столбцов в каждой из случайных целых чисел из отрезка [-99;99].
        //Вывести массив в консоль.
        //После, на отдельной строке вывести в консоль значение максимального элемента этого массива.

        int [][] someArr = new int[5][8];
        for(int i = 0; i < someArr.length; i++){
            for(int h = 0; h < someArr[i].length; h++){
                someArr[i][h]=(int)((Math.random()*199)-99);
                System.out.print(someArr[i][h]+" ");
            }
        }
        int max = someArr[0][0];
        for(int i = 0; i < someArr.length; i++){
            for(int h=0; h < someArr[i].length; h++){
                if(someArr[i][h] > max) max = someArr[i][h];
            }
        }
        System.out.println("Максимальный элемент массива = "+max);

    }
}
