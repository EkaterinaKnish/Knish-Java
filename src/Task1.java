import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число a");
        int a = 0;
        if (sc.hasNextInt()) {
            a = sc.nextInt();
        }


        System.out.println("Введите целое число b");
        int b = 0;
        if (sc.hasNextInt()) {
            b = sc.nextInt();
        }

        if (a > b) {


            System.out.println("a > b");

        } else if (a < b) {
            System.out.println("b > a");

        } else {
            System.out.println("b > a");
        }
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
    }
}






