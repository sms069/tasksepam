package epam;

import java.util.Scanner;

/**
 * 1. Приветствовать любого пользователя при вводе его имени через командную строку.
 *
 */
public class App1
{
    public static void main( String[] args )
    {
        String name;
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.println("Приветствую тебя. " + name + "!!!");
    }
}
