//https://school.programmers.co.kr/learn/courses/30/lessons/181945

const readline = require("readline");
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout,
});

let input = [];

rl.on("line", (line) => {
    input.push(line);
}).on("close", () => {
    const str = input[0];
    console.log(str.split("").join("\n"));
});

//이 문제는 solution 함수가 아니라 입출력(stdin/stdout)으로 처리하는 유형이다.
//readline으로 입력받은 문자열을 input 배열에 담는다.
//문자열을 시계방향 90도로 돌리면 각 글자가 세로로 한 줄씩 내려오게 된다.
//split("")으로 글자를 하나씩 나눈 뒤,
//join("\n")으로 글자 사이마다 줄바꿈을 넣어 세로로 출력한다.
