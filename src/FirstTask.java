import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        try {
            double a = scanner.nextDouble(); //сделать возможным ввод текста

            if (a == 3) {
                System.out.println("Три");
            } else if (a == 7) {
                System.out.println("Семь");
            } else {
                System.out.println("Что-то другое");
            }
        } catch (Exception e) {
            System.out.println("Что-то другое");
        }
    }
}

