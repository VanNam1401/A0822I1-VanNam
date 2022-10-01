//tính thuế thu nhập và lương ròng
function exercise1() {
    let salary;
    do {
        salary = +prompt("Nhap tien luong nhan vien: ");
    } while (salary < 0);
    if (salary === 15000000) {
        document.write("Thue thu nhap: 20%" + '<br>');
        document.write("Luong rong: " + (salary - salary * 20 / 100) + '');
    } else if (salary >= 7000000 && salary < 15000000) {
        document.write("Thue thu nhap: 10%" + '<br>');
        document.write("Luong rong: " + (salary - salary * 10 / 100) + '');
    } else if (salary < 7000000) {
        document.write("Thue thu nhap: 5%" + '<br>');
        document.write("Luong rong: " + (salary - salary * 5 / 100) + '');
    } else {
        document.write("Thue thu nhap: 30%" + '<br>');
        document.write("Luong rong: " + (salary - salary * 30 / 100) + '');
    }
}

// Kiểm tra ký tự trong bảng chữ cái tiếng anh là nguyên âm hay phụ âm.
function exercise2() {
    let character;
    do {
        character = prompt("Nhap ki tư can kiem tra: ");
    } while (character < 'A' || character > 'z');
    switch (character) {
        case 'o':
        case 'u':
        case 'i':
        case 'a':
        case 'e':
        case 'O':
        case 'U':
        case 'I':
        case 'A':
        case 'E':
            document.write("La ki tu nguyen am!!!");
            break;
        default:
            document.write("La ki tu phu am!!!");
    }
}