//listing 10
// Ссылка на статический метод передается как аргумент функции.

interface StringFunc {
    String func(String n);
}

class MyStringOps {

    static String strReverse(String str) {
        String result = "";
        int i;

        for (i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}

class MethodRefDemo {

    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String args[]) {
        String inStr = "Lambdas add power to Java";
        String outStr;

        StringFunc strReverse = MyStringOps::strReverse;    // Ссылка на статический метод
        outStr = stringOp(strReverse, inStr);
//      outStr = stringOp(MyStringOps::strReverse, inStr);    // или так

        System.out.println("String reversed: " + outStr);
    }
}

/*
    MyStringOps::strReverse
        равносильна
    (x) -> MyStringOps.strReverse(x)
*/
