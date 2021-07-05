import java.util.Scanner;

public class PosterPaint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int sum = n * (h * w * 100);
        System.out.println(sum);
    }
}
