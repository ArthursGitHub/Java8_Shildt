//listing 14
// Ссылка на статический метод, передаваемой в качестве аргумента функции

import java.util.*;

class MyClass {
    private int val;

    MyClass(int v) {
        val = v;
    }

    int getVal() {
        return val;
    }
}

class UseMethodRef {

    static int compareMC(MyClass a, MyClass b) {
        return a.getVal() - b.getVal();
    }

    public static void main(String args[]) {
        ArrayList<MyClass> al = new ArrayList<MyClass>();

        al.add(new MyClass(1));
        al.add(new MyClass(4));
        al.add(new MyClass(2));

        Comparator<MyClass> pFun = UseMethodRef::compareMC;
        MyClass maxValObj = Collections.max(al, pFun);

        System.out.println("Maximum value is: " + maxValObj.getVal());
    }
}
