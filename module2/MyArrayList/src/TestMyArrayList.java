public class TestMyArrayList {
    public static class Student {
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Student a = new Student(1, "Nam 1");
        Student b = new Student(2, "Nam 2");
        Student c = new Student(3, "Nam 3");
        Student d = new Student(4, "Nam 4");
        Student e = new Student(5, "Nam 5");
        Student f = new Student(6, "Nam 6");

        MyArrayList<Student> studentMyArrayList = new MyArrayList<>();
        MyArrayList<Student> newMyArrayList = new MyArrayList<>();
        studentMyArrayList.add(a);
        studentMyArrayList.add(b);
        studentMyArrayList.add(c);
        studentMyArrayList.add(d);
        studentMyArrayList.add(e);
//        studentMyArrayList.add(f, 2);
//        studentMyArrayList.clear();
//        System.out.println(studentMyArrayList.size());
//        for (int i = 0; i < studentMyArrayList.size(); i++) {
//            Student student = (Student) studentMyArrayList.elements[i];
//            System.out.println(student.getId());
//            System.out.println(student.getName());
//        }
//        System.out.println(studentMyArrayList.get(2).getName());
//        System.out.println(studentMyArrayList.indexOf(c));
//        System.out.println(studentMyArrayList.contains(f));
        newMyArrayList = studentMyArrayList.clone();
        for (int i = 0; i < newMyArrayList.size(); i++) {
            System.out.println(newMyArrayList.get(i).getName());
        }
        newMyArrayList.remove(1);
        for (int i = 0; i < newMyArrayList.size(); i++) {
            System.out.println(newMyArrayList.get(i).getName());
        }
    }
}
