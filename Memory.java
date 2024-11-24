import java.util.Random;
import java.util.Scanner;

public class Memory {

    public static void main(String[] args) {
        String x = "x";
        Random r = new Random();
        String phone_number = "+7 9" + r.nextInt(10, 99) + " " + r.nextInt(100, 999) + " " + r.nextInt(10, 99) + " " + r.nextInt(10, 99);
        System.out.println(phone_number + "\nКак только вы запомните, напишите хоть что-то:");
        Scanner sc = new Scanner(System.in);
        sc.nextLine(); // Ждём нажатия Enter
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 50; j++) {
                System.out.print(x);
            }
            System.out.println();
        }
        System.out.println("Введите что запомнили: ");
        String remember = sc.nextLine();

        if (phone_number.equals(remember)) {
            System.out.println("Ты молодец!!!");
        } else {
            while (!phone_number.equals(remember)) {
                System.out.println("Неправильно, попробуй еще раз(((");
                remember = sc.nextLine();
            }
            System.out.println("Вот теперь ты молодец!!!");
        }
    }
}
