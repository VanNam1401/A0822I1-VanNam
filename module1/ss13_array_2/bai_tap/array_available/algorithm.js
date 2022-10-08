function practice1() {
    let arr = Array ("Red", "Green", "White", "Black");
    console.log(arr.toString());
    console.log(arr.join());
    console.log(arr.join('+'));
}

function practice2() {
    let num = prompt("Nhap mot so: ");
    let str = num.toString();
    let result = [str[0]];
    for (let i = 1; i < str.length; i++) {
        if ((str[i - 1] % 2 === 0) && (str[i] % 2 === 0)) {
            result.push('-', str[i]);
        } else {
            result.push(str[i]);
        }
    }
    console.log(result.join(''));
}

function practice3() {
    let string = prompt("Nhập chuỗi ");
    let str = string.toString();
    let UPPER = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ';
    let LOWER = 'abcdefghijklmnopqrstuvwxyz';
    let ketQua = [];
    for (let i = 0; i < str.length; i++) {
        if (UPPER.indexOf(str[i]) !== -1) {
            ketQua.push(str[i].toLowerCase())
        } else if (LOWER.indexOf(str[i]) !== -1) {
            ketQua.push(str[i].toUpperCase())
        } else {
            ketQua.push(str[i]);
        }
    }
    console.log(ketQua.join(''))
}