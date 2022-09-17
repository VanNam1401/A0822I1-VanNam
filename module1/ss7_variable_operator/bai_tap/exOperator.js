function exercise1()
{
    let pointPhysic = Number(prompt("Nhập điểm lý"));
    let pointChemistry = Number(prompt("Nhập điểm hóa"));
    let pointBiological = Number(prompt("Nhập điểm sinh: "));
    let sum = Number(pointBiological + pointChemistry + pointPhysic)
    let avg = Number(sum/ 3);
    alert(avg +" "+ sum);
}
function exercise2()
{
    let value = Number(prompt("Nhập nhiệt đô C: "));
    let input = Number(value * 9/5 + 32);
    alert(input);
}
const PI = 3.14;
function exercise3()
{
    let radius = Number(prompt("Nhập bán kính: "));
    let area = Number(radius*radius*PI);
    alert(area);
}
function exercise4()
{
    let radius = Number(prompt("Nhập bán kính: "));
    let perimeter = Number(radius*2*PI);
    alert(perimeter);
}
