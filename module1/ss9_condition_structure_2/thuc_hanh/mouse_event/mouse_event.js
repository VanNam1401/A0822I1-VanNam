let imObj = document.getElementById("myImage");
function init() {
    //imObj = document.getElementById("myImage");
    imObj.style.position = "relative";
    imObj.style.left = '0px';
}
function moveRight() {
    imObj.style.left = parseInt(imObj.style.left) + 20 + 'px';
}
window.onload = init;