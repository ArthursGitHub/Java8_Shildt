//listing 11
// Ссылка на метод экземпляра передается как аргумент функции.

interface StringFunc {
    String func(String n);
}

class MyStringOps {

    String strReverse(String str) {
        String result = "";
        int i;

        for (i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}

class MethodRefDemo2 {

    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String args[]) {
        String inStr = "Lambdas add power to Java";
        String outStr;

        StringFunc strReverse = new MyStringOps()::strReverse;  // Ссылка на метод экземпляра
        outStr = stringOp(strReverse, inStr);
//      outStr = stringOp(new MyStringOps()::strReverse, inStr);    // или так

        System.out.println("String reversed: " + outStr);
    }
}

/*
    new MyStringOps()::strReverse
        равносильна
    (x) -> new MyStringOps().strReverse(x)
*/
