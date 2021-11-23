public class Exercise7 {


    public static void printBoard(char[]arr){
        int cnt = 0;
        char[][] board = new char[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++) {
                if (cnt == arr.length)
                    break;
                board[i][j]=arr[cnt];
                cnt++;
            }
        }
        for(int i=0;i<3;i++){
            System.out.print("[");
            for(int j=0;j<3;j++){
                if(j<=1)
                    System.out.print(board[i][j]+",");
                else
                System.out.print(board[i][j]);
            }
            System.out.print("]");
            System.out.println();
        }
    }

    public static void main(String[] args) {
           char [] ch1 = new char[]{'0','x','x','0','0','x','x','0','x'};
           printBoard(ch1);
    }
}
