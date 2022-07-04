public class Asm18 {
    public static int k = 0;
    public static Asm18 t1 = new Asm18("t1");
    static {
        print("x");
    }
    public static Asm18 t2 = new Asm18("t2");
    public static int i = print("i");
    public static int n = 99;
    public int j = print("j");
    static {
        print("静态块");
    }
    public Asm18(String str) {
        System.out.println((++k) + ":" + str + " i=" + i + " n=" + n);
        ++i;
        ++n;
    }
    public static int print(String str) {
        System.out.println((++k) + ":" + str + " i=" + i + " n=" + n);
        ++n;
        return ++i;
    }
    public static void main(String[] args) {
       new Asm18("init");
}
}
