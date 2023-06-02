#include <iostream>
using namespace std;

void obmen1(int x,int y)
{
    int temp=x;
    x=y;
    y=temp;
}

void obmen2(int* x,int* y)
{
    int temp = *x;
    *x=*y;
    *y=temp;
}

void obmen3(int& x,int& y)
{
    int temp=x;
    x=y;
    y=temp;
}

int main()
{
    int a=2, b=5;
    cout<<"Until swap: a= "<<a<<" b= "<<b<<endl;
    obmen1(a,b);
    cout<<"After 1 swap: a= "<<a<<" b= "<<b<<endl;
    obmen2(&a,&b);
    cout<<"After 2 swap: a= "<<a<<" b= "<<b<<endl;
    obmen3(a,b);
    cout<<"After 3 swap: a= "<<a<<" b= "<<b<<endl;
}