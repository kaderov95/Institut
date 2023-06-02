// - 1. Разобраться, как работает предложенная программа сортировки массива методом "мини-маска"
// - 2. Написать программу, сортирующую одномерный массив методами "пузырька" и "быстрой сортировки"
//      Можно ли такие методы использовать для работы с многомерным массивом?
// - 3. Для массива целых значений выполнить сортировку по возростанию чётных и по убыванию нечётных значений
// - 4. Отсортировать массив по возросстанию на интервале индексов N1 до N2
// - 5. Отсортировать массив по убыванию на интервале индексов от N1 до N2
//      Сделать функцию с инициализацией массива и повторять перед каждым выводом сортировки
#include <iostream>
using namespace std;

int main() {
    void puzyrikom(int mas[], int n);
    void miniMax(int mas[], int n);
    void quickSort(int mas[], int n);
    void cnSort(int mas[], int n);
    void N1N2SortUP(int mas[], int n);
    void N1N2SortDown(int mas[], int n);

    int mas1[] = {2, 5, -8, 1, -4, 6, 3, -5, -9, 13, 0, 4, 9};
    int mas2[] = {2, 5, -8, 1, -4, 6, 3, -5, -9, 13, 0, 4, 9};
    int mas3[] = {2, 5, -8, 1, -4, 6, 3, -5, -9, 13, 0, 4, 9};
    int mas4[] = {2, 5, -8, 1, -4, 6, 3, -5, -9, 13, 0, 4, 9};
    int mas5[] = {2, 5, -8, 1, -4, 6, 3, -5, -9, 13, 0, 4, 9};
    int mas6[] = {2, 5, -8, 1, -4, 6, 3, -5, -9, 13, 0, 4, 9};
    int mas7[] = {2, 5, -8, 1, -4, 6, 3, -5, -9, 13, 0, 4, 9};
    // текущие индексы мин. и макс. элементов
    // вычисление n - количество элементов
    int n = sizeof(mas1)/sizeof(int);
    cout << "#######  Метод сортировки мини-макса #######" << endl;
    puzyrikom(mas2, n);
    cout << "#######  Метод сортировки пузырьком  #######" << endl;
    puzyrikom(mas3, n);
    cout << "#######  Метод быстрой сортировки    #######" << endl;
    quickSort(mas4, n);
    cout << "#######  Для массива целых значений выполнить сортировку по возростанию чётных и по убыванию не чётных значений    #######" << endl;
    cnSort(mas5, n);
    cout << "#######  Отсортировать массив по возросстанию на интервале индексов N1 до N2    #######" << endl;
    N1N2SortUP(mas6, n);
    cout << "#######  Отсортировать массив по убыванию на интервале индексов от N1 до N2    #######" << endl;
    N1N2SortDown(mas7, n);
}


void puzyrikom (int mas[], int n){
    int temp;
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (mas[j] > mas[j + 1]) {
                // меняем элементы местами
                temp = mas[j];
                mas[j] = mas[j + 1];
                mas[j + 1] = temp;
            }
        }
    }

    // Вывод отсортированного массива на экран
    for (int i = 0; i < n; i++) {
        cout << mas[i] << " ";
    }
    cout << endl;
}

void miniMax(int mas[], int n){
    int imin, imax;
    int i;
    // установка начальных индексов для мин и макс
    imin = i = 0; imax = i = 0;
    //clrscr();
    for(i = 0; i < n; i++)
        cout << mas[i] << ' ';
    cout << endl;
    for(i = 0; i < n-1; i++)
    {
        imin = i;
        for(int j = i + 1; j < n; j++)
            if (mas[j] < mas[imin]) imin = j;
        int t = mas[i];
        mas[i] = mas[imin];
        mas[imin] = t;
    }
    for(i = 0; i < n; i++)  // вывод на экран
        cout << mas[i] << ' ';
    cout << endl;
}

void quickSort(int mas[], int n){
    //Указатели в начало и в конец массива
    int i = 0;
    int j = n - 1;

    //Центральный элемент массива
    int mid = mas[n / 2];

    //Делим массив
    do {
        //Пробегаем элементы, ищем те, которые нужно перекинуть в другую часть
        //В левой части массива пропускаем(оставляем на месте) элементы, которые меньше центрального
        while(mas[i] < mid) {
            i++;
        }
        //В правой части пропускаем элементы, которые больше центрального
        while(mas[j] > mid) {
            j--;
        }

        //Меняем элементы местами
        if (i <= j) {
            int tmp = mas[i];
            mas[i] = mas[j];
            mas[j] = tmp;

            i++;
            j--;
        }
    } while (i <= j);



    // Вывод отсортированного массива на экран
    for (int i = 0; i < n; i++) {
        cout << mas[i] << " ";
    }
    cout << endl;
}

void cnSort(int mas[], int n) {
    puzyrikom(mas, n);
    int j = n - 1;
    for (int i = 0; i < j - 1; i++) {
        if (mas[i] % 2 != 0) {
            if (mas[j] % 2 != 0) {
                swap(mas[i], mas[j]);
                j--;
            } else i--, j--;
        }
        else continue;
    }
    cout << "Отсортированный массив" << endl;

    // Вывод отсортированного массива на экран
    for (int i = 0; i < n; i++) {
        cout << mas[i] << " ";
    }
    cout << endl;
}

void N1N2SortUP (int mas[], int n){
    int down;
    int up;
    cout << "Введите нижнию границу: ";
    cin >> down;
    cout << "Введите верхнюю границу: ";
    cin >> up;
    int temp;
    for (int i = down; i < up; i++) {
        for (int j = down; j < up; j++) {
            if (mas[j] > mas[j + 1]) {
                // меняем элементы местами
                swap(mas[j], mas[j+1]);
            }
        }
    }

    // Вывод отсортированного массива на экран
    for (int i = 0; i < n; i++) {
        cout << mas[i] << " ";
    }
    cout << endl;

}
void N1N2SortDown (int mas[], int n){
    int down;
    int up;
    cout << "Введите нижнию границу: ";
    cin >> down;
    cout << "Введите верхнюю границу: ";
    cin >> up;
    int temp;
    for (int i = down; i < up; i++) {
        for (int j = down; j < up; j++) {
            if (mas[j] < mas[j + 1]) {
                // меняем элементы местами
                swap(mas[j], mas[j+1]);
            }
        }
    }

    // Вывод отсортированного массива на экран
    for (int i = 0; i < n; i++) {
        cout << mas[i] << " ";
    }
    cout << endl;
}