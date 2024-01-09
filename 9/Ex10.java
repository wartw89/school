package L9;
class CRational {
    public int n;
    public int d;

    public void setN(int num) {
        n = num;
    }

    public void setD(int num) {
        d = num;
    }

    public void setND(int num, int den) {
        setN(num);
        setD(den);
    }

    public void show() {
        System.out.println(n + "/" + d);
    }
}

public class Ex10 {
    public static void main(String args[]) {
        CRational aaa = new CRational();
        aaa.setN(2);
        aaa.setD(5);
        aaa.show();
        aaa.setND(3, 8);
        System.out.println(aaa.n + "/" + aaa.d);
        
    }
}
