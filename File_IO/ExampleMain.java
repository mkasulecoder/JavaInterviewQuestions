public class ExampleMain {

    public static void main(String[] args) {
        Example ex = new Example();
        try {
            ex.call();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

class Example {
    private int count = 0;

    public void call() {
        add(2);
        add(3);
        System.out.println("in call method");
        div(0);
    }

    public void add(int val) {
        count += val; // =5
        System.out.println("in add method");

    }

    public void div(int val) {

        count /= val; // 5div0 == Arithmentic error
        System.out.println("in div method");
    }
}
