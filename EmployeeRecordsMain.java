/*
 Name :- Abhishikth Boda
 Roll Number :- S20210010044
 Assignment:- 2
 */


import java.util.Scanner;

class Employee
{
    String name;
    String employeeID;
    float basic_salary;
    int a_percent;
}

public class EmployeeRecordsMain {
    public static Employee[] emp = new Employee[5];
    public static Employee createEmployee(String name,String employeeID,float basic_salary, int a_percent){
        Employee e = new Employee(); 
        e.name = name;
        e.employeeID = employeeID;
        e.basic_salary = basic_salary;
        e.a_percent = a_percent;
        return e;
    }

    public static void findEmployeeById(){
        String Id;
        Scanner i = new Scanner(System.in);
        Id = i.nextLine();
        for(int j = 0;j<emp.length;j++){
            if(Id.compareTo(emp[j].employeeID)==0){
                System.out.printf("Name: %s\n Employee ID: %s\nbasic salary:%f\nAllowance percentage:%d\n", emp[j].name,emp[j].employeeID,emp[j].basic_salary,emp[j].a_percent);
            }
        }
        i.close();
    }

    public static void findEmployeeByName(){
        String NAME;
        Scanner i = new Scanner(System.in);
        NAME = i.nextLine();
        for(int j = 0;j<emp.length;j++){
            if(NAME.compareTo(emp[j].name)==0){
                System.out.printf("Name: %s\n", emp[j].name);
            }
        }
        i.close();
    }
    public static void findEmployeeSalary(){
        String Id1;
        int sal;
        Scanner i = new Scanner(System.in);
        Id1 = i.nextLine();
        for(int j = 0;j<emp.length;j++){
            if(Id1.compareTo(emp[j].employeeID)==0){
                sal = (int)emp[j].basic_salary + ((int)emp[j].basic_salary)*(emp[j].a_percent);
                System.out.printf("Salary of employee with Id %s is %d\n", Id1, sal);
            }
        }
        i.close();
        
    }
    public static void printEmployeeDetail(){
        System.out.printf("Name: %s\n Employee ID: %s\nbasic salary:%f\nAllowance percentage:%d\n", emp[0].name,emp[0].employeeID,emp[0].basic_salary,emp[0].a_percent);
        System.out.printf("Name: %s\n Employee ID: %s\nbasic salary:%f\nAllowance percentage:%d\n", emp[1].name,emp[1].employeeID,emp[1].basic_salary,emp[1].a_percent);
        System.out.printf("Name: %s\n Employee ID: %s\nbasic salary:%f\nAllowance percentage:%d\n", emp[2].name,emp[2].employeeID,emp[2].basic_salary,emp[2].a_percent);
        System.out.printf("Name: %s\n Employee ID: %s\nbasic salary:%f\nAllowance percentage:%d\n", emp[3].name,emp[3].employeeID,emp[3].basic_salary,emp[3].a_percent);
        System.out.printf("Name: %s\n Employee ID: %s\nbasic salary:%f\nAllowance percentage:%d\n", emp[4].name,emp[4].employeeID,emp[4].basic_salary,emp[4].a_percent);

    }
    public static void main(String[] args)
    {
        int n;
        Scanner i = new Scanner(System.in);
        System.out.println("Enter a number\n 1. create employee\n2.find employee by id\n3.find employee by name\n4.find employee salary \n 5.print employee details\n6.exit\n");
       
        while(true){ 

            n = i.nextInt();
            switch(n){
                case 1:
                {
                    emp[0]=createEmployee("Rayudu",   "A235",  67000,  2);
                    emp[1]=createEmployee("Avinash",  "A236",  80000,  4);
                    emp[2]=createEmployee("Praneeth", "A237",  120000, 1);
                    emp[3]=createEmployee("Thanush",  "A238",  50000,  5);
                    emp[4]=createEmployee("Preetham", "A239",  75000,  3);
                    break;
                }   
                case 2:
                {
                    findEmployeeById();
                    break;
                }
                case 3:
                {
                    findEmployeeByName();
                    break;
                }  
                case 4:
                {
                    findEmployeeSalary();
                    break;
                }
                case 5:
                {
                    printEmployeeDetail();
                    break;
                }
                case 6:
                {
                    System.exit(1);
                }
            }
        i.close();
        }
        
    }
}
