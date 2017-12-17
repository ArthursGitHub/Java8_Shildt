//listing 6
// Применение метасимвольного аргумента

class Stats<T extends Number> {
    T[] nums;

    Stats(T[] o) {
        nums = o;
    }

    double average() {
        double sum = 0.0;

        for (int i = 0; i < nums.length; i++)
            sum += nums[i].doubleValue();

        return sum / nums.length;
    }

    boolean sameAvg(Stats<?> ob) {  // метасимвольный аргумент Stats<?> означает: любой тип Stats<> , параметризированный любым типом
        if (average() == ob.average())
            return true;

        return false;
    }
}

class WildcardDemo {
    public static void main(String args[]) {
//1)
        Integer inums[] = {1, 2, 3, 4, 5};
        Stats<Integer> iob = new Stats<Integer>(inums);
        double v = iob.average();
        System.out.println("iob average is " + v);

        Double dnums[] = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats<Double> dob = new Stats<Double>(dnums);
        double w = dob.average();
        System.out.println("dob average is " + w);

        Float fnums[] = {1.0F, 2.0F, 3.0F, 4.0F, 5.0F};
        Stats<Float> fob = new Stats<Float>(fnums);
        double x = fob.average();
        System.out.println("fob average is " + x);
//2)
        System.out.print("Averages of iob and dob ");
        if (iob.sameAvg(dob))           // метасимвольный аргумент в функции sameAvg позволяет здесь в качестве аргумента использовать объект другого типа
            System.out.println("are the same.");
        else
            System.out.println("differ.");

        System.out.print("Averages of iob and fob ");
        if (iob.sameAvg(fob))
            System.out.println("are the same.");
        else
            System.out.println("differ.");
    }
}
