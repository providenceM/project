import java.util.Scanner;

public class Employee {



        public static void main(String[] args)
        {
            Scanner input = new Scanner(System.in);
            System.out.print("type 1 to calculate monthly salary and 2 for hourly salary and 3 for weekly employees: ");
            int i = input.nextInt();
            if (i== 1){
                Employee emp = new Employee();
                System.out.println(emp.monthly_employee());
            }
            else if(i== 2){
                Employee emp2 = new Employee();
                System.out.println(emp2.hourly_employee());
            }
else if(i==3){
    Employee emp3 = new Employee();
    System.out.println(emp3.weekly_employee());
            }


            //input.close();
        }
        public double monthly_employee()
        {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a gross salary: ");
            double gross_salary = input.nextDouble();
            double tax_ded= (gross_salary*30)/100;
            double rssb_dud= (gross_salary*3)/100;
            double ded= tax_ded + rssb_dud;
            double salary= gross_salary - ded;
            return salary;
        }
        public double hourly_employee() {

            Scanner input = new Scanner(System.in);
            System.out.print("Enter number of hours: ");
            int hours = input.nextInt();
            System.out.print("Enter hourly rate: ");
            double hourly_rate = input.nextDouble();


             if (hours>8){
                 double salary = hours * hourly_rate;
                 double bonus= hours * hourly_rate*5/100;
                 double net_salary=salary+bonus;
                 return  net_salary;
             }
             else{
                 double salary = hours * hourly_rate;
                 return  salary;
             }

        }
public double weekly_employee()
{
    Scanner input = new Scanner(System.in);
    System.out.print("Enter number of days: ");
    int hours = input.nextInt();
    System.out.print("Enter day rate: ");
    double hourly_rate = input.nextDouble();


    if (hours>8){
        double salary = hours * hourly_rate;
        double bonus= hours * hourly_rate*20/100;
        double net_salary=salary+bonus;
        return  net_salary;
    }
    else{
        double salary = hours * hourly_rate;
        return  salary;
}
        }}

