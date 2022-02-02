import java.util.Arrays;

public class HomeWork3 {
    public static void main(String[] args) {
      task1();
        System.out.println("______________________");
      task2();
        System.out.println("____________________");
       task3();
        System.out.println("_____________________");
        diagonal();
        System.out.println("_____________________");
        returningArrayElements(4,10);
        System.out.println("____________________");
        minAndMaxArrayElement();
        System.out.println("____________________");
        System.out.println(leftSideEqualsRight(new int[] {2, 2, 2, 1, 2, 2, 10, 1}));
      


    }
    /*1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        С помощью цикла и условия заменить 0 на 1, 1 на 0;
        */

    public static void task1() {
        int[] array1 = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == 1) {
                array1[i] = 0;
            } else array1[i] = 1;
        }
        System.out.println(Arrays.toString(array1));
    }

    /*2. Задать пустой целочисленный массив длиной 100.
     С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
     */
    public static void task2() {
        int[] array2 = new int[100];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = i;
            System.out.println(array2[i]);
        }
    }

    /*3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
и числа меньшие 6 умножить на 2;
     */
    public static void task3() {
        int[] array3 = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < array3.length; i++) {
            if (array3[i] < 6) {
                array3[i] = array3[i] * 2;
            }
            System.out.println(array3[i]);
        }
    }

    /*4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
     и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
      если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны,
       то есть [0][0], [1][1], [2][2], …, [n][n];
     */
    public static void diagonal() {
        int[][] twoDimensionalArray = new int[3][3];
        for (int i = 0; i < twoDimensionalArray.length; i++) {
            for (int j = 0; j < twoDimensionalArray.length; j++) {
                if (i == j || i == j) {
                    twoDimensionalArray[i][j] = 1;
                }
                System.out.print(twoDimensionalArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    /*5. Написать метод, принимающий на вход два аргумента: len и initialValue,
     и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
     */
    public static int[] returningArrayElements(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        //System.out.println(Arrays.toString(array));
        return array;
    }

    // 6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;

    public static void minAndMaxArrayElement() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(array));
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("min = " + min + "   max = " + max);
    }

    /*7. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
     метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
     */

    public static boolean leftSideEqualsRight(int[] array) {
        boolean result = false;
        for (int i = 0; i < array.length - 1; i++) {
            int left = 0;
            int right = 0;
            for (int j = 0; j <= i; j++) {
                left = left + array[i];
            }
            for (int k = i + 1; k < array.length; k++) {
                right = right + array[i];
            }
            if (left == right) {
                return true;
            }
        }
                return false;
    }

}



