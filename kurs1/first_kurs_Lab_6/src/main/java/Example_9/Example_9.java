package Example_9;

//    Напишите программу со статическим методом, аргументом которому передается
//        одномерный символьный массив. В результате вызова метода элементы массива попарно
//        меняются местами: первый — с последним , второй — с предпоследним и так далее.

public class Example_9 {
    public static char[] charArray(char[]charArray){
        for(int i=0;i<charArray.length/2;i++){
            char temp=charArray[i];
            charArray[i]=charArray[charArray.length-1-i];
            charArray[charArray.length-1-i]= temp;

        }
        return charArray;
    }
}

