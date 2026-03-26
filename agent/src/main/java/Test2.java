import com.mhxy.demo.DemoApp;

public class Test2 {
    static {
        test2(123, "lalala");
    }

    public static String test2(int aa, String bb) {
        System.out.println("test2");
        DemoApp.main(null);
        return aa + bb;
    }

    public static void main(String[] args) {
    }
}
