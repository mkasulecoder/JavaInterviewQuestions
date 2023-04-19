class ExceptionExamples {

    public static String concatName(String s1, String s2) throws NullPointerException {
        if (s1 == null || s2 == null)
            throw new NullPointerException("Null argument");
        else
            return s1 + s2;

    }

}

public class ExampleDriver {
    public static void someMethod(String s1, String s2) {

        try {
            String s = ExceptionExamples.concatName(s1, s2);
            System.out.println(s);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        finally {
            System.out.println("In the finally Block of someMethod ");
        }

        System.out.println("End of someMethod");
    }

    public static void main(String[] args) {
        try {
            someMethod(null, "Hello");
            someMethod("Hi", "Hello");
        }

        finally {
            System.out.println("In the finally Block of main ");

        }
        System.out.println("End of main!");

    }
}
