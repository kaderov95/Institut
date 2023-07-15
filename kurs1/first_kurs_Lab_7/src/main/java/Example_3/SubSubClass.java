package Example_3;

public class SubSubClass extends SubClass {
    public String str2;

    public SubSubClass(int number1,char chnum1,String strnum2) {
        super(number1,chnum1);
        this.str2=strnum2;

    }

    @Override
    public String toString() {
        return "SubSubClass{" +
                "str1='" + ch1 + '\'' +
                ", str2='" + str2 + '\'' +
                ", numb=" + numb +
                '}';
    }
}
