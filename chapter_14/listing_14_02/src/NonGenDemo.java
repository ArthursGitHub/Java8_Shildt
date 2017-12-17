//listing 2
// Класс Gen без дженериков

class NonGen {
    Object ob;

    NonGen(Object o) {
        ob = o;
    }

    Object getob() {
        return ob;
    }

    void showType() {
        System.out.println("Type of ob is " + ob.getClass().getName());
    }
}

class NonGenDemo {
    public static void main(String args[]) {
//1)
        NonGen iOb = new NonGen(88);
        iOb.showType();
        int v = (Integer) iOb.getob();
        System.out.println("value: " + v);
//2)
        NonGen strOb = new NonGen("Non-Generics Test");
        strOb.showType();
        String str = (String) strOb.getob();
        System.out.println("value: " + str);
//3)
        iOb = strOb;
        v = (Integer) iOb.getob(); // run-time error!
    }
}
