import java.util.Scanner;

public class MaxAndCoffee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Количество чашек кофе в пачке?:");
        int a = scanner.nextInt();
        System.out.println("Какое количество чашек кофе выпивает Макс?:");
        int b = scanner.nextInt();
        int x = a / b;
        System.out.println("Кофе у Макса осталось на " + x + " дн.");
    }
}
