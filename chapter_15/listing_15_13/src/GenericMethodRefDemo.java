//listing 13
// Ссылка на обобщенный статический метод, передаваемой в качестве аргумента функции

interface MyFunc<T> {
    int func(T[] vals, T v);
}

class MyArrayOps {
    static <T> int countMatching(T[] vals, T v) {
        int count = 0;

        for (int i = 0; i < vals.length; i++)
            if (vals[i] == v)
                count++;

        return count;
    }
}

class GenericMethodRefDemo {

    static <T> int myOp(MyFunc<T> f, T[] vals, T v) {
        return f.func(vals, v);
    }

    public static void main(String args[]) {
        Integer[] vals = {1, 2, 3, 4, 2, 3, 4, 4, 5};
        String[] strs = {"One", "Two", "Three", "Two"};
        int count;
//1)
        MyFunc<Integer> countMatching = MyArrayOps::<Integer>countMatching;
        count = myOp(countMatching, vals, 4);
        System.out.println("vals contains " + count + " 4s");
//2)
        MyFunc<String> countMatching1 = MyArrayOps::<String>countMatching;
        count = myOp(countMatching1, strs, "Two");
        System.out.println("strs contains " + count + " Twos");
    }
}
