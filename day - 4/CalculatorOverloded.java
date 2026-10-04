
class CalculatorOverload {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        CalculatorOverload c = new CalculatorOverload();

        System.out.println(c.add(10, 20));
        System.out.println(c.add(10, 20, 30));
    }
}