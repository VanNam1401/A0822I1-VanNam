function addition() {
    let number1 = +document.getElementById('num1').value;
    let number2 = +document.getElementById('num2').value;
    let result = number1 + number2;
    document.getElementById("dapAn").innerHTML = "Result Addition: " + result;
}

function subtraction() {
    let number1 = +document.getElementById('num1').value;
    let number2 = +document.getElementById('num2').value;
    let result = number1 - number2;
    document.getElementById("dapAn").innerHTML = "Result Addition: " + result;
}

function multiplication() {
    let number1 = +document.getElementById('num1').value;
    let number2 = +document.getElementById('num2').value;
    let result = number1 * number2;
    document.getElementById("dapAn").innerHTML = "Result Addition: " + result;
}

function division() {
    let number1 = +document.getElementById('num1').value;
    let number2 = +document.getElementById('num2').value;
    let result = number1 / number2;
    document.getElementById("dapAn").innerHTML = "Result Addition: " + result;
}