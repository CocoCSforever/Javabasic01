import java.util.HashMap;

public class Test2 {
    public String greatestletter(String s) {
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        char res=(char)0;
        for(char c: s.toCharArray()){
            if(c>90){
                if(map.containsKey((char)(c-32)))
                    res=(char)Math.max((int)res,(int)(c-32));
                System.out.println(c+res);
            }else{
                if(map.containsKey((char)(c+32)))
                    res=(char)Math.max((int)res,(int)c);
                System.out.println(c+res);
            }
            map.put(c,1);
        }
        return Character.toString(res);
    }
        /*static int value = 9;
        public static void main(String[] args) throws Exception{
            new Test2().printValue();
        }
        public void printValue(){
            int value = 69;
            System.out.println(value);
        }*/
}
/*int i;
static int j;
public void m1() {
    System.out.println(i);
    System.out.println(j);
    m2();
}
    public void m2(){
    }
    public static void m3(){
        System.out.println(i);
        System.out.println(j);
        m2();
    }
    public static void main(String[] args){
    Test2 x=new Test2();
    x.m1();
    }

 */


