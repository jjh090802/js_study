//문제 : 접미사인지 확인하기 (lv0)
//https://school.programmers.co.kr/learn/courses/30/lessons/181908?language=java
// 요약: 각각의 문자열을 비교하여서 접미사인지 아닌지 확인
class Solution {
    public int solution(String my_string, String is_suffix) {
         if(my_string.endsWith(is_suffix)){
             return 1;
         } else {
             return 0;
         }
    }
}