package LocalTime;

import case_study.models.Person;

import java.time.LocalTime;
import java.util.LinkedList;

public class main {
    static class Number {
        private Object data;
        private int index;

        public void setData(Object data) {
            this.data = data;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public boolean set(Object obj, int index){
            if(obj != null && index > -1){
                this.setIndex(index);
                this.setData(obj);
            }
            return false;
        }
    }
    static class A {
        public String toString(){
            return " A";
        }
    }
    static class B extends A {
        public String toString(){
            return " B";
        }
    }

    class Date{
        int value;

        public Date(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Date{" +
                    "value=" + value +
                    '}';
        }
    }

    public static void main(String[] args) {
        int i = 0 ;
        int n = 0;
        for(;i<10;){
            if(i % 2 == 0){
                n+=i;
                i++;
            }else{
                i++;
            }
        }
        System.out.println(n);


    }


}
