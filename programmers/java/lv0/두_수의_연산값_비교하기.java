//문제 : 두 수의 연산값 비교 (lv0)
//https://school.programmers.co.kr/learn/courses/30/lessons/181938
//a와 b를 문자열로 붙였을때와 연산을 하였을때 어떤것이 더 값이 큰지 비교하여 큰값을 출력

class Solution {
    public int solution(int a, int b) {
        //문자열인 수를 일단 만들고 거기서 정수로 다시 변환후에 서로 비교하여서 출력
        String str_a = Integer.toString(a);
        String str_b = Integer.toString(b);
        String str = str_a + str_b;
        
        
        if(Integer.parseInt(str) > 2*a*b) {
            return Integer.parseInt(str);
        } else {
            return 2*a*b;
        }
    }
}