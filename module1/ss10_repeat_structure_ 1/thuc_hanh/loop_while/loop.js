function ex1() {
    let num = +prompt("Enter a number: ");
    let total = 0;
    while (num !== -1) {
        num = +prompt("Enter a number: ");
        alert(num);
        total += num;
    }
    alert(total);
}
function ex2() {
    let i = 1;
    while(i < 100) {
        document.write("<hr width =" + i + ">");
        i++;
    }
}