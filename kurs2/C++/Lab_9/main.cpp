#include <iostream>
#include <stack>
#include <vector>
#include <algorithm>

int main() {
    std::vector<int> train = {3, 1, 4, 5, 2}; // исходный состав
    std::stack<int> station; // тупик для перекладывания вагонов
    std::vector<int> sortedTrain; // отсортированный состав

    // сортировка железнодорожного состава
    for (int i = 0; i < train.size(); i++) {
        while (!station.empty() && station.top() < train[i]) {
            sortedTrain.push_back(station.top()); // перекладываем вагоны из тупика в отсортированный состав
            station.pop();
        }
        station.push(train[i]); // отправляем текущий вагон в тупик
    }

    while (!station.empty()) {
        sortedTrain.push_back(station.top()); // перекладываем оставшиееся вагоны из тупика в отсортированный состав
        station.pop();
    }

    // вывод отсортированного состава на экран
    std::cout << "Sorted train: ";
    for (int i = 0; i < sortedTrain.size(); i++) {
        std::cout << sortedTrain[i] << " ";
    }
    std::cout << std::endl;


}
return 0;