function ex1() {
    let number1 = +prompt("Nhap so a:");
    let number2 = +prompt("Nhap so b:");
    if (number1 % number2 === 0) {
        console.log("a chia het cho b");
    } else console.log("Khong chia het");
}

function ex2() {
    let old = +prompt("Nhap so tuoi");
    if (old >= 16) {
        console.log("Du dieu kien");
    } else console.log("Khong du dieu kien");
}

function ex3() {
    let number = +prompt("Nhap so");
    if (number >= 0) {
        console.log(number + "Lon hon hoac bang 0");
    } else console.log(number + "Nho hon 0");
}

function ex4() {
    let number1 = +prompt("Nhap so thu 1: ");
    let number2 = +prompt("Nhap so thu 2: ");
    let number3 = +prompt("Nhap so thu 3: ");
    //let number4 = +prompt("Nhap so thu 4: ");
    if (number1 > number2 && number1 > number3) {
        console.log(number1 + "la so lon nhat");
    } else if (number2 > number3) {
        console.log(number2 + "la so lon nhat")
    } else console.log(number3 + "la so lon nhat");
}

function ex5() {
    let point = +prompt("Nhap diem hoc sinh");
    if (point >= 8) {
        console.log("Hoc luc gioi voi diem: " + point);
    } else if (point >= 6.5) {
        console.log("Hoc luc kha voi diem: " + point);
    } else if (point >= 5) {
        console.log("Hoc luc trung binh voi diem: " + point);
    } else console.log("Hoc luc yeu voi diem: " + point);
}