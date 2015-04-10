package nyc.c4q.reinardcox;

public class DivisorPatternArt {

    public static void main(String[] args) {
        printTable(10);


    }

    public static void printTable(int size) {

        String art = "@ ";

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i % j == 0 || j % i == 0) {
                    System.out.print("@ ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
