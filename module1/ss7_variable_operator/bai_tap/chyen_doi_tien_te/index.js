function convert() {
    let money = +document.getElementById('amount').value;
    let chon1 = document.getElementById('from').value;
    let chon2 = document.getElementById('to').value;
    if (chon1 == chon2) {
        document.getElementById("result").innerHTML = "Result:  " + money;
    }
    if (chon1 == "VN" && chon2 == "usd") {
        document.getElementById("result").innerHTML = "Result: " + money / 23000;
    }
    if (chon1 == "usd" && chon2 == "VN") {
        document.getElementById("result").innerHTML = "Result:  " + money * 23000;
    }
}