//listing 16
// Переопределение обобщенного метода в обобщенном классе.

class Gen<T> {
    T ob;

    Gen(T o) {
        ob = o;
    }

    T getob() {
        System.out.print("SuperClass: ");
        return ob;
    }
}

class Gen2<T> extends Gen<T> {
    Gen2(T o) {
        super(o);
    }

    T getob() {                         // метод переопределен
        System.out.print("SubClass(): ");
        return ob;
    }
}

class OverrideDemo {
    public static void main(String args[]) {
//1)
        Gen<Integer> iOb = new Gen<Integer>(88);
        Gen2<Integer> iOb2 = new Gen2<Integer>(99);
        Gen2<String> strOb2 = new Gen2<String>("Generics Test");

        System.out.println(iOb.getob());
        System.out.println(iOb2.getob());
        System.out.println(strOb2.getob());
//2)
        Gen<Integer> iOb3 = new Gen2<Integer>(99);
        Gen<String> strOb3 = new Gen2<String>("Generics Test");

        System.out.println(iOb3.getob());
        System.out.println(strOb3.getob());
    }
}
