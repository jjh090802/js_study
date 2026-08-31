
//문제 부분_문자열인지_확인하기 (lv0)
//https://school.programmers.co.kr/learn/courses/30/lessons/181843
//요약:문자열 안중에 같은 문장이 있는지 확인하기
//contains - 특정 글자 포함 여부 확인

class Solution {
    public int solution(String my_string, String target) {
        if(my_string.contains(target)){
            return 1;
        } else {
            return 0;
        }
    }
}