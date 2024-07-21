package Practice_BackTracking;

public class Queen_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] board = new boolean[4];
		int tq = 2;
		int qpsf = 0;
		Permutation(board, tq, qpsf, "");
	}

	public static void Permutation(boolean[] board, int tq, int qpsf, String ans) {
		// TODO Auto-generated method stub
		if(qpsf == tq) {
			System.out.println(ans);
			return;
		}
		
		
		for(int i=0; i<board.length; i++) {
			if(board[i] == false) {
				board[i] = true;
				Permutation(board, tq, qpsf+1, ans + "b" + i + "q" + qpsf);
				board[i] = false;
			}
		}
	}

}
