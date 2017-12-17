//listing 12
// Ссылка на метод передается как аргумент функции.
// Причем сам объект передается как ссылка через первый аргумент при вызове метода

interface MyFunc<T> {
    boolean func(T v1, T v2);
}

class MyClass {
    private int hTemp;

    MyClass(int ht) {
        hTemp = ht;
    }

    boolean sameTemp(MyClass ht2) {
        return hTemp == ht2.hTemp;
    }

    boolean lessThanTemp(MyClass ht2) {
        return hTemp < ht2.hTemp;
    }
}

class InstanceMethWithObjectRefDemo {

    static <T> int counter(T[] arr, T v2, MyFunc<T> pFunc) {
        int count = 0;

        for (T v1 : arr) {
            if (pFunc.func(v1, v2)) {   // первый аргумент уходит на указатель "this" для вызываемого объекта,
                count++;                // второй - на аргумент метода sameTemp(MyClass ht2)
            }
        }
        return count;
    }

    public static void main(String args[]) {
        int count;

        MyClass[] weekDayHighs = {new MyClass(89), new MyClass(82),
                                    new MyClass(90), new MyClass(89),
                                    new MyClass(89), new MyClass(91),
                                    new MyClass(84), new MyClass(83)};

        MyClass[] weekDayHighs2 = {new MyClass(32), new MyClass(12),
                                    new MyClass(24), new MyClass(19),
                                    new MyClass(18), new MyClass(12),
                                    new MyClass(-1), new MyClass(13)};

        MyFunc<MyClass> sameTemp = MyClass::sameTemp;           // Ссылка на метод экземпляра
        MyFunc<MyClass> lessThanTemp = MyClass::lessThanTemp;

        count = counter(weekDayHighs2, new MyClass(12), sameTemp);
        System.out.println(count + " days had a high of 12");

        count = counter(weekDayHighs, new MyClass(89), lessThanTemp);   // Одна и та же ссылка используется для двух объектов
        System.out.println(count + " days had a high less than 89");

        count = counter(weekDayHighs2, new MyClass(19), lessThanTemp);
        System.out.println(count + " days had a high of less than 19");
    }
}

/*
    MyClass::sameTemp
        равносильна
    (x, y) -> x.sameTemp(y)
*/
