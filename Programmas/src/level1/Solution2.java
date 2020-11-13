package level1;

import java.util.Scanner;

/**
 * @description 가로세로 별찍기
 * @author Administrator
 *
 */
public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        StringBuffer str = new StringBuffer();
        if(a>0) {
        	for (int i=0; i < b; i++) {
//        		System.out.println("");
        		if(i != 0 ) {
        			str.append('\n');
        		}
        		for (int j=0; j < a; j++) {
        			str.append('*');
//        			System.out.print("*");
        		}
        	}
        }
		str.append('\n');
        System.out.println(str);
    }
}