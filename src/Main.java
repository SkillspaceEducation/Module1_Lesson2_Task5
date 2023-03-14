import java.util.Scanner;

/*
Коэффициенты a,b,c квадратного уравнения задаются через System.in.
Надо вывести на экран один или два корня уравнения если они есть, иначе вывести на экран “Корней нет”.
Параметр a гарантированно не равен 0.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Программа для расчет корней квадратного уравнения вида ax2 + bx + c = 0");
        System.out.println("Введите коэффициенты a, b и с через пробел:");
        Scanner scanner = new Scanner(System.in);
        int coefA = getCoef(scanner);
        int coefB = getCoef(scanner);
        int coefC = getCoef(scanner);
        scanner.close();
        double discrim = getDiscrim(coefA, coefB, coefC);
        outCalcRoot(coefA, coefB, coefC, discrim);
    }

    private static int getCoef(Scanner scanner) {
        return scanner.nextInt();
    }

    private static void outCalcRoot(int a, int b, int c, double discrim) {
        if (discrim > 0) {
            double root1 = ((-b - Math.sqrt(discrim)) / 2 * a);
            double root2 = ((-b + Math.sqrt(discrim)) / 2 * a);
            System.out.printf("Урвнение (%da +" + "%db +" + " %dc = 0) имеет два корня равных %.2f и %.2f",
                    a, b, c, root1, root2);
        } else if (discrim == 0) {
            int root1 = ((-b / 2 * a));
            System.out.printf("Урвнение (%da +" + "%db +" + " %dc = 0) имеет два равных корня %d",
                    a, b, c, root1);
        } else System.out.println("Уравнение не имеет корней");
    }

    private static double getDiscrim(int a, int b, int c) {
        return Math.pow(b, 2) - 4 * a * c;
    }
}