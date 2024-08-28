package backup;

public class TicTacToe {
    public static void checkCells(int[] board) {
        if (board.length != 9) {
            System.out.println("Некорректное количество ячеек. Ожидается массив из 9 элементов.");
            return;
        }

        for (int i = 0; i < board.length; i++) {
            switch (board[i]) {
                case 0:
                    System.out.println("Ячейка " + i + ": Пустое поле");
                    break;
                case 1:
                    System.out.println("Ячейка " + i + ": Крестик");
                    break;
                case 2:
                    System.out.println("Ячейка " + i + ": Нолик");
                    break;
                default:
                    System.out.println("Ячейка " + i + ": Недопустимое значение");
                    break;
            }
        }
    }
}
