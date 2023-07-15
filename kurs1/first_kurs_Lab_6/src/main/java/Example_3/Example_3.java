package Example_3;

//        Напишите программу с классом, в котором есть статические методы, которым
//        можно передавать произвольное количество целочисленных аргументов (или
//        целочисленный массив). Методы, на основании переданных аргументов или массива,
//        позволяют вычислить: наибольшее значение, наименьшее значение, а также среднее
//        значение из набора чисел.

public class Example_3 {

    public static void setArrayMax(int[] pole) {
        int max=0;
        for (int i =0; i< pole.length;i++){
            max=Math.max(max,pole[i]);
        }
        System.out.println("Максимальное значение элемента массива равно "+max);
    }
    public static void setArrayMin(int[] pole) {
        int min=pole[0];
        for (int i =0; i< pole.length;i++){
            min=Math.min(min,pole[i]);
        }
        System.out.println("Минимальное значение элемента массива равно "+min);
    }
    public static void setArrayMiddle(int[] pole) {
        int middle=0;
        for (int i =0; i< pole.length;i++){
            middle=middle+pole[i];
        }
        System.out.println("Среднее значение массива равно "+middle/pole.length);
    }
}