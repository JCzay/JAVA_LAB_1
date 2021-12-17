import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.5 */

        /* zad.1 podziel swój wiek przez modulo 3 i jeśli twój wiek zwraca 0 wyświetl napis "Podzielny przez 3",
         * w innym wypadku "Niepodzielny przez 3" użyj kontrukcji if else
         * */

        double wiek = 22;

        if (wiek%3 == 0) {
            System.out.println("Podzielny przez 3");
        } else {
            System.out.println("Niepodzielny przez 3");
        }

        /* zad.2 użyj parametru trójargumentowego aby sprawdzić parzystośc nr. indeksu */

        int indeks = 57652;
        String parzystość = (indeks % 2 == 0) ? "Parzysty" : "Nieparzysty";
        System.out.println("Twój indeks jest: " + parzystość);



        /* zad.3 wpisz z klawiatury liczbę zmiennoprzecinkową (użyj klasy Scanner z poprzednich ćwiczeń)
         * i stwórz konstrukcję else if z dowolnymi komunikatami */

        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj liczbę zmiennoprzecinkową: ");
        double liczba = scan.nextDouble();

        if (liczba < 5) {
            System.out.println(" Twoja liczba jest mniejsza od 5!");
        } else if (5 == liczba) {
            System.out.println(" Twoja liczba jest równa 5!");
        } else {
            System.out.println("Twoja liczba jest większa od 5!");
        }







    }
}
