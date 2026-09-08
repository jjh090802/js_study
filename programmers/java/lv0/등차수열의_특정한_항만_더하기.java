//문제 : 등차수열의 특정한 항만 더하기 (lv0)
//https://school.programmers.co.kr/learn/courses/30/lessons/181931
// 요약:boolean의 자료형을 가진 included배열의 값에 따라서 등차수열의 값에서 일정 부분만 연산을 한다.

class Solution {
    public int solution(int a, int d, boolean[] included) {
        
        int answer = 0;
        
        for(int i = 0; i < included.length;i++){
            if(included[i]){
                answer += (a + (i * d));
            }
        }
        
        return answer;
    }
}