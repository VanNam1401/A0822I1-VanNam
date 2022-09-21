function nhap(so) {
    document.getElementById("window").value += so;
}

function bang() {
    let string = document.getElementById("window").value;
    document.getElementById("window").value = eval(string);
}

function xoa() {
    document.getElementById("window").value = "";
}
function xoaKyTu() {
    let string = document.getElementById("window").value;
    let array = string.split("");
    array[array.length - 1] = "";
    document.getElementById("window").value = array.join("");
}