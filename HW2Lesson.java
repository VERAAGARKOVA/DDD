import java.util.Arrays;
/**
 * Java. Level 1. Lesson 2. Example of homework
 *
 * @author Vera Agarkova
 * @version dated jan 17, 2019
 */
 class HW2Lesson {
//**1.  Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;*//
//**2.  Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;*/
//**3.  Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
//**4   Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;

    public static void main(String[] args) {
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
    }

    static void invertArray() {
        int[] arr = {1, 0, 1, 0, 1, 1};
        for (int i = 0; i < arr.length; i++) {
        if (arr[i] == 1) {
        arr[i] = 0;
        System.out.println(Arrays.toString(arr));
            }
                  }
    }

    static void fillArray() {
        int[] nums = new int[]{0, 3, 6, 9, 12, 15, 18, 21};
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++)
            arr[i] = nums[i];
        System.out.println(Arrays.toString(arr));
    }

    static void changeArray() {
        int[] www = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < www.length; i++)
        if (www[i] < 6) {
        www[i] = (www[i]) * 2;
        System.out.println(Arrays.toString(www));
            }
    }

    static void fillDiagonal() {
        int[][] table = new int[5][5];
        for (int i = 0; i <5; i++) {
        table[i][i] =1;
        for (int j = 0; j < 5; j++) {
        table[ i][4-i] =1;
        //   for (int i = 0; i <N; i++) {N размер матрицы; для левой диагонали [i][i]; для правой [i][N-1-i]поэтому 4*//

        System.out.print(table[i][j] + " ");
            }
         System.out.println();
                    }

            }
        }


