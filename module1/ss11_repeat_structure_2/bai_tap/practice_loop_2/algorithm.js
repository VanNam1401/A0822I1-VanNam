//In dãy Finonaci
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
//Tính giai thừa của một số nguyên dương
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
//In tam giác vuông. Các góc vuông nằm ở các vị trí khác nhau
function ex3() {
    let n = +prompt("Nhập thứ tự từ 1 -> 4: ");

    let value = +prompt("Nhập số dòng: ")
    switch (n) {
        case 1:
            for (let i = 1; i <= value; i++) {
                for (let j = 1; j <= i; j++) {
                    document.write("*");
                }
                document.write('<br>');
            }
            break;
        case 2:
            for (let i = 1; i <= value; i++) {
                for (let j = value; j >= i; j--) {
                    document.write("*");
                }
                document.write('<br>');
            }
            break;
        case 3:
            for (let i = 0; i < value; i++) {
                for (let j = value; j > i; j--) {
                    document.write("\xa0\xa0");
                }
                for (let k = 0; k <= i; k++) {
                    document.write("*");
                }
                document.write('<br>');
            }
            break;
        case 4:
            for (let i = 0; i < value; i++) {
                for (let j = 0; j < i; j++) {
                    document.write("\xa0\xa0");
                }
                for (let k = i; k < value; k++) {
                    document.write("*");
                }
                document.write('<br>');
            }
            break;
    }
}
//In hình chữ nhật
function ex4() {
    let width, height;
do {
     width = Number(prompt("Nhap chieu rong:"));
     height = Number(prompt("Nhap chieu dai:"));
} while (width < 0 || height < 0);
    for (let i = 1; i <= width; i++) {
        for (let j = 1; j <= height; j++) {
            if (i === 1 || i === width || j === 1 || j === height) {
                document.write("*");
                // } else if (j === 1) {
                //     document.write("*");
            } else {
                document.write("\xa0\xa0");
            }
        }
        document.write('<br>');
    }
}
//Viết chương trình tính lãi ngân hàng (lãi mẹ đẻ lại con) khi biết số tiền ban đầu, số tháng cho vay và lãi xuất hàng tháng.
function ex5() {
    let money = +prompt("Nhập số tiền ban đầu");
    let month = +prompt("Nhập số tháng cho vay");
    let interestRate = 0.07;
    //let sumMoney = 0;
    for (let i = 1; i <= month; i++) {
        money = money + money * interestRate;
    }
    document.write(money + '');
}