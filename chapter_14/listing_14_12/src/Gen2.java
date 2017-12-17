//listing 12
// Расширение обобщенных классов

class Gen<T> {
    T ob;

    Gen(T o) {
        ob = o;
    }

    T getob() {
        return ob;
    }
}

class Gen2<T> extends Gen<T> {

    Gen2(T o) {
        super(o);
    }
}
