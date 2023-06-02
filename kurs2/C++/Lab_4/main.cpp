// 1.   Написать свои варианты функций:
//          определение длины строки (выполнить работу тремя способами);
//              1. копирование строк;
//              2. сравнение строк;
//              3. конкантенация строк;

#include <iostream>
#include <cstring>
#include <alloca.h>
#include <stdlib.h>

using namespace std;


int dlina1(char* str){
    return strlen(str);
}

int dlina2(char* str){
    string string1 = str;
    return string1.size();
}

int dlina3(char* str){
    int length = 0;
    while (str[length] != '\0')
        length++;
    return length;
}

void kopir(char* str5, char* str6){
    strcpy(str5, str6);
}

void sravn(char* str5, char* str6){
    int result = ::strcmp(str5, str6);
    if(result != 0){
        cout << "Строки не равны" << endl;
    }
    else {
        cout << "Строки равны" << endl;
    }
}

void konkat(char* str1, char* str2){
    strcat(str1, str2);
    strcat (str2, str1);
}

int main() {

    char str1[] = "qwerty";
    char str2[] = "1234567890";

    char *str3, *str4;
    str3 = (char*)malloc(100);
    str4 = (char*)malloc(100);


    char *str5, *str6;
    str5 = (char*)std::calloc(100, 100);
    str6 = (char*)std::calloc(100, 100);
    strcmp(str5, str6);

    int dlina1(char*);
    int dlina2(char*);
    int dlina3(char*);

    void sravn(char*, char*);
    void konkat(char*, char*);
    void kopir(char*, char*);

    cout << "длина str1 = " << dlina1(str1) << ", str2 = ";
    cout << dlina1(str2) << endl;

    cout << "длина str1 = " << dlina2(str1) << ", str2 = ";
    cout << dlina2(str2) << endl;

    cout << "длина str1 = " << dlina3(str2) << ", str2 = ";
    cout << dlina3(str2) << endl;


    cout << "результат копирования: str1 = " << str2;
    cout << ", str2 = " << str2 << endl;

    cout << "результат сравнения: str1 = " << str1;
    cout << ", str2 = " << str2 << endl;

    sravn(str1, str2);

    cout << "результат сцепления: str1 = " << str1;
    cout << ", str2 = " << str2 << endl;
    cout << str1;
    cout << str2;

    free(str3);
    free(str4);

    // использование функций длины строки
//    cout << "длина str1 = " << dlina1(str1) << ", str2 = ";
//    cout << dlina1(str2) << endl;
//
//    cout << "длина str1 = " << dlina2(str1) << ", str2 = ";
//    cout << dlina2(str2) << endl;
//
//    cout << "длина str1 = " << dlina3(str2) << ", str2 = ";
//    cout << dlina3(str2) << endl;


//     Вызов kopir(char*, char*);

//    cout << "результат копирования: str1 = " << str1;


    // Вызов sravn(char*, char*);
//    cout << "результат сравнения: str1 = " << str1;
//    cout << ", str2 = " << str2 << endl;
//
//    // Вызов konkat(char*, char*);
//
}

