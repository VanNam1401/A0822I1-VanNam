function ex6() {
    let a = +prompt("Nhập số a: ");

    if (a !== 0) {
        let b = +prompt("Nhập số b: ");
        let x = -b / a;
        document.getElementById("test").innerText = "Phương trình có nghiệm: " + x;
    } else {
        document.getElementById("test").innerText = "Phương trình vô nghiệm";
    }
}

function ex7() {
    let a = +prompt("Nhập số a: ");
    let b = +prompt("Nhập số b: ");
    let c = +prompt("Nhập số c: ");
    if (a === 0) {
        if (b !== 0) {
            let x = -c / b;
            document.getElementById("test").innerText = "Phương trình có nghiệm: " + x;
        } else {
            document.getElementById("test").innerText = "Phương trình vô nghiệm";
        }
    } else {
        let delta = b * b - 4 * a * c;
        if (delta > 0) {
            let x1 = (-b + Math.sqrt(delta)) / (2 * a);
            let x2 = (-b - Math.sqrt(delta)) / (2 * a);
            document.getElementById("test").innerText = "Phương trình có nghiệm x1 = " + x1 + " x2 = " + x2;
        } else if (delta === 0) {
            document.getElementById("test").innerText = "Phương trình có nghiệm kép x1 = x2 = " + (-b / (2 * a));
        } else {
            document.getElementById("test").innerText = "Phương trình vô nghiệm ";
        }
    }
}

function ex8() {
    let year = parseInt(prompt("Nhập số tuổi: "));

}

function ex9() {
    let a = +prompt("Nhập số a: ");
    let b = +prompt("Nhập số b: ");
    let c = +prompt("Nhập số c: ");
    if (a > 0 && b > 0 && c > 0) {
        if (a + b > c && b + c > a && a + c > b) {
            document.getElementById("test").innerText = a + ", " + b + ", " + c + ", " + "là các cạnh của tam giác";
        } else {
            document.getElementById("test").innerText = a + ", " + b + ", " + c + ", " + "không phải là các cạnh của tam giác";
        }
    }
}