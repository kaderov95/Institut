package Example_3;

public class SubClass extends SuperClass {
    public char ch1;

    public SubClass(int number1,char chnum1) {
        super(number1);
        this.ch1=chnum1;
    }

    public SubClass(int number1) {
        super(number1);
    }



    @Override
    public String toString() {
        return "SubClass{" +
                "str1='" + ch1 + '\'' +
                ", numb=" + numb +
                '}';
    }
}
