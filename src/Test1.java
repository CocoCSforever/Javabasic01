import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        Integer[] b = {1,2,3};

        List listA = Arrays.asList(a);
        List listA1 = Arrays.asList(1,2,3);
        List listB = Arrays.asList(b);

        System.out.println(listA.size());//out:1
        System.out.println(listA1.size());//out:3
        System.out.println(listB.size());//out:3



        List<List<Integer>> res = new ArrayList<>();

        Integer[] nums1 = new Integer[]{1,2};
        int[] nums2={1,2};
        Integer x=5, y=6;
        /*List<Integer> test= Arrays.asList(nums2);//应改为
        List<int[]> test1= Arrays.asList(nums2,nums2);//实际生成以int[]为元素的二维数组
        List<Integer> test2=new ArrayList<Integer>();

        res.add(Arrays.asList(nums1,nums2[0]));
        res.add(Arrays.asList(nums1,x));
        res.add(Arrays.asList(nums1));//Integer Array as object,size=3
        res.add(Arrays.asList(nums2));
        res.add(Arrays.asList(nums2[0],nums2[1]));
        res.add(Arrays.asList(x,y));//Integer variables
        res.add(Arrays.asList(5,6));//autoboxing
        res.add(Arrays.asList(5,x));
*/


        int i = 0;
        while (i < 10) {
            System.out.println("i=" + (++i));
        }
    }
}