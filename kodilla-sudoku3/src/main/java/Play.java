public class Play {
    public static void main(String[] args) {
        Board board = new Board();
        board.initBoard();

        board.setValueInBoard2(2, 1, 8);
        board.setValueInBoard2(1, 2, 2);
        board.setValueInBoard2(3, 2, 3);
        board.setValueInBoard2(1, 4, 5);
        board.setValueInBoard2(2, 4, 2);
        board.setValueInBoard2(3, 5, 6);
        board.setValueInBoard2(1, 6, 1);
        board.setValueInBoard2(2, 6, 3);
        board.setValueInBoard2(1, 8, 9);
        board.setValueInBoard2(3, 8, 7);
        board.setValueInBoard2(2, 9, 6);
        board.setValueInBoard2(5, 1, 5);
        board.setValueInBoard2(5, 2, 4);
        board.setValueInBoard2(4, 3, 1);
        board.setValueInBoard2(6, 3, 2);
        board.setValueInBoard2(4, 7, 6);
        board.setValueInBoard2(6, 7, 7);
        board.setValueInBoard2(5, 8, 1);
        board.setValueInBoard2(5, 9, 9);
        board.setValueInBoard2(8, 1, 2);
        board.setValueInBoard2(7, 2, 9);
        board.setValueInBoard2(9, 2, 1);
        board.setValueInBoard2(8, 4, 8);
        board.setValueInBoard2(9, 4, 9);
        board.setValueInBoard2(7, 5, 3);
        board.setValueInBoard2(8, 6, 4);
        board.setValueInBoard2(9, 6, 7);
        board.setValueInBoard2(7, 8, 8);
        board.setValueInBoard2(9, 8, 6);
        board.setValueInBoard2(8, 9, 7);
        System.out.println("--------------------UnSolved Sudoku---------------");
        board.showBoard();
        System.out.println();
        System.out.println("--------------------Solved Sudoku-----------------");
        System.out.println();
        solve(board);
        board.showBoard();
    }

    public static boolean solve(Board board){
        for(int i = 0; i<9; i++){
            for(int j = 0; j<9; j++){
                if(board.getValueInBoard(i,j)!=0){
                    continue;
                }
                for(int n = 1; n<10; n++){
                    if(isPosibleValueInRowColBox(board, i, j, n)) {
                        board.setValueInBoard(i, j, n);
                        if (solve(board))
                        return true;

                        else{
                           board.setValueInBoard(i,j,0);
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }


    public static boolean isPosibleValueInRowColBox(Board board,int row, int col,  int possible){
        if(board.checkRow( row, possible) || board.checkColumn(col, possible) || board.checkBox(row,col,possible))
            return false;
        else
            return true;

    }
}
