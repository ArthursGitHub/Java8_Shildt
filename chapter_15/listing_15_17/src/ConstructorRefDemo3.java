//listing 17
// Применение ссылки на конструктор обычного и обобщенного класса.

interface MyFunc<R, T> {
    R func(T n);
}

class MyClass<T> {
    private T val;

    MyClass(T v) {
        val = v;
    }

    MyClass() {
        val = null;
    }

    T getVal() {
        return val;
    }
}

class MyClass2 {
    String str;

    MyClass2(String s) {
        str = s;
    }

    MyClass2() {
        str = "";
    }

    String getVal() {
        return str;
    }
}

class ConstructorRefDemo3 {
    static <R, T> R myClassFactory(MyFunc<R, T> cons, T v) {
        return cons.func(v);
    }

    public static void main(String args[]) {
//1)
        MyFunc<MyClass<Double>, Double> myClassCons = MyClass<Double>::new;
        MyClass<Double> mc = myClassFactory(myClassCons, 100.1);
        System.out.println("val in mc is " + mc.getVal());
//2)
        MyFunc<MyClass2, String> myClass2Cons = MyClass2::new;
        MyClass2 mc2 = myClassFactory(myClass2Cons, "Lambda");
        System.out.println("str in mc2 is " + mc2.getVal());
    }
}
