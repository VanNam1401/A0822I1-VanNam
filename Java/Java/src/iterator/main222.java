package iterator;

public class main222 {
    static class student{
        private int id ;
        private String name;
        private String address;

        public student(int id, String name, String address) {
            this.id = id;
            this.name = name;
            this.address = address;
        }

        public student() {
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

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        @Override
        public String toString() {
            return "student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", address='" + address + '\'' +
                    '}';
        }
    }
    public static void main(String[] args) {
        student st = new student();
        student st1 = new student(1,"nguyen tran kien","da nang");
        System.out.println(st1);
    }
}
