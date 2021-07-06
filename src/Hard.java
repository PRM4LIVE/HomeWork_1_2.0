import java.util.Scanner;

public class Hard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt(); //сторона таблицы Х
        int W = scanner.nextInt(); //сторона таблицы Y
        int K = scanner.nextInt(); //количество свободных клеток
        int N = scanner.nextInt(); //количество талантов до "сложнаааа"
        int tbl = (H * W) - K;
        if (tbl >= N) {
            System.out.println("SLOZHNAAA!");
        } else System.out.println("#@$%&!!1");
    }
}
