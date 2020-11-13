package level1;

import java.util.*;
/**
 * @description 입력받은 숫자 큰 순으로 정렬하기
 * @author Administrator
 *
 */
class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] strArr;
        Integer[] intArr;
        System.out.println(String.valueOf(n));
        String strLong = String.valueOf(n);
        strArr = String.valueOf(n).split("");
        
        Arrays.sort(strArr);
        List<String> reverseList = Arrays.asList(strArr);
        Collections.reverse(reverseList);
        System.out.println(reverseList);
        System.out.println("<< strArr");
//        strArr
        int biggest = 0;
        int preNum  = 0;
        for(int i=0; i < strArr.length; i++) {
            System.out.println(strArr[i].toString());
        	if(i != strArr.length-1) {
        		
        		int compareNum = Integer.parseInt(strArr[i]);
        		int nextNum = Integer.parseInt(strArr[i+1]);
	        		
//	    		System.out.println(" compareNum :  "+ compareNum + " nextNum : "+nextNum);
	    		
	    		// 반복하는 동안 i번째 숫자가 최고값보다 크면
	    		if (compareNum < nextNum) {
	        		System.out.println(" compareNum < nextNum  ");
	    			// 최고값은 i번째 숫자
	    			biggest = nextNum;
//	        		System.out.println(" biggest :  "+ biggest + " nextNum : "+nextNum);
	    		}
        	}

        	strArr[i] = String.valueOf(biggest);
//        	System.out.println(" | "+ i + "번째 숫자 = "+strArr[i]);
        }
        System.out.println(strArr.toString());
//        intArr[i] = ;
        
        
        return answer;
    }
}

class Home {
	public static void main(String[] args) {
		Solution sol = new Solution();
		sol.solution(8395083);
	}
}