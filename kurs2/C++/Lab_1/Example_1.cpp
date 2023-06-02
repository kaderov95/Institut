#include <iostream> // Подключение библиотеки ввода/вывода
using namespace std; //Подключение поространства имён std

int main()
{
    int a, i, k;
    int power(int, int);
    cout << "Введите число для возведения в степень: "; cin >> x;
    for(i=0; i<10; a++, i++)
    {
        k = power(a, i);
        cout << "i = "<< i <<", k = "<< k <<endl;
    }
}

int power(int x, int n)
{
    int i, p = 1;
    for (i = 0; i < n; i++) p*=x;
    {
        return p;

    }
}

//Выполнить программу, иллюстрирующую разные операции с указателями.
//Повторить эксперименты с разными типами данных.

//#define PR(x) printf("x=%u, *x=%d, &x=%u\n", x, *x, &x)
//#include <stdio.h>
//
//int main()
//{
//    int mas[] = (100, 200, 300);
//    int *ptr1, *ptr2;
//    ptr1 = mas;
//    ptr2 = &mas[2];
//    PR(ptr1);
//    ptr1++;
//    PR(ptr2);
//    ++ptr2;
//    printf("ptr2-ptr1=&u\n", ptr2-ptr1);
//}