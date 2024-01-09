package L9;
class CCount {
    private static int cnt = 0;

    public CCount() {
        cnt++;
    }

    public int getCount() {
        return cnt;
    }

    public void setZero() {
        cnt = 0;
    }

    public void setValue(int n) {
        cnt = n;
    }
}

public class Ex05 {
        public static void main(String[] args) {
        CCount obj1 = new CCount();
        CCount obj2 = new CCount();
        CCount obj3 = new CCount();

        System.out.println("a: " + obj3.getCount());

        obj1.setZero();
        System.out.println("b: " + obj1.getCount());

        obj2.setValue(42);
        System.out.println("c: " + obj2.getCount());

        System.out.println("d:類別變數，因為它需要記錄所有的物件的個數");
        System.out.println("e:類別函數");
    }
}

