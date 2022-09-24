function ex1() {
    for (let i = 1; i < 100; i++) {
        document.write(i + " ");
        if (i === 99) {
            alert("Đã hoàn thành");
        }
    }
}

function ex2() {
    let temperature = +prompt("Nhập nhiệt độ hiện tại: ");
    if (temperature >= 100) {
        document.write("Yeu cau giam nhiet do.");
    } else if (temperature <= 20) {
        document.write("Yeu cau tang nhiet do");
    } else {
        document.write("Nhiet do on dinh");
    }
}

function ex3() {
    let a = 1, b = 0, temp;
    let num = 20;
    while (num > 0) {
        document.write(b + " ");
        temp = a;
        a += b;
        b = temp;
        num--;
    }
}

function ex4() {
    let a = 1, b = 0, temp;
    while (1) {
        if (b % 5 === 0) {
            document.write(b + " ");
            break;
        }
        temp = a;
        a += b;
        b = temp;
    }
}

function ex5() {
    let a = 1, b = 0, temp;
    let num = 20;
    let sum = 0
    while (num > 0) {
        //document.write(b + " ");
        sum += b;
        temp = a;
        a += b;
        b = temp;
        num--;
    }
    document.write(sum + "");
}

function ex6() {
    let n = 30, number = 0, sum = 0;
    while (n > 0) {
        if (number % 7 === 0) {
            //document.write(number+" ");
            sum += number;
        }
        n--;
        number = number + 7;
    }
    document.write(sum+"");
}

function ex7() {
    for (let i = 1; i <= 100; i++) {
        if (i % 3 === 0 && i % 5 === 0) {
            document.write("FizzBuzz" + " ");
            continue;
        } else if (i % 3 === 0) {
            document.write("Fizz" + " ");
            continue;
        } else if (i % 5 === 0) {
            document.write("Buzz" + " ");
            continue;
        }
        document.write(i + " ");
    }
}

