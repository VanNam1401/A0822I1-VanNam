function ex1() {
    let text = "";
    for (let i = 0; i < 5; i++) {
        text += "The number is " + i + "<br>";
    }
    document.getElementById("test").innerHTML = text;
}
function ex2() {
    let num;
    do {
        num = prompt("Enter your number: ");
    } while (num <= 0);
    let total = 0;
    for (let i = 1; i < num; i++) {
        total += i;
    }
    document.getElementById("test2").innerHTML = total;
}