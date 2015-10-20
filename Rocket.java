import java.util.Scanner;

public class Rocket {
    public static void main(String args[]) {
        int size;

        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter size of rocket: ");
        size = scnr.nextInt();
        for (int line = 1; line <= size * 2 - 1; ++line) {
            for (int spcs = 1; spcs <= size * 2 - line; ++spcs) {
                System.out.print(" ");
            }
            for (int fSlash = 1; fSlash <= line; ++fSlash) {
                System.out.print("/");
            }
            for (int star = 1; star <= 2; ++star) {
                System.out.print("*");
            }
            for (int bSlash = 1; bSlash <= line; ++bSlash) {
                System.out.print("\\");
            }
            System.out.println();
        }

        System.out.print("+");
        for (int i = 1; i <= size * 2; ++i) {
            System.out.print("=*");
        }
        System.out.print("+");
        System.out.println();

        for (int line = 1; line <= size; ++line) {
            System.out.print("|");

            for (int dots = 1; dots <= size - line; ++dots) {
                System.out.print(".");
            }
            for (int tri = 1; tri <= line; ++tri) {
                System.out.print("/\\");
            }
            for (int dots2 = 1; dots2 <= size * 2 - line * 2; ++dots2) {
                System.out.print(".");
            }

            for (int tri = 1; tri <= line; ++tri) {
                System.out.print("/\\");
            }
            for (int dots = 1; dots <= size - line; ++dots) {
                System.out.print(".");
            }
            System.out.print("|");
            System.out.println();
        }

        for (int line1 = 1; line1 <= size; ++line1) {
            System.out.print("|");
            for (int dot = 1; dot < line1; ++dot) {
                System.out.print(".");
            }
            for (int tri = size; tri >= line1; --tri) {
                System.out.print("\\/");
            }
            for (int dota = 0; dota < line1 * 2 - 2; ++dota) {
                System.out.print(".");
            }
            for (int tri = size; tri >= line1; --tri) {
                System.out.print("\\/");
            }
            for (int dot = 1; dot < line1; ++dot) {
                System.out.print(".");
            }
            System.out.print("|");
            System.out.println();
        }

        System.out.print("+");
        for (int i = 1; i <= size * 2; ++i) {
            System.out.print("=*");
        }
        System.out.print("+");
        System.out.println();

        for (int line1 = 1; line1 <= size; ++line1) {
            System.out.print("|");
            for (int dot = 1; dot < line1; ++dot) {
                System.out.print(".");
            }
            for (int tri = size; tri >= line1; --tri) {
                System.out.print("\\/");
            }
            for (int dota = 0; dota < line1 * 2 - 2; ++dota) {
                System.out.print(".");
            }
            for (int tri = size; tri >= line1; --tri) {
                System.out.print("\\/");
            }
            for (int dot = 1; dot < line1; ++dot) {
                System.out.print(".");
            }
            System.out.print("|");
            System.out.println();
        }

        for (int line = 1; line <= size; ++line) {
            System.out.print("|");

            for (int dots = 1; dots <= size - line; ++dots) {
                System.out.print(".");
            }
            for (int tri = 1; tri <= line; ++tri) {
                System.out.print("/\\");
            }
            for (int dots2 = 1; dots2 <= size * 2 - line * 2; ++dots2) {
                System.out.print(".");
            }

            for (int tri = 1; tri <= line; ++tri) {
                System.out.print("/\\");
            }
            for (int dots = 1; dots <= size - line; ++dots) {
                System.out.print(".");
            }
            System.out.print("|");
            System.out.println();

        }

        System.out.print("+");
        for (int i = 1; i <= size * 2; ++i) {
            System.out.print("=*");
        }
        System.out.print("+");
        System.out.println();

        for (int line = 1; line <= size * 2 - 1; ++line) {
            for (int spcs = 1; spcs <= size * 2 - line; ++spcs) {
                System.out.print(" ");
            }
            for (int fSlash = 1; fSlash <= line; ++fSlash) {
                System.out.print("/");
            }
            for (int star = 1; star <= 2; ++star) {
                System.out.print("*");
            }
            for (int bSlash = 1; bSlash <= line; ++bSlash) {
                System.out.print("\\");
            }
            System.out.println();
        }
    }
}