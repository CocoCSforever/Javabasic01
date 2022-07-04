public class Asm10 {
    //通过递归方法计算n的阶乘，可通过更改n=?
    public static void main(String[] args){
        int n=5;
        int result=accumulate(n);
        System.out.println(n+"的阶乘为："+ result);
    }
    public static int accumulate(int n){
        if(n==2){
            return 2;
        }
        return n*accumulate(n-1);
    }
}
