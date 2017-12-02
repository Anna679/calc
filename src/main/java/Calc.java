import java.util.Scanner;
/** Это класс калькулятор
 * Складывает дробные числа
 @author ann */
public class Calc {
    /** Это метод main
     * Запускает программу
     @param args */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        float x = scanner.nextFloat();
        System.out.printf ("%.4f\n ",x);
        System.out.print("Введите второе число: ");
        float y = scanner.nextFloat();
        System.out.printf ("%.4f\n ",y);
        System.out.print("Сумма: ");
        System.out.println(x+y);
    }
}

