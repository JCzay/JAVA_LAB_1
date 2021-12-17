import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.4 */

        /* zad.1 proszę dodać kilka złożonych operacji uzywając kilku operatorów arytmetycznych i logicznych */

        boolean a = true;
        boolean b = false;

        int x = 5;
        int y = 55;
        int z = 555;

        System.out.println(x > y);
        System.out.println(x < y);
        System.out.println(x > z);
        System.out.println(x < z);
        System.out.println(true && false);
        System.out.println(true && true);
        System.out.println(false && false);
        System.out.println(true || false);
        System.out.println(true || true);
        System.out.println(false || false);
        System.out.println(x % 5 == 0);
        System.out.println(y % 5 == 0);
        System.out.println(z % 5 == 0);
        System.out.println((x * y * z) > 0);
        System.out.println((x * y * z) <= 0);

    }
}
