package Example_2;

public class Example_2 {
    public static class Symbol2 {
        private char ch1;
        private char ch2;

        public void setCh1(char ch1) {
            this.ch1 = ch1;
        }

        public void setCh2(char ch2) {
            this.ch2 = ch2;
        }

        public void getCodeSymbol(){
            int value = ch2-ch1;
            for(int i=0;i<=value;i++){
                char ch3 = (char)(ch1+i);
                System.out.println(ch3);
            }
        }
    }
}
