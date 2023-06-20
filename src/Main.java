import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe();
      /*  Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Enter the range: ");
        int range = scanner.nextInt();

        for (int i = 0; i <= range; i++) {
            System.out.println(number + "*" + i + "=" + number * i);
        }

        System.out.println();*/

        System.out.print("Multiplication table\n");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }
}

