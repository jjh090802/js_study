//문제 : 조건 문자열 (lv0)
//https://school.programmers.co.kr/learn/courses/30/lessons/181934
// 요약: ineq와 eq 문자열에 따라 값의 옳고 그름을 판별

class Solution {
    public int solution(String ineq, String eq, int n, int m) {    
        if(ineq.equals("<")) {
            if(eq.equals("=")){
                if(n <= m){
                    return 1;
                }
                else {
                    return 0;
                }

            } 
            else if(eq.equals("!")){
                if(n < m){
                    return 1;
                }
                else {
                    return 0;
                }
            }
        }
        else if(ineq.equals(">")){
            if(eq.equals("=")){
                if(n >= m){
                    return 1;
                }
                else {
                    return 0;
                }
            } 
            else if(eq.equals("!")){
                if(n > m){
                    return 1;
                }
                else {
                    return 0;
                }
            }
        }
        return 0;
    }
}