package Example_5;

public class SubClass2 extends SuperClass {

    public SubClass2(String str1) {
        super(str1);
    }
    private char ch1;

    public SubClass2(String str1, char ch1) {
        super(str1);
        this.ch1 = ch1;
    }

    @Override
    public String toString() {
        return "SubClass2{" +
                "ch1=" + ch1 +
                '}';
    }
}
