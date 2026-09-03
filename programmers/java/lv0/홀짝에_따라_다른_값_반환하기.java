//제목 : 홀짝에 따라 다른 값 반환하기
//https://school.programmers.co.kr/learn/courses/30/lessons/181935
//요약 : n의 값이 홀수와 짝수에 따라 return 값이 다르게 나옴

class Solution {
    public int solution(int n) {
        int a = 0;
        if(n % 2 == 0) {
            for(int i = n; i > 0;i -= 2) {
                a += i*i;
            }
            return a;
        } else {
            for(int i = n; i > 0;i -= 2) {
                a += i;
            }
            return a;
        }
    }
}