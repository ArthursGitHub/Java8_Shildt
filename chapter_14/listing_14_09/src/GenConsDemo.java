//listing 9
// Применение обобщенного конструктора

class GenCons {
    private double val;

    <T extends Number> GenCons(T arg) { // Обобщенный конструктор
        val = arg.doubleValue();
    }

    void showval() {
        System.out.println("val: " + val);
    }
}

class GenConsDemo {
    public static void main(String args[]) {

        GenCons test = new GenCons(100);    // вызов обобщенного конструктора
        GenCons test2 = new GenCons(123.5F);

        test.showval();
        test2.showval();
    }
}
