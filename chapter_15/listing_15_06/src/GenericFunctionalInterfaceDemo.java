//listing 6
// Дженерики в блочном лямбда-выражение с одним параметром.

interface SomeFunc<T> {
    T func(T t);
}

class GenericFunctionalInterfaceDemo {
    public static void main(String args[]) {
//1)
        SomeFunc<String> reverse = (str) -> {
            String result = "";
            int i;

            for (i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;
        };

        String val = reverse.func("Lambda");
        System.out.println("Lambda reversed is " + val);
//2)
        SomeFunc<Integer> factorial = (n) -> {
            int result = 1;

            for (int i = 1; i <= n; i++) {
                result = i * result;
            }

            return result;
        };

        Integer func = factorial.func(3);
        System.out.println("The factoral of 3 is " + func);
    }
}
