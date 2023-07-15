package Example_4;

public class Example_4 {
    public static class Chisla {
        private int number;
        private char symbol;
        private double argument;

        public Chisla(int number, char symbol) {
            this.number = number;
            this.symbol = symbol;
            System.out.println(number);
            System.out.println(symbol);
        }

        public Chisla(double argument) {
            this.argument = argument;
            System.out.println((char)argument);
            double arg = argument*100;
            int arg2 = (int)argument*100;
            int arg1 = (int) arg;
            int arg3 = arg1-arg2;
            System.out.println(arg3);
        }
    }
}
