package Example_10;

//    Напишите программу со статическим методом, аргументом которому передается
//        произвольное количество целочисленных аргументов. Результатом метод возвращает
//        массив из двух элементов: это значения наибольшего и наименьшего значений среди
//        аргументов, переданных методу

public class Example_10 {
    public static int[] intArray(int...n){
        int max=0;
        for (int i =0; i<n.length;i++){
            max = Math.max(max,n[i]);
        }
        int min = n[0];
        for (int i =0;i<n.length;i++){
            min = Math.min(min,n[i]);
        }
        int [] maxAndMin = {max,min};
        for (int i=0;i<maxAndMin.length;i++){
            System.out.print(maxAndMin[i]+" ");
        }
        return maxAndMin;

    }
}


