//listing 9
// Пример захвата переменной из объемлющей области действия

interface MyFunc {
    int func(int n);
}

class VarCapture2 {
    public static void main(String args[]) {
        Integer m = new MyClass().method();
    }
}

class MyClass {
    private Integer num;                // это переменная экземпляра, ее можно видоизменять

    public Integer method() {
        final Integer localVar = 1;     // это локальная переменная, ее нельзя видоизменять

        MyFunc myLambda = (n) -> {
            int v = num + n + localVar;

            num++;
//            localVar++;
            return v;
        };

        num = 9;
//        localVar = 8;

        int func = myLambda.func(localVar);
        return func;
    }
}