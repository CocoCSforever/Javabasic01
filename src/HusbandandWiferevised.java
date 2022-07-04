public class HusbandandWiferevised {
    public static void main(String[] args){
        Birth husband1Birth=new Birth(1000,10,10);
        People husband1=new People("355111222233334444","丈夫1",husband1Birth,"丈夫1的妻子叫做妻子5678");
        //创建丈夫1对象，以及丈夫1对象的属性Birth
        Birth wife1Birth=new Birth(2000,20,20);
        People wife1=new People("111222333344445555","神奇的就是妻子1的名字叫做妻子5678",wife1Birth,"妻子1的丈夫有个朴素的名字叫做丈夫1");
        System.out.println("丈夫的妻子名为："+husband1.coupleName);
        System.out.println("妻子的丈夫名为:"+wife1.coupleName);
        /*wife1Birth=null;
        System.out.println("妻子的生日为:"+wife1.wifeBirth);
        wife1=null;
        System.out.println("妻子的丈夫名为:"+wife1.husbandName);
        空指针效果:
        wife1.birth=null;或者wife1=null;
        wife1Birth=null;不行
         */
    }
}

class Birth{
    //因为有重复的名为Birth的类所以不能跑，但是可以看下思路。
    int year;
    int month;
    int day;
    public Birth() {}
    public Birth(int year1,int month1,int day1){
        year=year1;
        month=month1;
        day=day1;
    }
        }
class People{
    String number;
    String name;
    Birth birth;
    String coupleName;
    public People(){}
    public People(String number1,String name1, Birth birth1,String coupleName1){
        number=number1;
        name=name1;
        birth=birth1;
        coupleName=coupleName1;
    }
}

