//문제 : 코드 처리하기 (lv0)
//https://school.programmers.co.kr/learn/courses/30/lessons/181932
// 요약: mode에 따라서 code의 인덱스의 짝수,활수 결과를 확인하고 문자열에 추가한다

class Solution {
    public String solution(String code) {
        String ret = "";
        int mode = 0;

        for(int i = 0; i < code.length(); i++){
            if(code.charAt(i) == '1'){
                if(mode == 0){
                    mode = 1;
                }else {
                    mode = 0;
                }
            } else {
                if(mode == 0){
                    if(i%2 == 0)ret += code.charAt(i);
                }else {
                    if(i%2 == 1)ret += code.charAt(i);
                }
            }
        }
        return ret.isEmpty() ? "EMPTY" : ret;
    }
}