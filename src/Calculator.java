public class Calculator {
    double value1;
    double value2;

    public Calculator(double value1, double value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public void sum() {
        System.out.println("Сумма " + (value1 + value2));
    }

    public void differnce() {
        System.out.println("Разница " + (value1 - value2));
    }

    public void multiplicate() {
        System.out.println("Умножение " + (value1 * value2));
    }

    public void division() {
        System.out.println("Деление " + (value1 / value2));
    }
}
