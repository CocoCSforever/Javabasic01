public class Asm17 {
    public static void main(String[] args){
        Employee e1=new SalariedEmployee(2000);
        Employee e2=new HourlyEmployee(25,15);
        Employee e3=new SalesEmployee(2000,0.15);
        int x=5;
        /* Test
        Employee[] y=new Employee[3];
        int[] z={1,2};
        y[0]=e1;//正常赋值
        y[1]=z;//想把栈中的int[]数组存储的内存地址  赋给  存储Employee类的y[1]（作为引用类本该存储的是某Employee对象的内存地址），
        数据类型不对无法通过编译，但是在假想中是否意味着我这么做可以通过y[1]调用int类型数组呢，反正存储的都是内存地址？只是因为规范操作不让通过编译
        比如在某test中：
        char arry[3];
        int arr[5];
        printf("arry %p %p %p %p\n",arry,&arry[0],&arry[1],&arry[2]);
        printf("arr %p %p %p %p\n",arr,&arr[0],&arr[1],&arr[2]);
        输出：
        char数组的地址//arry 0x7ffc4ac897b0 0x7ffc4ac897b0 0x7ffc4ac897b1 0x7ffc4ac897b2
        int数组的地址//arr 0x7ffc4ac89790 0x7ffc4ac89790 0x7ffc4ac89794 0x7ffc4ac89798
        */
        System.out.println("员工"+x+"月份工资为"+e1.getSalary(x));
        System.out.println("员工"+x+"月份工资为"+e2.getSalary(x));
        System.out.println("员工"+x+"月份工资为"+e3.getSalary(x));
    }
}


class Employee{
    String name;
    String birthMonth;
    double salary;
    double getSalary(int month){
        return salary;
    }
    public Employee() {
    }
}
class SalariedEmployee extends Employee{
    double monthlySalary;
    public SalariedEmployee(double monthlySalary){
        salary=monthlySalary;
    }
}
class HourlyEmployee extends Employee{
    double hours;
    double hourlySalary;
    public HourlyEmployee(double hours,double hourlySalary){
        this.hours=hours;
        this.hourlySalary=hourlySalary;
        if(hours>160){
            salary=160*hourlySalary+(hours-160)*hourlySalary*1.5;
        }else
        {
            salary = hours * hourlySalary;
        }
    }

}

class SalesEmployee extends Employee{
    double sales;
    double comm;
    public SalesEmployee(double sales,double comm){
        this.sales=sales;
        this.comm=comm;
        salary=sales*comm;
    }
}