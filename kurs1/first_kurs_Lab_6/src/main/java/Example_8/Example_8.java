package Example_8;

public class Example_8 {
    public static int arrayInt(int[]arrayInt){
        int result=0;
        for(int i=0;i<arrayInt.length;i++){
            result=result+arrayInt[i];

        }
        return result=result/ arrayInt.length;
    }
}
//    Напишите программу со статическим методом, аргументом которому передается
//        целочисленный массив, а результатом возвращается среднее значение для элементов
//        массива (сумма значений элементов, деленная на количество элементов в массиве)
