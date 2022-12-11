package demo;

public class MyClassGeneric<T> {
    T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
    public <K> void display(K k){

        System.out.println(k);
    }
}

