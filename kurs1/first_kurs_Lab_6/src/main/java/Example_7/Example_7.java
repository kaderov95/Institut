package Example_7;

//    Напишите программу со статическим методом, аргументом которому передастся
//        символьный массив, а результатом возвращается ссылка на целочисленным массив,
//        состоящий из кодов символов из массива- аргумента.

public class Example_7 {
    public static int[] charArray(char[]charArray){
        int []arrayInt=new int[charArray.length];
        for (int i =0; i< arrayInt.length;i++){
            arrayInt[i]=charArray[i];
            System.out.print(arrayInt[i]+" ");
        }
        return arrayInt;
    }
}

