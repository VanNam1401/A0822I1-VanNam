function day() {
    let month = +document.getElementById("day").value;
    switch (month) {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
            document.getElementById("inMonth").innerText = `Tháng ${month} có 31 ngày.`;
            //console.log(`Tháng ${month}có 31 ngày.`)
        case 2:
            document.getElementById("inMonth").innerText = `Tháng ${month} có 28 hoặc 29 ngày.`;
        default:
            document.getElementById("inMonth").innerText = `Tháng ${month} có 30 ngày.`;
    }
}
