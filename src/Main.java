import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input1 = scanner.nextInt();

        int i = 1;

        while (i*i < 50) {
            System.out.println(i*i);
            i++;
        }
    }
}