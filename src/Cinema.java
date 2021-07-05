import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество фильмов которые хочет посмотреть Макс (от 0 до 20):");
        int n = scanner.nextInt();//Количество новых фильмов
        if (0 <= n & n <= 20) {
            System.out.println("Введите сумму на карте Макса (от 0 до 6000):");
            int m = scanner.nextInt(); //Количество денег у Макса
            if (0 <= m & m <= 6000) {
                int sum = n * 250 + 650; //Необходимое количество денег
                if (sum <= m) {
                    System.out.println("YES");
                } else System.out.println("NO");} else System.out.println("Сумма на карте Макса должна быть от 0 до 6000");
            } else System.out.println("Количство фильмов должно быть от 0 до 20");
        }
    }
