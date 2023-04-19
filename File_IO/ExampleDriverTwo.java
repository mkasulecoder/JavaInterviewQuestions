public class ExampleDriverTwo {

    public static String concatName(String s1, String s2) throws NullPointerException {
        if (s1 == null || s2 == null)
            throw new NullPointerException("Null argument"); // #3 NULL
        else
            return s1 + s2;

    }

}

class ExceptionDriver {
    public static void someMethod(String s1, String s2) {

        try {
            String s = ExampleDriverTwo.concatName(s1, s2); // #2 then finally
            System.out.println(s);
        }

        finally {
            System.out.println("In the finally Block of someMethod "); // #2 Will skip ("End of someMethod) out since
                                                                       // there is no catch
        }

        System.out.println("End of someMethod");
    }

    public static void main(String[] args) {
        try {
            someMethod(null, "Hello"); // #1
            someMethod("Hi", "Hello");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("In the finally Block of main "); // #4 after concat

        }
        System.out.println("End of main!"); // #5 end

    }
}
