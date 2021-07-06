import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(); //стипендия Иванова
        int b = scanner.nextInt(); //стипендия Петрова
        int c = scanner.nextInt(); //стипендия Сидорова
        if (a < b & a < c) {
            if (b > c) {
                System.out.println(b - a);
            } else System.out.println(c - a);
        } else if (b < a & b < c) {
            if (a > c) {
                System.out.println(a - b);
            } else System.out.println(c - b);
        } else if (c < b & c < a) {
            if (b > a){
                System.out.println(b - c);
            } else System.out.println(a - c);
        }
    }
}
