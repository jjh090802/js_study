//문제 : 이어 붙인 수 (lv0)
//https://school.programmers.co.kr/learn/courses/30/lessons/181928
// 요약:num_list라는 배열에서 짝수와 홀수를 구분하여 문자열로 더한후에 더한 문자열을 정수로 바꿔서 각각 더함

class Solution {
    public int solution(int[] num_list) {
        String a = "";
        String b = "";

        for(int i = 0; i < num_list.length;i++){
            if(num_list[i] % 2 == 0){
               a += num_list[i];
            } else {
                b += num_list[i];
            }

        }
        
        int totalA = Integer.parseInt(a);
        int totalB = Integer.parseInt(b);

        return totalA + totalB;
    }
}