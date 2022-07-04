public class Asm17 {

    public static void main(String[] args) {
        SalariedEmployee e1 = new SalariedEmployee();//为什么这里不需要多态？用父类向下引用，特有方法太多，强制转换很麻烦,要不要要不要
        e1.setName("张三");//为什么要设计成private属性，public方法，为什么不能第一次直接定义三个属性
        e1.setMonthlySalary(3000);
        e1.setBirthMonth(5);
        HourlyEmployee e2 = new HourlyEmployee();
        e2.setName("lisi");
        e2.setHours(200);
        e2.setHourlySalary(15);
        e2.setBirthMonth(5);
        SalesEmployee e3 = new SalesEmployee();
        e3.setName("wangwu");
        e3.setSales(20000);
        e3.setComm(0.15);
        e3.setBirthMonth(5);
        int month = 5;
        e1.printSalary(month);
        e2.printSalary(month);
        e3.printSalary(month);
        System.out.println("xxx");
        //System.out.println(e1.getName() + x + "月份工资为" + e1.getSalary(x));
        //System.out.println(e2.getName() + x + "月份工资为" + e2.getSalary(x));
        //System.out.println(e3.getName() + x + "月份工资为" + e3.getSalary(x));
    }

    //month不能放main方法外面去，如果在main方法的外面，说明是public class的实例变量，
    // 要访问需要先创建对象，main作为静态方法无法直接访问实例变量。
    // 把getSalary再修改一下，ok
    }

class Employee {
    private String name;
    private int birthMonth;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary(int month) {
        return salary;

        //salary 属性最好在各subclass自己定义还是在父类定义呢？salary需要private
        //return 0 和不写有什么区别：方法覆盖有区别，需要返回值类型相同
        //salary是否需要按月分，如输入int month
    }

    public void printSalary(int month) {
        System.out.println(this.getName() + month + "月份工资为" + this.getSalary(month));
        //无参数构造方法直接省略了吗？是因为系统自动生成而省略吗？"public Employee() {}"
    }
}

    class SalariedEmployee extends Employee {
        private double monthlySalary;
        private double x;

        public double getMonthlySalary() {
            return monthlySalary;
        }

        public void setMonthlySalary(double monthlySalary) {
            this.monthlySalary = monthlySalary;
        }

        public double getSalary(int month) {
            double x;
            if (month == getBirthMonth()) {
                x = monthlySalary + 250;
            } else
                x = monthlySalary;
            setSalary(x);
            return x;
        }
    }

    class HourlyEmployee extends Employee {
        private double hours;
        private double hourlySalary;

        public double getHours() {
            return hours;
        }

        public void setHours(double hours) {
            this.hours = hours;
        }

        public double getHourlySalary() {
            return hourlySalary;
        }

        public void setHourlySalary(double hourlySalary) {
            this.hourlySalary = hourlySalary;
        }

        public double getSalary(int month) {
            double x;
            if (hours > 160) {
                x = 160 * hourlySalary + (hours - 160) * hourlySalary * 1.5;
            } else {
                x = hours * hourlySalary;
            }
            if (month == getBirthMonth())
                x = x + 250;
            setSalary(x);
            return x;
        }

    }

    class SalesEmployee extends Employee {
        private double sales;
        private double comm;

        public double getSales() {
            return sales;
        }

        public void setSales(double sales) {
            this.sales = sales;
        }

        public double getComm() {
            return comm;
        }

        public void setComm(double comm) {
            this.comm = comm;
        }

        public double getSalary(int month) {
            double x;
            if (month == getBirthMonth()) {
                x = sales * comm + 250;
            } else
                x = sales * comm;
            setSalary(x);
            return x;
        }

    }


