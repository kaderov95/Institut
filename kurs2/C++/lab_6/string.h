#ifndef STRING_H
#define STRING_H
#include <iostream>
class string
{
private:
    char* text; //Указатель на массив типа char, в котором будет храниться строка
    int length; //Количество символов в строке, за исключением \0
public:
    string(const char* _text);
    string();
    string(const string&);
    string(string&&) noexcept;
    string(int);
    ~string() { delete[] text; }
    int  size() const { return length; }
    char& operator[](int i) { return text[i]; }
    const char operator[](int i) const { return text[i]; }
    string& operator=(const string&);
    string& operator=(string&&) noexcept;
    string& operator=(const char*);
    int operator==(const string& rhv);
    friend string operator+(const string&, const string&);
    friend std::ostream& operator<<(std::ostream& os, const string& _string);
    friend std::istream& operator>>(std::istream& os,string& _string);

};
#endif