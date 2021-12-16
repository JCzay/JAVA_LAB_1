import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.3 */

        /*  zad.1 napisać interfejs który bedzie słuzył do wpisania danych osobowych:
        *   a) Imię, nazwisko, wiek, nr indeksu,
        *   dane mają być wprowadzane z klawiatury w konsoli
        *   b) wyświetlić dane za pomocą println i printf
        */

        // przykład  a)

        Scanner scan = new Scanner(System.in);

        System.out.print("Podaj imię: ");
        String tekst = scan.next();

        System.out.print("Podaj nazwisko: ");
        String tekst2 = scan.next();

        System.out.print("Podaj wiek: ");
        int liczba = scan.nextInt();

        System.out.print("Podaj numer indeksu: ");
        int liczba2 = scan.nextInt();

        // przykład  b)

        System.out.printf("Twoje imię to %s, a nazwisko %s \n", tekst, tekst2 +".");
        System.out.println("Numer indeksu, który podałeś to: " + liczba2 + ", a podany przez Ciebie wiek to: " + liczba + ".");

        System.out.println(" ");


        /*  zad.2 zadeklarować 2 zmienne typu int i wykonać na nich obliczenia arytmetyczn (+, -, *, /, %)
        *   wynik wyświetlić w konsoli programu
        */

        System.out.println("Kalkulator");

        System.out.println(" ");

        System.out.printf("Podaj pierwszą liczbę: ");
        int liczba4 = scan.nextInt();

        System.out.printf("Podaj drugą liczbę: ");
        int liczba5 = scan.nextInt();

        System.out.println("Wynik dodawania dwóch wcześniej podanych liczb: " + (liczba4 + liczba5));
        System.out.println("Wynik odjemowania dwóch wcześniej podanych liczb: " + (liczba4 - liczba5));
        System.out.println("Wynik mnożenia dwóch wcześniej podanych liczb: " + (liczba4 * liczba5));
        System.out.println("Wynik dzielenia dwóch wcześniej podanych liczb: " + (liczba4 / liczba5));
        System.out.println("Reszta z dzielenia dwóch wcześniej podanych liczb: " + (liczba4 % liczba5));

    }
}
