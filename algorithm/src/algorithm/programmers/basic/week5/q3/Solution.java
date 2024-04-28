package algorithm.programmers.basic.week5.q3;

class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        if (a != b && b !=c && c != a) {
        	return a + b + c;
        } else if (a==b && b==c && c==a) {
        	return (a + b + c)*(a*a + b*b + c*c)*(a*a*a + b*b*b + c*c*c);
        } else {
        	return (a + b + c)*(a*a + b*b + c*c);
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
//		System.out.println(s.solution(2, 6, 1));
//		System.out.println(s.solution(5, 3, 3));
		System.out.println(s.solution(4, 4, 4));
	}

}
