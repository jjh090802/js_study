//문제 : 문자열 겹쳐쓰기 (lv0)
//https://school.programmers.co.kr/learn/courses/30/lessons/181943
// 요약: mt_string과 overwrite_string을 s를 기준으로 나누어서 섞어서 작성

class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        StringBuilder answer = new StringBuilder();
        
        for(int i = 0; i < s; i++){
            answer.append(my_string.charAt(i));
        }
        for(int j = 0; j < overwrite_string.length();j++){
            answer.append(overwrite_string.charAt(j));
        }
        for (int k = s+overwrite_string.length(); k < my_string.length(); k++) {
            answer.append(my_string.charAt(k));
        }
        
        return answer.toString();
    }
}