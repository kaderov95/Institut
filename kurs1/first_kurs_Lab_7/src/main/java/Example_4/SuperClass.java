package Example_4;

public class SuperClass {
    public char ch1;

    public SuperClass(char ch1) {

        this.ch1 = ch1;
    }
    public SuperClass (SuperClass clone){
        this(clone.ch1);
    }
}
