package epam;
/*
 *2.     Отобразить в окне консоли аргументы командной строки в обратном порядке.
 */
public class App2 {
    public static void main(String [] args) {
        if (args.length == 0) { // Рекурсия. если нет аргументов, то запускаем метод с аргументами
            main(new String[]{"one", "two", "three"});
        }
        for (int i = args.length - 1; i >= 0; i--) {
            System.out.print(args[i] + " ");
        }
    }
}
