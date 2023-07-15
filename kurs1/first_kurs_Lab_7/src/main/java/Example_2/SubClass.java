package Example_2;

public class SubClass extends SuperClass{
    public int numb;

    public SubClass(int numb, String str1) {
        super();
        System.out.println(numb+" "+ str1);
    }

    public SubClass(String str1) {
        super(str1);
    }

    @Override
    public void getNumberAndString(int numb, String str1) {
        super.getNumberAndString(numb, str1);
    }

    @Override
    public void getAnything() {
        super.getAnything();
    }

    @Override
    public void getAnything(String str1) {
        super.getAnything(str1);
    }

    @Override
    public void getAnything(int numb) {
        super.getAnything(numb);
    }
}
