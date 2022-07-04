public class Asm14 {
    /*
    定义猴子类，猴子有名字和性别等属性，并且定义猴子说话的方法，定义人类，人有名字和性别等属性，并且定义人说话的方法。使用继承，让代码具有复用性。
    注意说话是以方法定义，名字和性别属性为private，访问和控制方法为public.
    作业代码修改后44-46，为什么Monkey类可以直接用name，Human类需要this.getName()或getName（）?（Human的继承到什么程度，Human访问的难道不算是自己的属性name吗？）
    报错：name has private access in Monkey
    同时思考，把猴子和人做成两个public类和public Asm14下两个类在实操上的区别
     */

    public static void main(String[] args) {
        Monkey m1 = new Monkey();
        m1.setName("小猴子");
        System.out.println("Monkey's name is " + m1.getName());
        Human h1 = new Human();
        h1.setName("一个人");
        System.out.println("Human's name is " + h1.getName());
        h1.speak();
        m1.speak();

    }
}

    class Monkey{
        private String name;
        private boolean sex;

        public Monkey(){
            super();
        }
        public Monkey(String name, boolean sex){
            super();
            this.name=name;
            this.sex=sex;
        }
        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name=name;
        }
        public String getSex(){
            return sex?"公":"母";
        }
        public void setSex(Boolean sex){
            this.sex=sex;
        }
        public void speak(){
            System.out.println(name+"yiyiyaya");
        }
    }

    class Human extends Monkey{
        public void speak(){
            System.out.println(getName()+"shuohua");
        }
    }

