package Example_5;

//        Напишите программу с классом, у которого есть закрытое целочисленное
//        поле. Значение полю присваивается с помощью открытого метода. Методу
//        аргументом может передаваться целое число, а также метод может вызываться
//        без аргументов. Если методы вызывается без аргументов, то поле получает
//        нулевое значение. Если метод вызывается с целочисленным аргументом, то
//        это значение присваивается полю. Однако если переданное аргументом
//        методу значение превышает 100, то значением полю присваивается число 100.
//        Предусмотрите в классе конструктор, который работает по тому же принципу
//        что и метод для присваивания значения полю. Также в классе должен быть
//        метод, позволяющий проверить значение поля.

public class Example_5 {
    public static class Example5 {
        private int number;


        public void setNumber(){
            number=0;
            System.out.println(number);
        }
        public void setNumber(int number){
            if (number>100){
                number=100;
                System.out.println(number);

            }
            else System.out.println(number);

        }

        public Example5(int number) {
            this.number = number;
            if(number>100){
                number=100;
                System.out.println(number);
            }
            else System.out.println(number);
        }
        public Example5() {
            this.number = number;
            number=0;
            System.out.println(number);
        }
    }
}
