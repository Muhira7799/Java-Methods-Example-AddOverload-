public class AddOverload {
    int a;

    void add() {
        System.out.println("Hello");
    }

    int multiply(int a, int b) {
        int c = a * b;
        System.out.println("c = " + c);
        return c;
    }

    public static void main(String[] args) {
        AddOverload obj = new AddOverload();
        obj.add();
        obj.multiply(4, 5);
    }
}