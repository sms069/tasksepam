package epam.fundamentals.task2;

/*
 * Найти сумму элементов матрицы, расположенных между первым и вторым положительными элементами каждой строки
 */

public class App3 {
    public static void summElem(int[][] numbers) {
        System.out.println("\n*Найти сумму элементов матрицы, расположенных между первым и вторым положительными элементами каждой строки*");
        int summ = 0;
        for (int[] number : numbers){
            for (int i = 0; i < number.length - 1; i++) {
                if (number[i] > 0 && number[i + 1] > 0) {
                    summ += (number[i] + number[i + 1]);
                    break;
                }
            }
        }
        System.out.println("Сумма элементов матрицы, расположенных между " +
                "первым и вторым положительными элементами каждой строки = " + summ);
    }
}
