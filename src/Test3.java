import java.util.Arrays;
import java.util.Comparator;

public class Test3 {
    public static void main(String[] args){
        int[][] ints = new int[][]{{12, 4},{15, 7},{2, 2},{3, 9}};
        int[] arr=new int[]{3,0,2,6,8,1,7,9,4,2,5,5,0};
        ListNode head= new ListNode(3);
        ListNode put=head;
        int i=1;
        while(i<arr.length){
            put.next=new ListNode(arr[i++]);
            put=put.next;
        }
        int[][] res=spiralMatrix(3,5,head);
    }
        /*public static int[][] twoSum(int[][] arr){
            //Arrays.sort(arr, Comparator.comparingInt(o -> o[0]));
            Arrays.sort(arr, (o1,o2)->o2[1]-o1[1]);
            /*Arrays.sort(arr, new Comparator<int[]>(){
                @Override
                public int compare(int[] o1, int[] o2) {
                    return o2[1] - o1[1];}
            });*/
            //Arrays.sort(arr, Comparator.comparing(x -> x[0], Comparator.reverseOrder()));
            //Arrays.sort(arr, Comparator.comparingInt(o -> o[1]));
            /*for (int i = 0; i < arr.length; i++) {
            //Arrays.sort(arr[i]);

            System.out.println(Arrays.toString(arr[i]));
            }
            return arr;
        }
        */

        public static int[][] spiralMatrix(int m, int n, ListNode head){
            int[][] res= new int[m][n];
            int a=0,b=n,c=-1,d=m;
            int x=0,y=0;
            for(int i=0;i<m && i<n;i++){
                while(x<d-i){

                    while(y<b-i){
                        if(head!=null){
                            res[x][y++]=head.val;
                            //System.out.println(res[x][y++]);
                            head=head.next;
                        }else{
                            res[x][y++]=-1;
                        }
                        if(y==b-i){
                            y--;
                            x++;
                            break;
                        }
                    }

                    while(x<d-i) {

                        if (x >= d - i) {
                            x--;
                            break;
                        }
                        if (head != null) {
                            res[x++][y] = head.val;
                            head = head.next;
                        } else {
                            res[x++][y] = -1;
                        }
                        if (x == d - i) {
                            x--;
                            y--;
                            System.out.println(x);
                            while (y > c + i) {
                                if (head != null) {
                                    System.out.println(x);
                                    res[x][y--] = head.val;
                                    head = head.next;
                                } else {
                                    res[x][y--] = -1;
                                }
                            }
                            y++;
                            break;
                        }
                    }
                    break;
                }
                x--;
                if(y==b-i)y--;
                System.out.println(x);
                while(x>a+i){
                    //System.out.println(x);
                    if(head!=null){
                        res[x--][y]=head.val;
                        head=head.next;
                    }else{
                        res[x--][y]=-1;
                    }
                }
                x++;
                y++;
            }
            return res;
        }
    }

