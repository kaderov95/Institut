#include "string.h"
#include <iostream>
int main()
{
    string s1{"qwert"},s3,s4{s1},s5;
    std::cin>>s3;
    s3="asdfg";
    std::cout<<s3<<std::endl;
    s5=s1+s3+s4;
    std::cout<<"Length of s5 = "<<s5.size()<<std::endl;
    if(s1==s5)
    {
        std::cout<<"s1 equal to s5"<<std::endl;
    }
    else if(s1==s4) std::cout<<"s1 equal to s4"<<std::endl;
    std::system("pause");
}
