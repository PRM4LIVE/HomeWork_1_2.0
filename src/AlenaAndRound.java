import java.util.Scanner;

public class AlenaAndRound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 5; // Количество знакомых Макса
        int m = 1371; // место которое заняла Алена
        int [] a = new int [n];
        a [0] = 1045;
        a [1] = 956;
        a [2] = 2456;
        a [3] = 2152;
        a [4] = 2;
        int y=0;
        for (int i = 0; i < a.length; i++) {
            if (m < a[i]){
                y = y+1;
            }
        }
        System.out.println(y);
    }
}
