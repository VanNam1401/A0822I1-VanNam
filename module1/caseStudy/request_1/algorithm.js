//Vẽ hình chữ nhật rỗng chiều dài n và chiều rộng m
function practice1() {
    let width, height;
    do {
        width = +prompt("Nhap chieu rong:");
        height = +prompt("Nhap chieu dai:");
    } while (width < 0 || height < 0);
    for (let i = 1; i <= width; i++) {
        for (let j = 1; j <= height; j++) {
            if (i === 1 || j === height || j === 1 || i === width) {
                document.write("*");
            } else {
                document.write("\xa0\xa0");
            }
        }
        document.write("<br>");
    }
}
// Vẽ tam giác vuông cân rỗng có chiều cao h
function practice2() {
    let botton, height;
    do {
        botton = +prompt("Nhap do dai day");
        height = +prompt("Nhap chieu cao: ")
    } while (botton <= 0 || height <= 0 || botton !== height)
    for (let i = 1; i <= botton; i++) {
        for(let j = 1; j <= height; j++) {
            if (j === 1 || j === i || i === botton) {
                document.write("*");
            } else {
                document.write("\xa0\xa0");
            }
        }
        document.write('<br>');
    }
}
//Vẽ tam giác cân đặc có chiều cao h
function practice3() {

}