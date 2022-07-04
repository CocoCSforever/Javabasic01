public class Asm3 {
    //学号：110
    //姓名：小马
    //性别：女
    //身高：1.85
    //-------------------------
    //学号：120
    //姓名：李四
    //性别：女
    //身高：1.65
    public static void main(String[] args){
        int number = 110;
        String name = "小马";
        char gender = '女';
        double height = 1.85;
        System.out.println("学号：" + number);
        System.out.println("姓名：" + name);
        System.out.println("性别：" + gender);
        System.out.println("身高：" + height);
        System.out.println("-------------------------");
        number = 120;
        name = "李四";
        gender = '女';
        height = 1.65;
        System.out.println("学号：" + number);
        System.out.println("姓名：" + name);
        System.out.println("性别：" + gender);
        System.out.println("身高：" + height);
        /**
         * 或者定义两次变量，即
         * int stuNo1和stuNo2; String stuName1和stuName2;
         * char stuSex1和stuSex2; double stuHeight1和stuHeight2
         * 将println中各变量名变更为1和2
         */
    }
}
