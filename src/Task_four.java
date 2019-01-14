import java.util.Scanner;

public class Task_four {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double x, y, z, avg;
        int res;
        System.out.println("Введите первое число:"); // ввести первое число
        x = in.nextDouble();
        System.out.println("Введите второе число:"); // ввести второе число
        y = in.nextDouble();
        System.out.println("Введите третье число:"); // ввести третье число
        z = in.nextDouble();
        avg = (x + y + z)/3; // посчитать среднее арифметическое введенных чисед
        System.out.println("Среднее арифметическое число:" + avg);
        res = (int)avg / 2; // деление без остатка
        System.out.println("Деление без остатка:" + res);

        if (res > 3){ // если полученное число больше 3, то ..
            System.out.println("Программа выполнена корректно");
        }
    }
}
