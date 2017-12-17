//listing 16
// Применение ссылки на конструктор обобщенного класса.

interface MyFunc<T> {
    MyClass<T> func(T n);
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

class ConstructorRefDemo2 {
    public static void main(String args[]) {

        MyFunc<Integer> myClassCons = MyClass<Integer>::new;    // ссылка на конструктор
        MyClass<Integer> mc = myClassCons.func(100);        // инстанцирование объекта

        System.out.println("val in mc is " + mc.getVal());
    }
}
