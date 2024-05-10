import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            System.out.print("nece litr benzin elave etmek isteyirsiz: ");
            int benzin = sc.nextInt();

            Car car = new Car("Mercedes", "G class", 100000, 50, benzin);
            System.out.println("depoda olan benzin: " + car.getFuel());
    }
}