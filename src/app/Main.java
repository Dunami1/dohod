package app;

public class Main {

    public static void main(String[] args) {

        double dohod = 30000;
        double tax = calculateTax(dohod);
        System.out.printf("Сума податку від доходу %.2f становить %.2f%n", dohod, tax);
    }

    private static double calculateTax(double dohod) {
        double tax;

        if (dohod <= 10000) {
            tax = dohod * 0.025;
        } else if (dohod <= 25000) {
            tax = 10000 * 0.025 + (dohod - 10000) * 0.043;
        } else {
            tax = 10000 * 0.025 + 15000 * 0.043 + (dohod - 25000) * 0.067;
        }

        return tax;
    }


}
