public class operatorsDemo {
public static void main(String[]args){
int totalSalary = 10000;
int advances = 0;
int commission = 2000;
commission += 5000;

System.out.println("commission: "+commission);

int shopping = 5000;
shopping -= 3000;
System.out.println("shopping: "+shopping);
System.out.println("advances: "+( shopping + commission));

int x= 200;
int y= 3;
int transport = 1200;
transport -= (x * y);
System.out.println("transport: "+transport);

System.out.println("Total Salary: "+(totalSalary + commission + shopping + advances + transport));


}
}
