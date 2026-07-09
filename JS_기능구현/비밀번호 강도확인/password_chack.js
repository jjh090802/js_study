function chack(e){
    let val = e.value;
    let length = val.length;
    let password = /[!@#$%^&*>?:"{}|]/.test(val);
    let num = /[0-9]/.test(val);
    let lower = val.toLowerCase() != val;

    let color = "";
    let text = "";

    if(length >= 8 && lower &&num && password ){
        color = "green";
        text = "안전";
    }else if(length >= 6 && lower &&num ){
        color = "orange";
        text = "보통"
    }else if(length < 6){
        color = "red";
        text = "불안";
    }

    e.style.borderColor = color;
    document.querySelector(".text").textContent = text;
}