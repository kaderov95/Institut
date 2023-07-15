package Example_3;

public class Main_Example_3 {
    public static void main(String[] args) {
        Example_3.Constructors human1 = new Example_3.Constructors(14);
        Example_3.Constructors human2 = new Example_3.Constructors(14,175);
        Example_3.Constructors human3 = new Example_3.Constructors(21,183,"Владислав");
        human1.sayAge();
        human2.sayAgeAndHeight();
        human3.sayAgeNameAndHeight();
        human1.setAge(34);
    }
}

