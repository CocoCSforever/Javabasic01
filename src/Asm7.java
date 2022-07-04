public class Asm7 {
    /*控制台输入年龄，根据年龄输出不同的提示。
    public class Test {
        public static void main(String[] args) {
            java.util.Scanner s = new java.util.Scanner(System.in);
            System.out.print("请输入年龄：");
            int age = s.nextInt();
            if(age < 0 || age > 150){
                throw new RuntimeException("对不起，年龄值不合法！");
            }
            String grade = "你是老年人";
            if(age < 5){
                grade = "可爱的小baby";
            }else if(age < 10){
                grade = "你还是个小屁孩";
            }else if(age < 15){
                grade = "小少年，不错哦";
            }else if(age < 18){
                grade = "你是个青少年";
            }else if(age < 35){
                grade = "你是个青年人";
            }else if(age < 50){
                grade = "你已是中年人";
            }
            System.out.println(grade);
        }
    }
    */
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int age, t;
        do {
            System.out.println("请宝贝输入年龄：");
        age = scanner.nextInt();
        if (age <= 0 || age > 150) {
            System.out.println("您的输入超出可识别范围！");
        } else if (age <= 18) {
            System.out.println("可爱女孩小马爱");
        } else if (age <= 30) {
            System.out.println("独立女性搞事业");
        } else if (age <= 50) {
            System.out.println("四十男人一枝花");
        } else if (age <= 100) {
            System.out.println("长命百岁");
        }
        System.out.println("重启客服小马请输入1，结束服务请输入0：");
        t = scanner.nextInt();
        switch (t) {
            case 0:
                System.out.println("服务结束，请对本次服务进行评价：");
                String evaluation = scanner.next();
                System.out.println("您对客服天使小马吃不胖的评价为：" + evaluation);
                break;
            case 1:
                break;
            default:
                System.out.println("非法输入");
        }
    }while(t==1);

    }
}
