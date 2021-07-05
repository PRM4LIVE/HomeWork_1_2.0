import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a == 3) {
            System.out.println("Три");
        } else if (a == 7) {
            System.out.println("Семь");
        } else {
            System.out.println("Что-то другое");
        }
    }
}
