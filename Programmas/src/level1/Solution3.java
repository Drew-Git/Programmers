package level1;

import java.util.ArrayList;
import java.util.List;

/**
 * @description 알파벳  입력받은 숫자만큼 옮기기 
 * @author Administrator
 *
 */
class Solution3 {
    public String solution(String s, int n) {
    	List<String> lowerCase = new ArrayList<String>();
    	char ch = 'a';
    	char z = 'z';
    	for(ch = 'a'; ch<=z; ch++) {
    		System.out.println(ch);
    		lowerCase.add(String.valueOf(ch));
    		System.out.println(lowerCase);
    	}
    	List<String> upperCase = new ArrayList<String>();
    	char ch2 = 'A';
    	char z2 = 'Z';
    	for(ch2 = 'A'; ch2<=z2; ch2++) {
    		upperCase.add(String.valueOf(ch2));
    		System.out.println(upperCase);
    	}
    	
    	String[] splited = s.split("");
    	
    	for(int i=0; i < s.length(); i++) {
    		if(lowerCase.contains(splited[i])) {
    			int outLength = lowerCase.indexOf(splited[i])+n-1;
    			int position = 0;
    			if(outLength > 25) {
    				position = outLength-26;
    			} else {
    				position = outLength;
    			}
    			splited[i] = lowerCase.get(position);
    	    	System.out.println(splited[i]);
    		}
    		if(upperCase.contains(splited[i])) {
    			int outLength = upperCase.indexOf(splited[i])+n-1;
    			int position = 0;
    			if(outLength > 25) {
    				position = outLength-26;
    			} else {
    				position = outLength;
    			}
    			splited[i] = upperCase.get(position);
    	    	System.out.println(splited[i]);
    		}
    	}
    	
        String answer = splited.toString();
    	System.out.println(answer);
        return answer;
    }

    public String solution2(String s, int n) {
    	String lowerCase[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    	String upperCase[] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
    	
    	List<String> lowerList = new ArrayList<String>();
    	lowerList.add(lowerCase.toString());
    	System.out.println(lowerList);
    	for(int i=0; i<s.length(); i++) {
    		String splited = s.split("").toString();
    		if(lowerList.get(0).contains(splited)) {
    			
    		}
    	}
    	
    	
		return s;
    }
}

class Home2 {
	public static void main(String[] args) {
		Solution3 sol = new Solution3();
		sol.solution("aBd",3);
//		sol.solution2("aBd",27);
		
	}
}
