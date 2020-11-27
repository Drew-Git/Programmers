package level1;

/**
 * @description     코딩테스트 연습
    2019 카카오 개발자 겨울 인턴십
	    크레인 인형뽑기 게임
		https://programmers.co.kr/learn/courses/30/lessons/64061?language=java

 * @author Administrator
 *
 */
class Solution4 {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
/*      [[0,0,0,0,0],[0,0,1,0,3],[0,2,5,0,1],[4,2,4,4,2],[3,5,1,3,1]] 	[1,5,3,5,1,2,1,4] 	4
        [0,0,0,0,0]
		[0,0,1,0,3]
        [0,2,5,0,1]
        [4,2,4,4,2]  
        [3,5,1,3,1]  
        				4
        				3
        				2
        				3
        				1
        				1
        				3
        				4
*/      
        int col = 0;
        int row = 0;
        
        System.out.println(board);
        System.out.println(moves);
        System.out.println(board.length);
        int[] pickedArr = new int[moves.length]; //바구니 길이 지정
        
        for(int k=1; k<moves.length+1; k++) {
        	
	        for(int i=0; i<board.length; i++) {
	//        	System.out.println(board.length);
	//        	System.out.println(board[i].length);
	//        	System.out.println();
	        	col = board.length;
	        	row = board[i].length;
	        	for(int j=0; j<board[i].length; j++) {
		        	System.out.println("k : " + k);
		        	
	        		if (board[moves[k-1]-1][j] != 0) {
	        			if(pickedArr[k] == 0) {
		        			pickedArr[k] = board[moves[k-1]-1][j];
		        			System.out.println("k in pickedArr : "+pickedArr[k]);
	        			}
	        		}
	        	}
	        }
        }
        return answer;
    }
}

class Home3 {
	public static void main(String[] args) {
		Solution4 sol = new Solution4();
//		int[][] intBoard = new int[5][5];
		int[][] intBoard = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
//		int[][] intBoard = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2}};
//		int[] intMoves = new int[5];
		int[] intMoves = {3,5,1,3,1};
		
		sol.solution(intBoard, intMoves);
//		sol.solution("aBd",3);
//		sol.solution2("aBd",27);
		
	}
}
