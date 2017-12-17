//listing 1
// Самое простое лямбда-выражение

interface MyNumber {
    double getValue();
}

class LambdaDemo {
    public static void main(String args[])
    {
        MyNumber myNum;
//1)
        myNum = () -> 123.45;
        double value = myNum.getValue();
        System.out.println("A fixed value: " + value);
//2)
        myNum = () -> Math.random() * 100;
        value = myNum.getValue();
        System.out.println("A random value: " + value);
    }
}
