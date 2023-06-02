#include "string.h"
string::string(string&& example) noexcept: length(example.length)
{
    text = example.text;
    example.text = nullptr;
    example.length = 0;
}
string::string()
{
    length = 0;
    text = new char[1];
    text[0] = '\0';
}
string::string(int i) : length(i)
{
    text = new char[i + 1];
    for (int i = 0; i <= length; i++) text[i] = '\0';

}
string::string(const char* _text)
{
    length = 0;
    char const* p_text = _text;
    while (*p_text != '\0') { length++; p_text++; }
    text = new char[length + 1];
    p_text = _text;
    for (int i = 0; *p_text != '\0'; i++, p_text++) text[i] = *p_text;
    text[length] = '\0';
}
string::string(const string& _example)
{
    length = _example.length;
    text = new char[length + 1];
    char const* p_example = _example.text;
    for (int i = 0; *p_example != '\0'; i++, p_example++) text[i] = *p_example;
    text[length] = '\0';

}
std::ostream& operator<<(std::ostream& os, const string& _string)
{
    os << _string.text;
    return os;
}
string& string::operator=(const string& _example)
{
    if (this == &_example) return *this;
    delete[] text;
    length = _example.length;
    text = new char[length + 1];
    char const* p_example = _example.text;
    for (int i = 0; *p_example != '\0'; i++, p_example++) text[i] = *p_example;
    text[length] = '\0';
    return *this;
}
string& string::operator=(string&& _example) noexcept
{
    if (this == &_example) return *this;
    delete[] text;
    length = _example.length;
    text = _example.text;
    _example.text = nullptr;
    _example.length = 0;
    return *this;
}
string& string::operator=(const char* _example)
{
    length = 0;
    delete[] text;
    const char* p_example = _example;
    while (*p_example != '\0') { length++; p_example++; }
    text = new char[length + 1];
    for (int i = 0; *_example != '\0'; i++, _example++) text[i] = *_example;
    text[length] = '\0';
    return *this;
}
string operator+(const string& _first, const string& _second)
{
    string temp{ _first.length + _second.length };
    for (int i = 0; i < _first.length; i++) temp.text[i] = _first.text[i];
    for (int i = _first.length; i < temp.length; i++) temp.text[i] = _second.text[i - _first.length];
    temp.text[temp.length] = '\0';
    return temp;
}
int string::operator==(const string& rhv)
{
    const char* s1 = this->text;
    const char* s2 = rhv.text;
    while(*s1 && (*s1==*s2))
    {
        s1++;
        s2++;
    }
    return *(const unsigned char*)(s1) - *(const unsigned char*)(s2);
}
std::istream& operator>>(std::istream& os,string& _string)
{

    os>>_string.text;
    int counter {0};
    const char* it =_string.text;
    while(*it!='\0')
    {
        it++;
        counter++;
    }
    _string.length=counter;
    return os;
}
