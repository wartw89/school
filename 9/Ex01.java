package L9;
class CRectangle {
    int width;
    int height;

    public CRectangle(int w, int h) {
        width = w;
        height = h;
    }

    public CRectangle() {
        width = 10;
        height = 8;
    }

    public CRectangle() {
        this(10, 8);
    }
}

public class Ex01 {
    public class Main {
        public static void main(String[] args) {
            
            CRectangle rectA = new CRectangle(20, 30);
            System.out.println("Width: " + rectA.width + ", Height: " + rectA.height);
    
            CRectangle rectB = new CRectangle();
            System.out.println("Width: " + rectB.width + ", Height: " + rectB.height);
    
            CRectangle rectC = new CRectangle();
            System.out.println("Width: " + rectC.width + ", Height: " + rectC.height);
        }
    }
    
}
