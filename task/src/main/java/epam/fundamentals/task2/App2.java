package epam.fundamentals.task2;

/*
 * Найти и вывести наибольшее число возрастающих (убывающих) элементов матрицы, идущих подряд
 */

public class App2 {

    public static void findSortElem(int[][] numbers) {
        System.out.println("\n*Найти и вывести наибольшее число возрастающих (убывающих) элементов матрицы, идущих подряд*");
        int nElem = 1; // количество элементов, идущих подряд
        // расположение элементов в матрице для печати цветом
        int lineFirstIndex = 0; // первая строка
        int lineLastIndex = 0; // последняя строка
        int columnFirstIndex = 0; // первый столбец
        int columnLastIndex = 0; // последний столбец
        // поиск в сторках
        for (int line = 0; line < numbers.length; line++) {
            int nElemTmp = 1;
            int columnFirstIndexTmp = 0;
            int columnLastIndexTmp = 0;
            // поиск по возрастанию
            for (int column = 0; column < numbers[0].length - 1; column++) {
                if (numbers[line][column + 1] > numbers[line][column]) {
                    if (nElemTmp == 1) {
                        columnFirstIndexTmp = column;
                    }
                    columnLastIndexTmp = column + 1;
                    nElemTmp++;
                } else {
                    if (nElemTmp > nElem) {
                        nElem = nElemTmp;
                        lineFirstIndex = line;
                        lineLastIndex = line;
                        columnFirstIndex = columnFirstIndexTmp;
                        columnLastIndex = columnLastIndexTmp;
                    }
                    nElemTmp = 1;
                }
            }
            if (nElemTmp > nElem) {
                nElem = nElemTmp;
                lineFirstIndex = line;
                lineLastIndex = line;
                columnFirstIndex = columnFirstIndexTmp;
                columnLastIndex = columnLastIndexTmp;
            }

            nElemTmp = 1;
            columnFirstIndexTmp = 0;
            columnLastIndexTmp = 0;
            // поиск по убыванию
            for (int column = 0; column < numbers[0].length - 1; column++) {
                if (numbers[line][column] > numbers[line][column + 1]) {
                    if (nElemTmp == 1) {
                        columnFirstIndexTmp = column;
                    }
                    columnLastIndexTmp = column + 1;
                    nElemTmp++;
                } else {
                    if (nElemTmp > nElem) {
                        nElem = nElemTmp;
                        lineFirstIndex = line;
                        lineLastIndex = line;
                        columnFirstIndex = columnFirstIndexTmp;
                        columnLastIndex = columnLastIndexTmp;
                    }
                    nElemTmp = 1;
                }
            }
            if (nElemTmp > nElem) {
                nElem = nElemTmp;
                lineFirstIndex = line;
                lineLastIndex = line;
                columnFirstIndex = columnFirstIndexTmp;
                columnLastIndex = columnLastIndexTmp;
            }
        }
        // поиск в столбцах
        for (int column = 0; column < numbers[0].length; column++) {
            int nElemTmp = 1;
            int lineFirstIndexTmp = 0;
            int lineLastIndexTmp = 0;
            // поиск по возрастанию
            for (int line = 0; line < numbers.length - 1; line++) {
                if (numbers[line + 1][column] > numbers[line][column]) {
                    if (nElemTmp == 1) {
                        lineFirstIndexTmp = line;
                    }
                    lineLastIndexTmp = line + 1;
                    nElemTmp++;
                } else {
                    if (nElemTmp > nElem) {
                        nElem = nElemTmp;
                        columnFirstIndex = column;
                        columnLastIndex = column;
                        lineFirstIndex = lineFirstIndexTmp;
                        lineLastIndex = lineLastIndexTmp;
                    }
                    nElemTmp = 1;
                }
            }
            if (nElemTmp > nElem) {
                nElem = nElemTmp;
                columnFirstIndex = column;
                columnLastIndex = column;
                lineFirstIndex = lineFirstIndexTmp;
                lineLastIndex = lineLastIndexTmp;
            }

            nElemTmp = 1;
            lineFirstIndexTmp = 0;
            lineLastIndexTmp = 0;
            // поиск по убыванию
            for (int line = 0; line < numbers.length - 1; line++) {
                if (numbers[line][column] > numbers[line + 1][column]) {
                    if (nElemTmp == 1) {
                        lineFirstIndexTmp = line;
                    }
                    lineLastIndexTmp = line + 1;
                    nElemTmp++;
                } else {
                    if (nElemTmp > nElem) {
                        nElem = nElemTmp;
                        columnFirstIndex = column;
                        columnLastIndex = column;
                        lineFirstIndex = lineFirstIndexTmp;
                        lineLastIndex = lineLastIndexTmp;
                    }
                    nElemTmp = 1;
                }
            }
            if (nElemTmp > nElem) {
                nElem = nElemTmp;
                columnFirstIndex = column;
                columnLastIndex = column;
                lineFirstIndex = lineFirstIndexTmp;
                lineLastIndex = lineLastIndexTmp;
            }
        }

        System.out.print("Наибольшее число элементов матрицы, идущих по " +
                (numbers[lineFirstIndex][columnFirstIndex] < numbers[lineLastIndex][columnLastIndex] ? "возрастанию" : "убыванию") +
                " = " + nElem + ", найдено в ");
        System.out.println(lineFirstIndex == lineLastIndex ? ((lineFirstIndex + 1) + "-й строке ") : ((columnFirstIndex + 1)
                + "-м столбце"));
        System.out.println("lineBeginIndex = " + lineFirstIndex);
        System.out.println("lineEndIndex = " + lineLastIndex);
        System.out.println("columnBeginIndex = " + columnFirstIndex);
        System.out.println("columnEndIndex = " + columnLastIndex);
        printFindSortNumbersColor(numbers, lineFirstIndex, lineLastIndex, columnFirstIndex, columnLastIndex);
    }

    public static void printFindSortNumbersColor(int[][] numbers, int lineBeginIndex, int lineEndIndex,
                                                 int columnBeginIndex, int columnEndIndex) {
        for (int line = 0; line < numbers.length; line++) {
            for (int column = 0; column < numbers[0].length; column++) {
                if ((line >= lineBeginIndex && line <= lineEndIndex) && (column >= columnBeginIndex && column <= columnEndIndex)) {
                    System.out.print("\033[31;1m" + numbers[line][column] + "\033[0m" + " ");
                } else {
                    System.out.print(numbers[line][column] + " ");
                }
            }
            System.out.println();
        }
    }

}
