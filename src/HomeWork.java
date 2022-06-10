package lesson1;

import java.util.Arrays;

public class HomeWork {
    public static void main(String[] args) {
        //Базовый уровень
        //Задача №1
        //Дано (их менять нельзя)
        String hi = "                Hello ";
        String world = " WoRld!";
        char newLine = '\n';

        //Создать из трех переменных единую строку,
        String result = hi + world + newLine;
        System.out.println(result);

        //Привести к правильному виду (Ниже)
        String worldlowerCase = world.toLowerCase();
        String trimned = hi.trim();
        System.out.println(trimned+worldlowerCase+'\n');

        //затроить (Можно вызвать тольку одну команду System.out.print())
        String result1 = (trimned + worldlowerCase + '\n');
        String repeated = result1.repeat(3);
        System.out.println(repeated);

        //Результат вывода на экран:
        //Hello world!
        //Hello world!
        //Hello world!

        //Задача №2
        //Создать переменные с ростом, весом.
        //Произвести расчет индекса массы тела (вес) / (рост * рост) используя переменные, вывести на экран
        //Пример результата вывода на экран:
        //21.0
        int myWeight = 115;
        double myHeight = 1.96;
        double BodyMassIndex = (myWeight / (double) (myHeight * myHeight));
        System.out.printf("%.1f", BodyMassIndex);
        System.out.println(); // для добавления перехода на новую строку

        //Задача №3
        //Создать из массива букв a,b,c,d,e, строку,вывести на экран , поменять в массиве 4 букву по счету на h,
        //и снова создать строку, вывести на экран

        char[] myArray = new char[5];
        myArray[0] = 'a';
        myArray[1] = 'b';
        myArray[2] = 'c';
        myArray[3] = 'd';
        myArray[4] = 'e';
        System.out.println(myArray);
        char[] myArray2 = myArray;
        myArray2[3] = 'h';
        System.out.println(myArray2);

        //Продвинутый уровень
        //Задача №1
        //Произвести преобразование "234" в число типа int и прибавить к этому числу длину строки "some_text"
        short word = 234;
        int number = word;
        String word1 = "Some_text";
        int len = word1.length();
        System.out.println( number + word1.length());

        //Задача №2
        //Посчитать (a+b)^2 = ?, при a=3, b=5

        int a = 3;
        int b = 5;
        int c = a + b;
        int d = 2;
        System.out.printf("\n","(a+b)^2= %.0f ",  Math.pow(c,d));

        //Задача №3
        //Создать два массив чисел:
        // 1,2,5,7,10
        // 2,3,2,17,15
        // Создать массив чисел, в котором будут: все числа из этих двух массивов,
        // и результат умножения чисел с одинаковым порядковым номером
        //
        //Ожидаемый результат:
        //1,2,5,7,10,2,3,2,17,15,2,6,10,119,150
        //(первый массив - 1,2,5,7,10), (второй массив - 2,3,2,17,15),
        //(результат перемножения - (1*2), (2*3), (5*2), (7*17), (10*15)


        int[] array1 = {1, 2, 5, 7, 10};
        int[] array2 = {2, 3, 2, 17, 15};
        int[] array3 = {1*2,2*3,17*7,10*15};
        int[] array4 = new int[array1.length + array2.length+array3.length];

        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            array4[i] = array1[i];
            count++;
        }
        for (int j = 0; j < array2.length; j++) {
            array4[count++] = array2[j];
        }
        for (int j = 0; j < array3.length; j++) {
            array4[count++] = array3[j];
        }
        for (int i = 0; i < array4.length; i++)
            System.out.print(array4[i] + " ");

    }
}