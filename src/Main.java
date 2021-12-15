import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.2 */

        /*   zad.1 zadeklaruj i zainicjalizuj zmienne różnych typów i wyświetl w konsoli (im więcej tym lepiej ;) ) */

         byte zmiennaByte = 127;
         System.out.println("Zmienna typu Byte - " + zmiennaByte);

         short zmiennaShort = 32767;
         System.out.println("Zmienna typu Short - " + zmiennaShort);

         int zmiennaInt = 1999, a = 444, b =10;
         System.out.println("Zmienna typu Int - " + zmiennaInt);

         long zmiennaLong = 19999999L;
         System.out.println("Zmienna typu Long - " + zmiennaLong);

         float zmiennaFloat = 21.01f;
         System.out.println("Zmienna typu Float - " + zmiennaFloat);

         double zmiennaDouble = 6666.4567, x = 1000.100, y = 33.33;
         System.out.println("Zmienna typu Double - " + zmiennaDouble);

         boolean zmiennaBoolean = false;
         System.out.println("Zmienna typu Boolean - " + zmiennaBoolean);

         char zmiennaChar = 'j';
         System.out.println("Zmienna typu Char - " + zmiennaChar);

         System.out.println("");

         /*
        *    zad.2 Napisz kod który będzie wykonywał operacje: dodawania, odejmowania,
        *    mnożenia, dziealenia i modulo na zmiennych:
        *    a) liczbaA i liczbaB, dowolne liczby calkowite (int),
        *    b) liczbaX i liczbaY, dowolne liczby zmiennoprzecinkowe (double)
        *  */

        // Przykład a)

        System.out.println("Dodawanie dwóch liczb całkowitych: ");
        int wynik = a + b;
        System.out.println(wynik);

        System.out.println("Odejmowanie dwóch liczb całkowitych: ");
        int wynik2 = a - b;
        System.out.println(wynik2);

        System.out.println("Mnożenie dwóch liczb całkowitych: ");
        int wynik3 = a * b;
        System.out.println(wynik3);

        System.out.println("Dzielenie dwóch liczb całkowiych: ");
        int wynik4 = a / b;
        System.out.println(wynik4);

        System.out.println("Modulo dwóch liczb zmiennych całkowitych: ");
        System.out.println( a % b);
        System.out.println("Wynikiem jest cztery, ponieważ to reszta z dzielenia 444 przez 10!");

        System.out.println("");



        // Przykład b)

        System.out.println("Dodawanie dwóch liczb zmiennoprzecinkowych: ");
        double wynik5 = x + y;
        System.out.println(wynik5);

        System.out.println("Odejmowanie dwóch liczb zmiennoprzecinkowych: ");
        double wynik6 = x - y;
        System.out.println(wynik6);

        System.out.println("Mnożenie dwóch liczb zmiennoprzecinkowych: ");
        double wynik7 = x * y;
        System.out.println(wynik7);

        System.out.println("Dzielenie dwóch liczb zmiennoprzecinkowych: ");
        double wynik8 = x / y;
        System.out.println(wynik8);

        System.out.println("Modulo z dwóch liczb zmiennoprzecinkowych: ");
        System.out.println( x % y);


    }
}
