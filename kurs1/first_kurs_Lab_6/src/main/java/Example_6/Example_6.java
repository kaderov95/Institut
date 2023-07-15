package Example_6;

//    Напишите программу со статическим методом, которому аргументом передается
//        целочисленный массив и целое число. Результатом метод возвращает ссылку на новый
//        массив, который получается из исходного массива (переданного первым аргументом
//        методу), если в нем взять несколько начальных элементов. Количество элементов, которые
//        нужно взять из исходного массива, определяются вторым аргументом метода. Если второй
//        аргумент метода больше длины массива, переданного первым аргументом, то методом
//        создается копия исходного массива и возвращается ссылка на эту копию

public class Example_6 {
    public static int[] arrayInt(int[] array, int n) {
        int[] arrayCopy = new int[n];
        if (n > array.length) {
            int[] arrayCopy1 = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                arrayCopy1[i] = array[i];
                System.out.print(arrayCopy1[i]);
            }
            return arrayCopy1;
        } else {
            for (int i = 0; i < n; i++) {
                arrayCopy[i] = array[i];
            }
            for (int i = 0; i < arrayCopy.length; i++) {
                System.out.print(arrayCopy[i]);
            }
        }
        return arrayCopy;

    }
}

