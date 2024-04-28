package algorithm.programmers.basic.week5.q4;

public class Solution {
	public int solution(int[] num_list) {
        int answer = 0;
        int tmp_sum = 0;
        int tmp_mul = 1;
        
        for (int i=0; i<num_list.length; i++) {
        	tmp_sum += num_list[i];
        	tmp_mul *= num_list[i];
        }
        tmp_sum = tmp_sum*tmp_sum;
        
        if (tmp_sum > tmp_mul) {
        	return 1;
        } else if (tmp_sum < tmp_mul) {
        	return 0;
        }
        return answer;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		int[] arr = {3, 4, 5, 2, 1};
//		int[] arr = {5, 7, 8, 3};
		System.out.println(s.solution(arr));
	}

}
