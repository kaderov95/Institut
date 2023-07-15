package Example_1;

public class Main {
    public static void main(String[] args) {
        superClass superClassObject = new superClass("передал в конструктор суперкласса");
        String className = superClassObject.toString();
        System.out.println(className);
        subClass subClassObject1 = new subClass("передал в конструктор подкласса");
        String subClassName = subClassObject1.toString();
        System.out.println(subClassName);
        subClass subClassObject2 = new subClass("передал в конструктор подкласса", "где два параметра");
        String subClassName2 = subClassObject2.toString();
        System.out.println(subClassName2);
    }
}
