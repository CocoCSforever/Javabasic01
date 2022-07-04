public class Asm17x {
    public static void main(String[] args) {
        SalariedEmployeex e1 = new SalariedEmployeex();//为什么这里不需要多态？用父类向下引用，特有方法太多，强制转换很麻烦
        e1.setName("张三");//为什么要设计成private属性，public方法，为什么不能第一次直接定义三个属性
        e1.setMonthlySalary(2000);
        e1.setBirthMonth(5);
        HourlyEmployeex e2 = new HourlyEmployeex();
        e2.setName("lisi");
        e2.setHours(200);
        e2.setHourlySalary(15);
        e2.setBirthMonth(5);
        SalesEmployeex e3 = new SalesEmployeex();
        e3.setName("wangwu");
        e3.setSales(20000);
        e3.setComm(0.15);
        e3.setBirthMonth(5);
        int x = 5;
        System.out.println(e1.getName() + x + "月份工资为" + e1.getSalary(x));
        System.out.println(e2.getName() + x + "月份工资为" + e2.getSalary(x));
        System.out.println(e3.getName() + x + "月份工资为" + e3.getSalary(x));
    }
}

    class Employeex {
        private String name;
        private int birthMonth;

        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name=name;
        }
        public int getBirthMonth(){
            return birthMonth;
        }
        public void setBirthMonth(int birthMonth){
            this.birthMonth=birthMonth;
        }
        public double getSalary(){
            //double salary;salary 属性需要在各subclass自己定义吗？因为salary需要private
            return 0;//return 0 和不写有什么区别，salary是否需要按月分，如输入int month
        }
        //无参数构造方法直接省略了吗？系统自动生成而省略吗？public Employee() {}
    }

    class SalariedEmployeex extends Employeex {
        private double monthlySalary;

        public double getMonthlySalary(){
            return monthlySalary;
        }
        public void setMonthlySalary(double monthlySalary){
            this.monthlySalary=monthlySalary;
        }
        public double getSalary(int month){
            if(month==getBirthMonth()){
                return(monthlySalary+250);
            }else
                return monthlySalary;
        }
    }

    class HourlyEmployeex extends Employeex {
        private double hours;
        private double hourlySalary;

        public double getHours(){
            return hours;
        }
        public void setHours(double hours){
            this.hours=hours;
        }
        public double getHourlySalary(){
            return hourlySalary;
        }
        public void setHourlySalary(double hourlySalary){
            this.hourlySalary=hourlySalary;
        }
        public double getSalary(int month){
            double x;
            if (hours > 160) {
                x= 160 * hourlySalary + (hours - 160) * hourlySalary * 1.5;
            } else {
                x= hours * hourlySalary;
            }
            if(month==getBirthMonth()){
                return x+250;
            }else
                return x;
        }

    }

    class SalesEmployeex extends Employeex {
        private double sales;
        private double comm;

        public double getSales(){
            return sales;
        }
        public void setSales(double sales){
            this.sales=sales;
        }
        public double getComm(){
            return comm;
        }
        public void setComm(double comm){
            this.comm=comm;
        }
        public double getSalary(int month){
            if(month==getBirthMonth()){
                return sales * comm + 250;
            }else
                return sales * comm;
        }

    }
