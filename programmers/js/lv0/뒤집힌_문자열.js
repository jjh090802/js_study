//https://school.programmers.co.kr/learn/courses/30/lessons/120822

function solution(my_string) {
    return my_string.split("").reverse().join("");
}

//문자열은 그냥 reverse한다고 뒤집히는게 아니기 때문에
//split으로 하나씩 나누어서 배열로 두고
//reverse를 넣어서 뒤집는다.
//그 후에 join을 넣어서 ""의 경계를 없애서 합쳐준다.