//listing 7
// Лямбда-выражение передается как аргумент функуии

interface StringFunc {
    String func(String n);
}

class LambdasAsArgumentsDemo {

    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String args[]) {
        String inStr = "Lambdas add power to Java";
        String outStr;
//1)
        StringFunc stringFunc = (str) -> str.toUpperCase();
        outStr = stringOp(stringFunc, inStr);
        System.out.println("The string in uppercase: " + outStr);
//2)
        StringFunc stringFunc1 = (str) -> {
            String result = "";
            int i;

            for (i = 0; i < str.length(); i++) {
                if (str.charAt(i) != ' ')
                    result += str.charAt(i);
            }
            return result;
        };
        outStr = stringOp(stringFunc1, inStr);
        System.out.println("The string with spaces removed: " + outStr);
//3)
        StringFunc reverse = (str) -> {
            String result = "";
            int i;

            for (i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;
        };
        System.out.println("The string reversed: " + stringOp(reverse, inStr));
    }
}
