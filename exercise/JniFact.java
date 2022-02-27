public class JniFact {

    static {
        System.loadLibrary("native");
    }

    public native long calculate(int num);
}