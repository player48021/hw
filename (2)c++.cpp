#include <iostream>

int main() {

    const int size = 3;

    int numbers[size];

    std::cout << "Введите " << size << " целых чисел:\n";

    for(int i = 0; i < size; ++i) {

        std::cin >> numbers[i];

    }    

    return 0;

}