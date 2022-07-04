public class Asm13 {
    //定义“人”类，“人”类包括这些属性：姓名、性别、年龄等。使用封装的方式编写
    //程序，要求对年龄进行安全控制，合法的年龄范围为[0~100]，其他值表示不合法。
    //可通过更改age数值调试
    public static void main(String[] args){
        People13 people1=new People13("苍老小马","男女",56);
        System.out.println("本人姓名为："+people1.name);
        System.out.println("本人性别为："+people1.sex);
        System.out.println("本人年龄为："+people1.getAge());
        people1.name="开学了好烦";
        people1.sex="滚";
        people1.setAge(180);
        System.out.println("本人姓名为："+people1.name);
        System.out.println("本人性别为："+people1.sex);
        System.out.println("本人年龄为："+people1.getAge());
    }
}
class People13{
    String name;
    String sex;
    private int age;
    public People13(){}
    public People13(String name1,String sex1,int age1){
        name=name1;
        sex=sex1;
        age=age1;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age1){
        if(age1<0||age1>100){
            System.out.println("输入年龄不合法，取值须在0-100间。");
            //throw new RuntimeException("年龄非法！");
        }else
            age=age1;
    }
}
/*
public class People {
private String name;
private boolean sex;
private int age;
public String getName() {
return name;
}
public void setName(String _name) {
name = _name;
}
public boolean isSex() {
return sex;
}
public void setSex(boolean _sex) {
sex = _sex;
}
public int getAge() {
return age;
}
public void setAge(int _age) {
if(_age < 0 || _age > 100){
throw new RuntimeException("年龄不合法！");
}
age = _age;
}
}

public class PeopleTest {
public static void main(String[] args) {
People p = new People();
p.setName("张三");
p.setAge(20);
p.setSex(true);
System.out.println("姓名 = " + p.getName());
System.out.println("性别 = " + (p.isSex() ? "男" : "女"));
System.out.println("年龄 = " + p.getAge());
p.setAge(-100);
}
}





 */