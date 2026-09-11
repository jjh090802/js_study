//문제 : 특정한 문자를 대문자로 바꾸기 (lv0)
//https://school.programmers.co.kr/learn/courses/30/lessons/181873

class Solution {
    public String solution(String my_string, String alp) {    
        String answer = "";

        for (int i = 0; i < my_string.length(); i++) {
            String currentStr = my_string.substring(i, i + 1);
            if (currentStr.equals(alp)) {answer += currentStr.toUpperCase();}
            else {answer += currentStr;}
        }

        return answer;
    }
}