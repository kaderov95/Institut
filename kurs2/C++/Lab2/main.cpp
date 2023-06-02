#pragma clang diagnostic push
#pragma ide diagnostic ignored "cppcoreguidelines-narrowing-conversions"
#include <iostream>
#include <iomanip>
//#include <cstdlib>
//#include <ncurses.h>
#define N 5

using namespace std;

float min(float array[5][5])
{
    float min=array[0][0];
    for(int i=0;i<5;i++)
    {
        for(int j=0;j<5;j++)
        {
            if(array[i][j]<min) min = array[i][j];
        }
    }
    return min;
}
//Нахождение максимального значения в матрице
float max(float array[5][5])
{
    float max=array[0][0];
    for(int i=0;i<5;i++)
    {
        for(int j=0;j<5;j++)
        {
            if(array[i][j]>max) max = array[i][j];
        }
    }
    return max;
}
//Нахождение минимального значения в нижнетреугольной части матрицы
float minBottomTriangle(float array[5][5])
{
    float min=array[0][0];
    for(int i=0;i<5;i++)
    {
        for(int j=i+1;j<5;j++)
        {
            if(array[j][i]<min) min = array[j][i];
        }
    }
    return min;
}
//Нахождение максимального значения в нижнетреугольной части матрицы
float maxBottomTriangle(float array[5][5])
{
    float max=array[0][0];
    for(int i=0;i<5;i++)
    {
        for(int j=i+1;j<5;j++)
        {
            if(array[j][i]>max) max = array[j][i];
        }
    }
    return max;
}
//Нахождение максимального значения в верхнетреугольной части матрицы
float maxUpperTriangle(float array[5][5])
{
    float max=array[0][0];
    for(int i=0;i<5;i++)
    {
        for(int j=i-1;j>=0;j--)
        {
            if(array[j][i]>max) max = array[j][i];
        }
    }
    return max;
}
//Нахождение минимального значения в верхнетреугольной части матрицы
float minUpperTriangle(float array[5][5])
{
    float min=array[0][0];
    for(int i=0;i<5;i++)
    {
        for(int j=i-1;j>=0;j--)
        {
            if(array[j][i]<min) min = array[j][i];
        }
    }
    return min;
}
//Нахождение минимального значения в главной диагонали
float minMainDiag(float array[5][5])
{
    float min = array[0][0];
    for(int i=0;i<5;i++)
    {
        if(array[i][i]<min) min=array[i][i];
    }
    return min;
}
//Нахождение максимального значения в главной диагонали
float maxMainDiag(float array[5][5])
{
    float max = array[0][0];
    for(int i=0;i<5;i++)
    {
        if(array[i][i]>max) max=array[i][i];
    }
    return max;
}
//Нахождение максимального значения в побочной диагонали
float maxSecondaryDiag(float array[5][5])
{
    float max = array[4][0];
    for(int i=0,j=4;i<5;i++,j--)
    {
        if(array[j][i]>max) max=array[j][i];
    }
    return max;
}
//Нахождение минимального значения в побочной диагонали
float minSecondaryDiag(float array[5][5])
{
    float min = array[4][0];
    for(int i=0,j=4;i<5;i++,j--)
    {
        if(array[j][i]<min) min=array[j][i];
    }
    return min;
}
//Нахождение среднеарефмитического значения
float average(float array[5][5])
{
    float temp{0};
    for(int i=0;i<5;i++)
    {
        for(int j=0;j<5;j++)
        {
            temp+=array[i][j];
        }
    }
    return temp/25;
}
//Нахождение среднеарефмитического значения в нижнетреугольной части матрицы
float averageBottomTriangle(float array[5][5])
{
    float temp{0};
    size_t counter{0};
    for(int i=0;i<5;i++)
    {
        for(int j=i+1;j<5;j++)
        {
            temp+=array[j][i];
            counter++;
        }
    }
    return temp/counter;
}
//Нахождение среднеарефмитического значения в верхнетреугольной части матрицы
float averageUpperTriangle(float array[5][5])
{
    float temp{0};
    size_t counter{0};
    for(int i=0;i<5;i++)
    {
        for(int j=i-1;j>=0;j--)
        {
            temp+=array[j][i];
            counter++;
        }
    }
    return temp/counter;
}
//Нахождение суммы в конкретной строке
float rowSum(float array[5][5],size_t row)
{
    float temp {0};
    for(int i=0;i<5;i++)
    {
        temp+=array[row][i];
    }
    return temp;
}
//Нахождение суммы в конкретном столбце
float columnSum(float array[5][5],size_t column)
{
    float temp {0};
    for(int i=0;i<5;i++)
    {
        temp+=array[i][column];
    }
    return temp;
}
//Нахождение минимального значения в строке
float rowMin(float array[5][5],size_t row)
{
    float min =array[row][0];
    for(int i=0;i<5;i++)
    {
        if(array[row][i]<min) min = array[row][i];
    }
    return min;
}
//Нахождение максимального значения в строке
float rowMax(float array[5][5],size_t row)
{
    float max=array[row][0];
    for(int i=0;i<5;i++)
    {
        if(array[row][i]>max) max = array[row][i];
    }
    return max;
}
//Нахождение максимального значения в столбце
float columnMax(float array[5][5],size_t column)
{
    float max = array[0][column];
    for(int i=0;i<5;i++)
    {
        if(array[i][column]>max) max = array[i][column];
    }
    return max;
}
//Нахождение минимального значения в столбце
float columnMin(float array[5][5],size_t column)
{
    float min = array[0][column];
    for(int i=0;i<5;i++)
    {
        if(array[i][column]<min) min = array[i][column];
    }
    return min;
}
//Нахождение среднего арифметического значения в строке
float averageRow(float array[5][5],size_t row)
{
    float temp {0};
    for(int i=0;i<5;i++)
    {
        temp+=array[row][i];
    }
    return temp/5;
}
//Нахождение среднего арифметического значения в столбце
float averageColumn(float array[5][5],size_t column)
{
    float temp {0};
    for(int i=0;i<5;i++)
    {
        temp+=array[i][column];
    }
    return temp/5;
}
//Сумма чисел в верхнетреугольной матрице
float sumUpperTriangle(float array[5][5])
{
    float temp{0};
    for(int i=0;i<5;i++)
    {
        for(int j=i-1;j>=0;j--)
        {
            temp += array[j][i];
        }
    }
    return temp;
}
//Сумма чисел в нижнетреугольной матрице
float sumBottomTriangle(float array[5][5])
{
    float temp{0};
    for(int i=0;i<5;i++)
    {
        for(int j=i+1;j<5;j++)
        {
            temp += array[j][i];
        }
    }
    return temp;
}
//Нахождение числа, которое максимально близко к среднеарифметическому
float closeToAverage(float array[5][5])
{
    float temp = average(array);
    float value = array[0][0];
    float diff = std::abs(temp-value);
    for(int i=0;i<5;i++)
    {
        for(int j=0;j<5;j++)
        {
            float x = array[i][j];
            if(std::abs(temp-x)<diff)
            {
                value=array[i][j];
                diff=std::abs(temp-value);
            }
        }
    }
    return value;
}

int main() {
    float m[N][N];
    int i, j;
    srand(time(NULL));
    for (i = 0; i < N; i++) {
        for (j = 0; j < N; j++) m[i][j] = rand() % (100 + 1);
    }
    for (i = 0; i < N; i++) {
        for (j = 0; j < N; j++) cout << setw(8) << setprecision(5) << m[i][j];
        cout << endl;
    }

    float minValue = min(m);
    float maxValue = max(m);
    float minBottom = minBottomTriangle(m);
    float maxBottom = maxBottomTriangle(m);
    float maxUpper = maxUpperTriangle(m);
    float minUpper = minUpperTriangle(m);
    float minDiagMain = minMainDiag(m);
    float maxDiagMain = maxMainDiag(m);
    float maxDiagSec = maxSecondaryDiag(m);
    float minDiagSec = minSecondaryDiag(m);
    float averageArray = average(m);
    float averageBotom = averageBottomTriangle(m);
    float averageUpper = averageUpperTriangle(m);
    float sumUpper = sumUpperTriangle(m);
    float sumBottom = sumBottomTriangle(m);
    float mostclosed = closeToAverage(m);
    cout << "Min: " << minValue << endl;
    cout << "Max: " << maxValue << endl;
    cout << "MinBottomTriangle: " << minBottom << endl;
    cout << "MaxBottomTriangle: " << maxBottom << endl;
    cout << "MaxUpperTriangle: " << maxUpper << endl;
    cout << "MinUpperTriangle: " << minUpper << endl;
    cout << "minMainDiag: " << minDiagMain << endl;
    cout << "maxMainDiag: " << maxDiagMain << endl;
    cout << "maxSecondaryDiag: " << maxDiagSec << endl;
    cout << "minSecondaryDiag: " << minDiagSec << endl;
    cout << "average: " << averageArray << endl;
    cout << "averageBottomTriangle: " << averageBotom << endl;
    cout << "averageUpperTriangle: " << averageUpper << endl;
    for (int i = 0; i < 5; i++) {
        cout << "Sum of " << i + 1 << " row: " << rowSum(m, i) << endl;
    }

    for (int i = 0; i < 5; i++) {
        cout << "Sum of " << i + 1 << " column: " << columnSum(m, i) << endl;
    }

    for (int i = 0; i < 5; i++) {
        cout << "Min of " << i + 1 << " row: " << rowMin(m, i) << endl;
    }
    for (int i = 0; i < 5; i++) {
        cout << "Max of " << i + 1 << " row: " << rowMax(m, i) << endl;
    }

    for (int i = 0; i < 5; i++) {
        cout << "Min of " << i + 1 << " column: " << columnMin(m, i) << endl;
    }
    for (int i = 0; i < 5; i++) {
        cout << "Max of " << i + 1 << " column: " << columnMax(m, i) << endl;
    }

    for (int i = 0; i < 5; i++) {
        cout << "Average of " << i + 1 << " column: " << averageColumn(m, i) << endl;
    }
    for (int i = 0; i < 5; i++) {
        cout << "Average of " << i + 1 << " row: " << averageRow(m, i) << endl;
    }

    cout << "Sum Upper Triangle: " << sumUpper << endl;
    cout << "Sum Bottom Triangle: " << sumBottom << endl;
    cout << "Most closed to average: " << mostclosed << endl;


}