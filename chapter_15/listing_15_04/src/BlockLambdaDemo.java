//listing 4
// Блочное лямбда-выражение с одним параметром.

interface NumericFunc {
    int func(int n);
}

class BlockLambdaDemo {
    public static void main(String args[]) {

        NumericFunc factorial = (n) -> {
            int result = 1;

            for (int i = 1; i <= n; i++)
                result = i * result;

            return result;
        };

        int val = factorial.func(3);
        System.out.println("The factoral of 3 is " + val);
    }
}
