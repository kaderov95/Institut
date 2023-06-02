//#include <iostream>
//#include <fstream>
//#include <string>
//
//using namespace std;
//
//// Функция для поиска слова в файле
//void searchWordInFile(ifstream& file, const string& search_word) {
//    string line;
//    int line_number = 1;
//    bool found = false;
//
//    while (getline(file, line)) {
//        if (line.find(search_word) != string::npos || line.substr(0, search_word.length()) == search_word) {
//            cout << "Найдено в строке " << line_number << ": " << line << endl;
//            found = true;
//        }
//        line_number++;
//    }
//
//    if (!found) {
//        cout << "Слово '" << search_word << "' не найдено в файле" << endl;
//    }
//}
//
//// Функция для подсчёта количества пустых и не пустых символов в файле
//void countEmptyAndNonEmptyChars(ifstream& file, int& empty_chars, int& non_empty_chars) {
//    char c;
//
//    while (file.get(c)) {
//        if (c == ' ' || c == '\t' || c == '\n' || c == '\r') {
//            empty_chars++;
//        } else {
//            non_empty_chars++;
//        }
//    }
//}
//
//// Функция для вывода содержимого файла на экран
//void printFileContents(ifstream& file) {
//    string line;
//    while (getline(file, line)) {
//        cout << line << endl;
//    }
//}
//
//// Функция для записи номера страницы в конец файла
//void writePageNumber(const string& filename, int pageNumber) {
//    ofstream output(filename, ios_base::app);
//    if (output.is_open()) {
//        output << "Page Number: " << pageNumber << endl;
//        output.close();
//    } else {
//        cerr << "Error opening file " << filename << endl;
//    }
//}
//
//// Функция для поиска слова в файле и сохранения найденных строк в файл
//void searchWordAndSaveToFile(ifstream& file, const string& search_word, const string& output_file) {
//    string line;
//    int line_number = 1;
//    bool found = false;
//
//    // Открываем выходной файл
//    ofstream output(output_file);
//
//    while (getline(file, line)) {
//        size_t pos = line.find(search_word);
//        if (pos != string::npos || line.substr(0, search_word.length()) == search_word) {
//            output << "Найдено в строке " << line_number << ": " << line << endl;
//            found = true;
//            while (pos != string::npos) {
//                output << "    Найдено слово '" << search_word << "' в позиции " << pos << endl;
//                pos = line.find(search_word, pos + 1);
//            }
//        }
//        line_number++;
//
//    }
//
//    if (!found) {
//        output << "Слово '" << search_word << "' не найдено в файле" << endl;
//    }
//
//    // Закрываем выходной файл
//    output.close();
//}
//
//int main() {
//    string filename;
//    cout << "Введите имя файла: ";
//    cin >> filename;
//
//    string search_word;
//    cout << "Введите слово для поиска: ";
//    cin >> search_word;
//
//    string output_file;
//    cout << "Введите имя файла для сохранения результатов поиска: ";
//    cin >> output_file;
//
//    ifstream file(filename);
//
//    if (!file.is_open()) {
//        cout << "Невозможно открыть файл " << filename << endl;
//        return 1;
//    }
//
//    // Ищем слово в файле
//    searchWordInFile(file, search_word);
//    file.clear();
//    file.seekg(0);
//
//    // Считаем пустые и не пустые символы в файле
//    int empty_chars = 0;
//    int non_empty_chars = 0;
//    countEmptyAndNonEmptyChars(file, empty_chars, non_empty_chars);
//    file.clear();
//    file.seekg(0);
//
//    // Выводим содержимое файла на экран
//    cout << "Содержимое файла:" << endl;
//    printFileContents(file);
//    file.clear();
//    file.seekg(0);
//
//    // Ищем слово в файле и сохраняем результат в файл
//    searchWordAndSaveToFile(file, search_word, output_file);
//    writePageNumber(filename, 34);
//
//    file.close();
//
//    cout << "Количество пустых символов: " << empty_chars << endl;
//    cout << "Количество не пустых символов: " << non_empty_chars << endl;
//
//    return 0;
//}


//#include <iostream>
//#include <fstream>
//#include <string>
//
//using namespace std;
//
//// Функция для чтения содержимого файла
//string readFile(const string& filename) {
//    ifstream input(filename);
//    if (input.is_open()) {
//        string content((istreambuf_iterator<char>(input)), (istreambuf_iterator<char>()));
//        input.close();
//        return content;
//    } else {
//        cerr << "Error opening file " << filename << endl;
//        return "";
//    }
//}
//
//// Функция для записи номера страницы в конец файла
//void writePageNumber(const string& filename, int pageNumber) {
//    ofstream output(filename, ios_base::app);
//    if (output.is_open()) {
//        output << "Page Number: " << pageNumber << endl;
//        output.close();
//    } else {
//        cerr << "Error opening file " << filename << endl;
//    }
//}
//
//// Функция для фильтрации содержимого файла по словам и символам
//string filterFile(const string& content, const string& filter) {
//    string filteredContent = content;
//    size_t pos = 0;
//    while ((pos = filteredContent.find(filter, pos)) != string::npos) {
//        filteredContent.replace(pos, filter.length(), "[" + filter + "]");
//        pos += filter.length() + 2;
//    }
//    return filteredContent;
//}
//
//// Функция для подсчета неотображаемых символов
//int countNonPrintableChars(const string& content) {
//    int count = 0;
//    for (char c : content) {
//        if (!isprint(c)) {
//            count++;
//        }
//    }
//    return count;
//}
//
//int main() {
//    string filename;
//    cout << "Enter file name: ";
//    cin >> filename;
//
//    string content = readFile(filename);
//    if (!content.empty()) {
//        cout << content << endl;
//
//        writePageNumber(filename, 34 /f);
//
//        string filter;
//        cout << "Enter filter: ";
//        cin >> filter;
//        string filteredContent = filterFile(content, filter);
//        cout << filteredContent << endl;
//
//        int count = countNonPrintableChars(content);
//        cout << "Non-printable characters count: " << count << endl;
//    }
//
//    return 0;
//}

//#include <iostream>
//#include <fstream>
//#include <string>
//
//using namespace std;
//
//void countEmptyChars(string filename) {
//    ifstream file(filename);
//    int count = 0;
//    char c;
//    while (file.get(c)) {
//        if (c == ' ') {
//            count++;
//        }
//    }
//    cout << "The file contains " << count << " empty characters." << endl;
//}
//
//void searchSubstring(string filename) {
//    ifstream file(filename);
//    string substring;
//    cout << "Enter a substring to search for: ";
//    cin >> substring;
//    string line;
//    int lineNumber = 1;
//    bool found = false;
//    while (getline(file, line)) {
//        if (line.find(substring) != string::npos) {
//            cout << "Found \"" << substring << "\" on line " << lineNumber << ": " << line << endl;
//            found = true;
//        }
//        lineNumber++;
//    }
//    if (!found) {
//        cout << "Substring not found." << endl;
//    }
//}
//
//void addPageNumbers(string filename) {
//    ifstream file(filename);
//    ofstream outfile("output.txt");
//    string line;
//    int pageNumber = 1;
//    while (getline(file, line)) {
//        outfile << "[" << pageNumber << "] " << line << endl;
//        pageNumber++;
//    }
//    cout << "Page numbers added to output.txt." << endl;
//}
//
//void encryptFile(string filename) {
//    ifstream file(filename);
//    ofstream outfile("encrypted.txt");
//    string key;
//    cout << "Enter an encryption key: ";
//    cin >> key;
//    char c;
//    int i = 0;
//    while (file.get(c)) {
//        char encrypted = c ^ key[i];
//        outfile << encrypted;
//        i = (i + 1) % key.length();
//    }
//    cout << "File encrypted to encrypted.txt." << endl;
//}
//
//int main() {
//    string filename;
//    cout << "Enter the filename: ";
//    cin >> filename;
//
//    countEmptyChars(filename);
//    searchSubstring(filename);
//    addPageNumbers(filename);
//    encryptFile(filename);
//
//    return 0;
//}


#include <iostream>
#include <fstream>
#include <string>
#include <cstdlib>

using namespace std;

// Функция для подсчета пустых символов
int count_empty_chars(string line) {
    int count = 0;
    for (int i = 0; i < line.length(); i++) {
        if (line[i] == ' ') {
            count++;
        }
    }
    return count;
}

// Функция для поиска заданного слова или символа
bool find_word_or_char(string line, string word_or_char) {
    if (line.find(word_or_char) != string::npos) {
        return true;
    }
    else {
        return false;
    }
}

int main() {
    string filename;
    cout << "Введите название файла: ";
    getline(cin, filename);

    ifstream file(filename);
    if (file.is_open()) {
        string line;
        int empty_chars_count = 0;
        while (getline(file, line)) {
            cout << line << endl;
            empty_chars_count += count_empty_chars(line);
        }
        cout << "Количество пустых символов: " << empty_chars_count << endl;

        string word_or_char;
        cout << "Введите слово или символ для поиска: ";
        cin >> word_or_char;
        file.clear();
        file.seekg(0);
        bool found = false;
        while (getline(file, line)) {
            if (find_word_or_char(line, word_or_char)) {
                found = true;
                cout << "Найдено: " << line << endl;
            }
        }
        if (!found) {
            cout << "Не найдено" << endl;
        }

        file.close();

        // Функция вписывающая номер страницы в конец файла через ключ /f
        string page_number;
        cout << "Введите номер страницы: ";
        cin >> page_number;
        ofstream outfile(filename, ios_base::app);
        if (outfile.is_open()) {
            outfile << page_number << endl;
            outfile.close();
        }
        else {
            cout << "Ошибка открытия файла" << endl;
            return EXIT_FAILURE;
        }

        // Функция шифрования считывающего с файла и записывающую результат в другой файл со схемой шифровки c=c^key[i]
        string key, encrypted_filename;
        cout << "Введите ключ для шифрования: ";
        cin >> key;
        cout << "Введите имя файла для сохранения: ";
        cin >> encrypted_filename;

        file.open(filename);
        if (file.is_open()) {
            ofstream encrypted_file(encrypted_filename);
            if (encrypted_file.is_open()) {
                int key_index = 0;
                char c;
                while (file.get(c)) {
                    c = c ^ key[key_index % key.length()];
                    encrypted_file.put(c);
                    key_index++;
                }
                encrypted_file.close();
            }
            else {
                cout << "Ошибка открытия файла" << endl;
                return EXIT_FAILURE;
            }
            file.close();
        }
        else {
            cout << "Ошибка открытия файла" << endl;
            return EXIT_FAILURE;
        }

        // Проверка расшифровки
        ifstream encrypted_file(encrypted_filename);
        if (encrypted_file.is_open()) {
            ofstream decrypted_file("decrypted.txt");
            if (decrypted_file.is_open()) {
                int key_index = 0;
                char c;
                while (encrypted_file.get(c)) {
                    c = c ^ key[key_index % key.length()];
                    decrypted_file.put(c);
                    key_index++;
                }
                decrypted_file.close();
            }
            else {
                cout << "Ошибка открытия файла" << endl;
                return EXIT_FAILURE;
            }
            encrypted_file.close();
        }
        else {
            cout << "Ошибка открытия файла" << endl;
            return EXIT_FAILURE;
        }
    }
    else {
        cout << "Ошибка открытия файла" << endl;
        return EXIT_FAILURE;
    }

    return 0;
}