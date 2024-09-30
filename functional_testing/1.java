import java.util.Scanner;

public class QuadraticEquationSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Giải phương trình bậc 2 ax^2 + bx + c = 0");
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();

        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();

        solveQuadraticEquation(a, b, c);

        scanner.close();
    }

    public static void solveQuadraticEquation(double a, double b, double c) {
       {
            double delta = b * b - 4 * a * c;

            if (delta > 0) {
                double x1 = (-b - Math.sqrt(delta)) / (2 * a);
                double x2 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.print("Phương trình có 2 nghiệm phân biệt:");
                System.out.print(" x1 = " + x1);
                System.out.print(" x2 = " + x2);
            } else if (delta == 0) {
                double x = -b / a;
                System.out.print("Phương trình có nghiệm kép:");
                System.out.print(" x = " + x);
            } else {
                System.out.print("Phương trình vô nghiệm.");
            }
        }
    }
}