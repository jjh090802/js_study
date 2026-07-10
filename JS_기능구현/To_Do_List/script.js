function add(){
    let input = document.querySelector("input");


    if(input.value == ""){
        return 0;
    }
    document.querySelector(".list").innerHTML += "<li class='text'>"+input.value+"<button class='del' onclick='del(this)'>삭제</button></li>";
    input.value = "";
}

function del(btn){
    btn.parentElement.remove();
}