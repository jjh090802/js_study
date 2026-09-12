//문제 : 원소들의 곱과 합 (lv0)
//https://school.programmers.co.kr/learn/courses/30/lessons/181929

class Solution {
    public int solution(int[] num_list) {
        int a = 1;
        int b = 0;
        
        for(int i = 0; i < num_list.length;i++){
            a *= num_list[i];
            b += num_list[i];
        }
        
        if(a > b*b) {
            return 0;
        } else {
            return 1;
        }
    }
}