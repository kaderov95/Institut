#include <iostream>
using namespace std;

//Функция возведения в степень
int power(int x,int n)
{
    int p=x;
    for(int i=1;i<n;i++) p*=x;
    return p;
}

int main()
{
    //int k; 
    int base,exponent; //Переменные, необходимые для основания и степени
    cout<<"Please, enter base and exponent: "<<endl;
    cin>>base>>exponent; //Инициализация переменных
    cout<<"Answer: "<<power(base,exponent)<<endl; //Вызов функций возведения в степень в процессе вывода на экран через поток cout

    // for(int i=0;i<10;i++)
    // {
    //     k=power(2,i);
    //     cout<<"i = "<<i<<", k = "<<k<<endl;
    // }
}