public class Asm9 {
    /*
public class Test {
public static void main(String[] args) {
double height = 5.0;
int count = 0;
while(height > 0.1){
height *= 0.3;
count++;
}
System.out.println("弹起次数 = " + count);
}
}
     */
    public static void main(String[] args){
        double height=5;//5.0
        int i=1;
        for(;i<100;i++){
            height*=0.3;
            if(height<=0.1){
                break;
            }
        }
        System.out.println(i);
    }
}
