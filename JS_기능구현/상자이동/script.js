const box = document.querySelector(".box")

const maxTop = window.innerHeight - box.offsetHeight;
const maxLeft = window.innerWidth - box.offsetWidth;

let topPos = maxTop / 2;
let leftPos = maxLeft / 2;

const speed = 20;

box.style.top = topPos + 'px';
box.style.left = leftPos + 'px';

window.addEventListener('keydown', (event) => {
    const key = event.key;

    if(key === 'ArrowUp' && topPos - speed >= 0){
        topPos -= speed;
    } else if(key === 'ArrowDown' && topPos + speed <= maxTop){
        topPos += speed;
    } else if(key === 'ArrowLeft' && leftPos - speed >= 0){
        leftPos -= speed;
    } else if(key === 'ArrowRight' && leftPos + speed <= maxLeft){
        leftPos += speed;
    } else{
        return ;
    }

    event.preventDefault();
    box.style.top = topPos + 'px';
    box.style.left = leftPos + 'px';
})
