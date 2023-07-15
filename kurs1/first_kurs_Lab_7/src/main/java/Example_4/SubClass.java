package Example_4;

public class SubClass extends SuperClass {
    public String str1;

    public SubClass(char ch1) {
        super(ch1);
    }

    public SubClass(char ch1, String str1) {
        super(ch1);
        this.str1 = str1;
    }

    public SubClass (SubClass clone){
        this(clone.ch1, clone.str1);

    }
}
Footer
        © 2022 GitHub, Inc.
        Footer navigation
        Terms
        Privacy

