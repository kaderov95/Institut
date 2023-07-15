package Example_1;

public class Example_1 {
    public static class Symbol {

        private char char1;

        public void setChar1(char char1) {
            this.char1 = char1;
        }

        public int codeSymbol() {
            return char1;
        }

        public void codeAndValue() {
            System.out.println("Код символа " + (int) char1);
            System.out.println("Символ " + char1);
        }
    }
}