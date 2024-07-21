package Practice_BackTracking;

public class Queen_Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] board = new boolean[4];
		int tq = 2;
		int qpsf = 0;
		Combination(board, tq, qpsf, "",0);
	}

	public static void Combination(boolean[] board, int tq, int qpsf, String ans,int indx) {
		// TODO Auto-generated method stub
		if(qpsf == tq) {
			System.out.println(ans);
			return;
		}
		
		
		for(int i=indx; i<board.length; i++) {
			if(board[i] == false) {
				board[i] = true;
				Combination(board, tq, qpsf+1, ans + "b" + i + "q" + qpsf,i+1);
				board[i] = false;
			}
		}
	}
}
