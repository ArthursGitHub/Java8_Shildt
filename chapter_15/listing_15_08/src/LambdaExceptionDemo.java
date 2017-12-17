//listing 8
// Эксепшены в лямбда-выражении

interface DoubleNumericArrayFunc {
    double func(double[] n) throws EmptyArrayException;
}

class EmptyArrayException extends Exception {
    EmptyArrayException() {
        super("Array Empty");
    }
}

class LambdaExceptionDemo {

    public static void main(String args[]) {
        double[] values = {1.0, 2.0, 3.0, 4.0};

        DoubleNumericArrayFunc average = (n) -> {
            double sum = 0;

            if (n.length == 0) {
                throw new EmptyArrayException();
            }
            for (int i = 0; i < n.length; i++) {
                sum += n[i];
            }
            return sum / n.length;
        };
//1)
        double func = 0;
        try {
            func = average.func(values);
            System.out.println("The average is " + func);
        } catch (EmptyArrayException e) {
            e.printStackTrace();
        }
//2)
        try {
            func = average.func(new double[0]);
            System.out.println("The average is " + func);
        } catch (EmptyArrayException e) {
            e.printStackTrace();
        }
    }
}
