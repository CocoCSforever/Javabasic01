public class Asm5 {
    //打印2到10000的素数，每行显示8个素数
    public static void main(String[] args) {
        int count = 0;
        first:for (int j = 2; j <= 10000; j++) {
            for (int i = 2; i < j; i++) {
                if (j % i == 0) {
                    continue first;
                }
            }
            count += 1;
            if (count < 8) {
                System.out.print(j + " ");
            } else {
                count = 0;
                System.out.print(j + " ");
                System.out.println();
            }
        }
    }
}
/*
或者public class Test {
public static void main(String[] args) {
int count = 0;
for(int i=2;i<=10000;i++){
boolean isPrimeNum = true;
for(int j=2;j<i;j++){
if(i % j == 0){
isPrimeNum = false;
break;
}
}
if(isPrimeNum){
System.out.print(i + " ");
count++;
if(count == 8){
System.out.println();
count = 0;
}
}
}
}
}
 */
