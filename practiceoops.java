interface Test {
    void meth1();

    void meth2();
}

class My implements Test {
    public void meth1() {
        System.out.println("Meth1 of class My");
    }

    public void meth2() {
        System.out.println("Meth2 of class My");

    }

    public void meth3() {
        System.out.println("Meth3 of class My");
    }
}

public class practiceoops {

    public static void main(String[] args) {
        My t = new My();
        t.meth1();
        t.meth2();
        t.meth3();
        Test t1 = new My();
        t1.meth1();
        t1.meth2();
    }

}
