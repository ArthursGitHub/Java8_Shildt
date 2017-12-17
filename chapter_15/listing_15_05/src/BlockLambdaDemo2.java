//listing 5
// Блочное лямбда-выражение с одним параметром.

interface StringFunc {
    String func(String n);
}

class BlockLambdaDemo2 {
    public static void main(String args[]) {

        StringFunc reverse = (str) -> {
            String result = "";
            int i;

            for (i = str.length() - 1; i >= 0; i--)
            {
                result += str.charAt(i);
            }

            return result;
        };

        String val = reverse.func("Lambda");
        System.out.println("Lambda reversed is " + val);
    }
}
