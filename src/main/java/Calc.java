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
        Integer z = scanner.nextInt();
        if ( z == 1 ){
            System.out.println("Выбран поиск максимального слова в массиве");
            System.out.println("Введе размерность массива ");
            Scanner in = new Scanner(System.in);
            int size = in.nextInt();
            String[] Massiv = new String[size] ;
            System.out.println("Введите элементы массива,т.е слова");
            String bigWord = "";// переменная для хранения слова с наибольшим числом символов

            for (int i = 0; i < Massiv.length; i++) {
                String B = scanner.next();
                Massiv[i] = B;
                String A = Massiv[i];
                System.out.println(A);
                System.out.println(A.length() );
                if (Massiv[i].length() > bigWord.length()) {
                    bigWord = Massiv[i];


                }
            }
            System.out.println("Самое большое слово в массиве" + bigWord);
        }
        else  if ( z == 2 ) {
            System.out.println("Выбран калькулятор");
            System.out.println("Введите оператор ");
            String operator;
            operator = scanner.next();
                  if(operator.equals("+")){
                    System.out.println("Выбран оператор сложения");
                    System.out.print("Введите первое число: ");
                    float x = scanner.nextFloat();
                    System.out.printf ("%.4f\n ",x);
                    System.out.print("Введите второе число: ");
                    float y = scanner.nextFloat();
                    System.out.printf ("%.4f\n ",y);
                    System.out.print("Сумма: ");
                    System.out.println(x+y);
                  }if(operator.equals("-")){
                     System.out.println("Выбран оператор вычитания");
                     System.out.print("Введите первое число: ");
                     float x = scanner.nextFloat();
                     System.out.printf ("%.4f\n ",x);
                     System.out.print("Введите второе число: ");
                     float y = scanner.nextFloat();
                     System.out.printf ("%.4f\n ",y);
                     System.out.print("Сумма: ");
                     System.out.println(x-y);
                 }if(operator.equals("*")){
                    System.out.println("Выбран оператор умножения");
                    System.out.print("Введите первое число: ");
                    float x = scanner.nextFloat();
                    System.out.printf ("%.4f\n ",x);
                    System.out.print("Введите второе число: ");
                    float y = scanner.nextFloat();
                    System.out.printf ("%.4f\n ",y);
                    System.out.print("Сумма: ");
                    System.out.println(x*y);
                }if (operator.equals("/")){
                    System.out.println("Выбран оператор деления");
                    System.out.print("Введите первое число: ");
                    float x = scanner.nextFloat();
                    System.out.printf ("%.4f\n ",x);
                    System.out.print("Введите второе число: ");
                    float y = scanner.nextFloat();
                    System.out.printf ("%.4f\n ",y);
                    System.out.print("Сумма: ");
                    System.out.println(x/y);
                }
            }
        }
    }