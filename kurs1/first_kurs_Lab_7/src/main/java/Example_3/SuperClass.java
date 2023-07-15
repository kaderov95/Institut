package Example_3;

public class SuperClass {
    public int numb;



    public void setNumb(int numb) {
        this.numb = numb;
    }
    public SuperClass(int number1){
        this.numb=number1;
    }

    @Override
    public String toString() {
        return "SuperClass{" +
                "numb=" + numb +
                '}';
    }
}
