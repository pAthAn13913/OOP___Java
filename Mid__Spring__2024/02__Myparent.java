public class Myparent {
    private int p;

    public Myparent(int p) {
        this.p = p;
    }

    public Myparent() {
    }

    public final int myfunction() {
        return p * p;
    }

    public void set_p(int Q) {
        p = Q;
    }

    public int get_p() {
        return p;
    }


}

class Mychild extends Myparent {
    public Mychild(int k) {
        super(k);
    }

    public Mychild() {
    }

    public double myroot() {

        double result = Math.sqrt(get_p());

        return result;
    }

}

class Mytest {
    public static void main(String[] args) {
        Myparent c1, c2;
        c1 = new Mychild(2);
        c2 = new Mychild();
        c2.set_p(2);
        int x = c2.myfunction();
        double y = ((Mychild) c1).myroot();
        System.out.println("x=" + x + ",y=" + y);


    }
}
