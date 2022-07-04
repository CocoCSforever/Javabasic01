public class Asm16 {
    public static void main(String[] args) {
        Bird bird1 = new RedBird();

        Bird bird2 = new BlueBird();

        Bird bird3 = new YellowBird();

        Slingshot ss= new Slingshot();
        ss.shot(bird1);
        ss.shot(bird2);
        ss.shot(bird3);
    }
}
    class Slingshot{
    void shot(Bird bird){
        bird.fly();
    }
    }
    class Bird{
        void fly(){
        }
    }
    class RedBird extends Bird{
        @Override
        void fly(){
            System.out.println("红色小鸟正常飞向小猪");
        }
    }
    class BlueBird extends Bird{
        @Override
        void fly(){
            System.out.println("蓝色小鸟分成三个飞向小猪");
        }
    }
    class YellowBird extends Bird{
        @Override
        void fly(){
            System.out.println("黄色小鸟加速飞向小猪");
        }
    }

