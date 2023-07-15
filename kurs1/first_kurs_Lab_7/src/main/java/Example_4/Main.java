package Example_4;

//        Напишите программу, в которой использована цепочка наследования из трех
//        классов. В первом классе есть открытое символьное поле. Во втором классе появляется
//        открытое текстовое поле. В третьем классе появляется открытое целочисленное поле. В
//        каждом из классов должен быть конструктор, позволяющий создавать объект на основе
//        значений полей, переданных аргументами конструктору, а также конструктор создания
//        копии.

public class Main {
    public static void main(String[] args) {
        SuperClass spc = new SuperClass('a');
        SubClass sbc = new SubClass('s',"Hello");
        SubSubClass ssc = new SubSubClass('d',"World",5);
        SuperClass cloneSpc = new SuperClass(spc);
        SubClass cloneSbc = new SubClass(sbc);
        SubSubClass cloneSsc = new SubSubClass(ssc);
    }
}

