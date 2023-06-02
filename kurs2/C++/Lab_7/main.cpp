#include <iostream>

class Person
{
public:
    // конструктор копирования класса Person
    Person(std::string name, unsigned age)
    {
        this->name = name;
        this->age = age;
        std::cout << "Person created" << std::endl;
    }
    ~Person() //Деструктор
    {
        std::cout << "Person deleted" << std::endl;
    }
    void print() const
    {
        std::cout << "Name: " << name << "\tAge: " << age << std::endl;
    }
private:
    std::string name;
    unsigned age;
};
class Employee: public Person
{
public:
    Employee(std::string name, unsigned age, std::string company): Person(name, age)
    {
        this->company = company;
        std::cout << "Employee created" << std::endl;
    }
    ~Employee()
    {
        std::cout << "Employee deleted" << std::endl;
    }
private:
    std::string company;
};

int main()
{
    Employee tom{"Tom", 38, "Google"};
    tom.print();
}