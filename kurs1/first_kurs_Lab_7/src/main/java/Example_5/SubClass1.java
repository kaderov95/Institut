package Example_5;

public class SubClass1 extends SuperClass{
    public SubClass1(String str1) {
        super(str1);
    }
    private int num1;

    public SubClass1(String str1, int num1) {
        super(str1);
        this.num1 = num1;
    }

    @Override
    public String toString() {
        return "SubClass1{" +
                "num1=" + num1 +
                '}';
    }
}
