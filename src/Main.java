import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter("output.txt");
        //              Чесночные гренки
        System.out.println("Введите ингридиенты через заяптую и их граммовку через тире: ");
        String Ingridients = sc.nextLine();

        System.out.println("Введите способ приготовления блюда:");
        String Details = sc.nextLine();

        pw.println(Ingridients);
        pw.println(Details);

        pw.close();
    }
}