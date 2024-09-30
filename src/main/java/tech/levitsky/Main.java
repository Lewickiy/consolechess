package tech.levitsky;

public class Main {
    /*
    Король — King (K)
    Ферзь — Queen (Q)
    Ладья — Rook (R)
    Слон — Bishop (B)
    Конь — Knight (N) (отличие: первая буква уже занята королем, поэтому используется "N" для коня)
    Пешка — Pawn (P)
     */

    public static void main(String[] args) {
        // Инициализация двумерного массива для шахматной доски
        String[][] board = new String[8][8];

        // Заполнение доски начальной расстановкой фигур
        setupBoard(board);

        // Вывод доски в консоль
        printBoard(board);
    }
    // Метод для расстановки начальных позиций фигур
    public static void setupBoard(String[][] board) {
        // Белые фигуры
        board[0] = new String[]{"R", "N", "B", "Q", "K", "B", "N", "R"}; // 1-я строка (ладья, конь, слон, ферзь, король)
        board[1] = new String[]{"P", "P", "P", "P", "P", "P", "P", "P"}; // 2-я строка пешек

        // Пустые клетки
        for (int i = 2; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = "-"; // Пустая клетка
            }
        }

        // Черные фигуры
        board[7] = new String[]{"r", "n", "b", "q", "k", "b", "n", "r"}; // 8-я строка (черные фигуры)
        board[6] = new String[]{"p", "p", "p", "p", "p", "p", "p", "p"}; // 7-я строка пешек
    }

    // Метод для вывода доски
    public static void printBoard(String[][] board) {
        for (String[] strings : board) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println(); // Переход на новую строку после каждого ряда
        }
    }
}