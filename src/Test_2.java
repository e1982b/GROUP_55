public class Test_2 {

    int x = 15, y = 20;
    double z= 15.5;

    public int sum() {
        return y + x;
    }

    public static void main(String[] args) {
        Test_2 test= new Test_2();
        System.out.println("test.x = " + test.x);
        System.out.println("test.sum() = " + test.sum());

    }
}
