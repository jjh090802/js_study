//문제 : 주사위 게임 2 (lv0)
//https://school.programmers.co.kr/learn/courses/30/lessons/181930
// 요약: a,b,c의 값들을 비교하여 그에 따라 출력값을 변환

int solution(int a, int b, int c) {
    int answer = 0;
        
        if (a == b && b == c) {answer = (a + b + c) * (a * a + b * b + c * c) * (a * a * a + b * b * b + c * c * c);}

        else if (a != b && b != c && a != c) {answer = a + b + c;}
        else {answer = (a + b + c) * (a * a + b * b + c * c);}
        
        return answer;
}