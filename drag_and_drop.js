const dropZone = document.getElementById("img_box");
const resetBtn = document.getElementById("reset");

const defaultBoxHTML = dropZone.innerHTML;

resetBtn.addEventListener("click", function resetBox() {
  dropZone.innerHTML = defaultBoxHTML;
});

dropZone.addEventListener("dragover", function preventDefault(e) {
  e.preventDefault();
});
dropZone.addEventListener("drop", handleDrop);



function handleDrop(e) {
  e.preventDefault();

  const file = e.dataTransfer.files[0];
  if (!file) return;

  if (!file.type.startsWith("image/")) {
    alert("이미지 파일만 업로드할 수 있습니다!");
    return;
  }

  showPreview(file);
}

function showPreview(file) {
  const reader = new FileReader();

  reader.onload = (event) => {
    dropZone.innerHTML = `<img src="${event.target.result}" alt="미리보기" />`;
  };

  reader.readAsDataURL(file); 
}

