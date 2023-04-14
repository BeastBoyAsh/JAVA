import java.util.Scanner;

class Table3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n, i;
        System.out.println(" Enter Number.");
        n = sc.nextInt();

        for (i = 1; i <= 10; i++) {
            m = n * i;
            System.out.println(n + "X" + i + "=" + m);
        }
    }
}
