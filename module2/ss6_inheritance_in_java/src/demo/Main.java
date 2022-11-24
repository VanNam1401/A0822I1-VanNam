package demo;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        // đa hình tại biên dịch
        person.howToGo();
        person.howToGo("xe đạp");
        person.toString();
        Student student = new Student();
        //sử dụng method của cha
        student.howToGo();
        System.out.println(student.toString());
        //method private không cho kế thừa
        student.howToGo();
        //đa hình tại runtime
        Person person1 = new Student();
        person1.howToGo();
//        person1.study();
        Student student1 = (Student) person1;
        student1.study();
        ((Student) person1).study();
        // muốn chỉ tạo một mảng mà có thể lưu được cả sinh viên và employee
        Student[] students = new Student[10];
        students[0] = new Student();
        students[1] = new Student();
        Person[] people = new Person[20];
        people[0] = new Student();
        people[1] = new Employee();
        for (Person p : people) {
            if (p instanceof Student) {
                ((Student) p).study();
            } else {
                ((Employee) p).countMoney();
            }
        }
    }
}