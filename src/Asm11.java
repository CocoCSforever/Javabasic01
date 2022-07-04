public class Asm11 {
    //模拟登录功能，用户名密码正确时成功登录，错误时提示并退出系统。
    public static void main(String[] args) {
        //初始化界面
        initUI();
    }
    public static void initUI(){
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.println("欢迎使用本系统，请登录！");
        System.out.println("请输入用户名：");
        String username=scan.next();
        System.out.println("请输入密码：");
        String password=scan.next();
        login(username,password);
    }
    public static void login(String a,String b){
        if("admin".equals(a)&&"123".equals(b)){
            System.out.println("成功登录，欢迎"+a+"回来！");
        }else{
            System.out.println( "对不起，您输入的用户名和密码不正确。");
        }
    }
}
