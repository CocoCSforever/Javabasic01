public class Asm15 {
    public static void main(String[] args){
        Animal a1= new Animal("xiaodongwu");
        a1.move();
        //Fish f1= new Fish("yu");
        //f1.move();
    }
}

class Animal{
    private String name;
    public Animal(){
        super();
    }
    public Animal(String name){
        super();
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public void move(){
        System.out.println(name+"正在狂跑");
    }
}
class Fish extends Animal{
    private String color;
    public String getColor(){
        return color;
    }
    public void move(){
        System.out.println(this.getName()+"正在游");
    }
}