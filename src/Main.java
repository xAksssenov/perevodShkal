import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int Сelsius;
        double Fahrenheit;
        double Calvin;
        Scanner scanner = new Scanner (System.in);
        System.out.print("Введите градус по Цельсию ");
        Сelsius = scanner.nextInt();
        System.out.print ("Градусы цельсия в градусах Фаренгейта будут равны: ");
        Fahrenheit = Сelsius * 1.8 + 32;
        System.out.println (Fahrenheit);
        System.out.print ("Градусы цельсия в градусах Кельвина будут равны: ");
        Calvin = Сelsius - 273.15;
        System.out.println (Calvin);
    }
}