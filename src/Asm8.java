public class Asm8 {
    /*：编写程序输出下图菱形。
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
public class Test {
public static void main(String[] args) {
int lay = 9;
for (int m = 1; m <= (lay + 1) / 2; m++){
for (int b = 1; b <= (lay + 1) / 2 - m; b++){
System.out.print(" ");
}
for (int c = 1; c <= m * 2 - 1; c++) {
System.out.print("*");
}
System.out.println();
}
for (int d = (lay + 1) / 2 - 1; d >= 1; d--){
for (int b = 1; b <= (lay + 1) / 2 - d; b++){
System.out.print(" ");
}
for (int c = (lay + 1) / 2 - d; c <= (lay + 1) / 2 - 2 + d; c++){
System.out.print("*");
}
System.out.println();
     */
    public static void main(String[] args) {
        for (int i = 1; i < 10; i = i + 2) {
            for (int j = 1; j <= 5 + (i - 1) / 2; j++) {
                if (j >= 5 - (i - 1) / 2 && j <= 5 + (i - 1) / 2) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 7; i > 0; i = i - 2) {
            for (int j = 1; j <= 5 + (i - 1) / 2; j++) {
                if (j >= 5 - (i - 1) / 2 && j <= 5 + (i - 1) / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
