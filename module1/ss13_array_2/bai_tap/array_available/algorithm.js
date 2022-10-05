function practice3() {
    let string = prompt("Nhập chuỗi ");
    let str = string.toString();
    let UPPER = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ';
    let LOWER = 'abcdefghijklmnopqrstuvwxyz';
    let ketQua = [];
    for ( let i = 0 ; i < str.length ; i++){
        if (UPPER.indexOf(str[i]) !== -1)
        {
            ketQua.push(str[i].toLowerCase())
        }
        else if (LOWER.indexOf(str[i]) !== -1)
        {
            ketQua.push(str[i].toUpperCase())
        }else
        {
            ketQua.push(str[i]);
        }

    }
    console.log(ketQua.join(''))
}