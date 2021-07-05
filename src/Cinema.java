public class Cinema {
    public static void main(String[] args) {
        int a = 2; //Количество новых фильмов
        int b = 1500; //Количество денег у Макса
        int c = 650; //Стоимость интернета
        int sum = a * 250 + c; //Необходимое количество денег
        if (sum <= b) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
