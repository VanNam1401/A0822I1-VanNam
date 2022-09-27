function ex1() {
    let a = 1, b = 0, temp;
    let num = +prompt("Nhập số lượng fibonacci:");
    while (num > 0) {
        document.write(b + " ");
        temp = a;
        a += b;
        b = temp;
        num--;
    }
}

function ex2() {
    let n = +prompt("Nhap n:");
    let value = 1;
    if (n === 0 || n === 1) {
        document.write(1);
    } else {
        while (n > 0) {
            value *= n;
            n--;
        }
        document.write(value);
    }
}
function ex3() {

}