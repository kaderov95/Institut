#include <iostream>
#include <string>
#include <vector>

using namespace std;

const int BOARD_SIZE = 3;

enum class CellState { Empty, Cross, Circle };

class Board {
public:
    Board() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            vector<CellState> row(BOARD_SIZE, CellState::Empty);
            cells.push_back(row);
        }
    }

    void setCell(int row, int col, CellState state) {
        cells[row][col] = state;
    }

    CellState getCell(int row, int col) const {
        return cells[row][col];
    }

    bool isFull() const {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                if (cells[i][j] == CellState::Empty) {
                    return false;
                }
            }
        }
        return true;
    }

    void print() const {
        cout << "  ";
        for (int i = 0; i < BOARD_SIZE; i++) {
            cout << i << " ";
        }
        cout << endl;
        for (int i = 0; i < BOARD_SIZE; i++) {
            cout << i << " ";
            for (int j = 0; j < BOARD_SIZE; j++) {
                switch (cells[i][j]) {
                    case CellState::Empty:
                        cout << "- ";
                        break;
                    case CellState::Cross:
                        cout << "X ";
                        break;
                    case CellState::Circle:
                        cout << "O ";
                        break;
                }
            }
            cout << endl;
        }
    }

private:
    vector<vector<CellState>> cells;
};

class Game {
public:
    Game() {
        currentPlayer = CellState::Cross;
    }

    void play() {
        while (!board.isFull()) {
            board.print();
            int row, col;
            cout << "Player " << (currentPlayer == CellState::Cross ? "X" : "O") << ", enter row and column:\n";
            cin >> row >> col;
            if (row < 0 || row >= BOARD_SIZE || col < 0 || col >= BOARD_SIZE) {
                cout << "Invalid input. Please enter row and column in range [0, 2]." << endl;
                continue;
            }
            if (board.getCell(row, col) != CellState::Empty) {
                cout << "Cell is already occupied. Please choose another one." << endl;
                continue;
            }
            board.setCell(row, col, currentPlayer);
            if (checkWin()) {
                board.print();
                cout << "Player " << (currentPlayer == CellState::Cross ? "X" : "O") << " wins!" << endl;
                return;
            }
            currentPlayer = (currentPlayer == CellState::Cross ? CellState::Circle : CellState::Cross);
        }
        board.print();
        cout << "Game over. It's a tie!" << endl;
    }

private:
    Board board;
    CellState currentPlayer;

    bool checkWin() const {
        // Check rows
        for (int i = 0; i < BOARD_SIZE; i++) {
            if (board.getCell(i, 0) == currentPlayer && board.getCell(i, 1) == currentPlayer && board.getCell(i, 2) == currentPlayer) {
                return true;
            }
        }
        // Check columns
        for (int i = 0; i < BOARD_SIZE; i++) {
            if (board.getCell(0,i) == currentPlayer && board.getCell(1, i) == currentPlayer && board.getCell(2, i) == currentPlayer) {
                return true;
            }
        }
        // Check diagonals
        if (board.getCell(0, 0) == currentPlayer && board.getCell(1, 1) == currentPlayer && board.getCell(2, 2) == currentPlayer) {
            return true;
        }
        if (board.getCell(0, 2) == currentPlayer && board.getCell(1, 1) == currentPlayer && board.getCell(2, 0) == currentPlayer) {
            return true;
        }
        return false;
    }
};

int main() {
    Game game;
    game.play();
    return 0;
}