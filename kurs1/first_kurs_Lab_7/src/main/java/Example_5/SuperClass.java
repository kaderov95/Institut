package Example_5;

public class SuperClass {
    private String str1;

    public SuperClass(String str1) {
        this.str1 = str1;
    }

    @Override
    public String toString() {
        return "SuperClass{" +
                "str1='" + str1 + '\'' +
                '}';
    }
}
