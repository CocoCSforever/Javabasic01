public class Asm6 {
    //计算5的阶乘
    public static void main(String[] args){
        int sum=1;
        for(int i=1;i<6;i++){
            sum=sum*i;//sum*=i;
        }
        System.out.println("5的阶乘 = "+sum);
    }
}
