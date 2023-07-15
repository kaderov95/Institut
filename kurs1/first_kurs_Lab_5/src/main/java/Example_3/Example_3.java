package Example_3;

public class Example_3 {
    public static class Constructors {
        private int age;
        private int height;
        private String name;

        public Constructors(int age) {
            this.age = age;
        }

        public Constructors(int age, int height) {
            this.age = age;
            this.height = height;
        }

        public Constructors(int age, int height, String name) {
            this.age = age;
            this.height = height;
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public Constructors() {
        }
        public void sayAgeAndHeight () {
            System.out.println("Возраст "+ age+ " Рост "+height);
        }
        public void sayAge (){
            System.out.println("Возраст "+age);
        }
        public void sayAgeNameAndHeight (){
            System.out.println("Меня зовут "+name + " мне "+ age +" лет "+"мой рост "+height);
        }
    }
}
