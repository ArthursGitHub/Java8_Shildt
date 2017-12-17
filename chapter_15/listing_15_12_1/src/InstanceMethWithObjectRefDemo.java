//listing 12
// Ссылка на метод передается как аргумент функции.
// Причем сам объект передается как ссылка через первый аргумент при вызове метода

interface MyFunc<T> {
    boolean func(T v1, T v2);
}

class MyClass {
    public int i;

    MyClass(int ii) {
        i = ii;
    }

    boolean function(MyClass myClass) {
        return i == myClass.i;
    }
}

class InstanceMethWithObjectRefDemo {
    static <T> int staticFun(T u, T v, MyFunc<T> pFunc) {
        pFunc.func(u, v);       // первый аргумент уходит на указатель "this" для вызываемого объекта,
        return 0;               // второй - на аргумент метода function(MyClass myClass)
    }

    public static void main(String args[]) {
        int count;

        MyFunc<MyClass> pFunc = MyClass::function;
        count = staticFun(new MyClass(1), new MyClass(2), pFunc);
    }
}
