/*
NAME:- Abhishikth Boda
Roll Number:- S20210010044
Assignment Number:- 1
Date:- 11-08-2022 
*/


#include <stdio.h>
#include <string.h>
#include <stdlib.h>

struct employee
{
    char name[20];
    char employeeID[50];
    float basic_salary;
    int a_percent;
};
struct employee *e;
int a;
void createEmployee()
{
    printf("Enter number of employees\n");
    scanf("%d", &a);
    e = (struct employee *)malloc(a * sizeof(struct employee));
    for (int i = 1; i <= a; i++)
    {
        printf("Enter details of %d\n", i);
        printf("Enter employee's name:\n");
        scanf(" %s", (e + i - 1)->name);
        printf("Enter employee's emploeeID: \n");
        scanf(" %s", (e + i - 1)->employeeID);
        printf("Enter employee's basic salary: \n");
        scanf("%f", &((e + i - 1)->basic_salary));
        printf("Enter employee's allowance percentage: \n");
        scanf("%d", &((e + i - 1)->a_percent));
    }
}
char empID[50];
int searchEmployeebyID()
{
    printf("Enter the ID of employee whom you want to search\n");
    scanf("%s", empID);
    for (int i = 1; i <= a; i++)
    {
        if (!(strcmp((e + i - 1)->employeeID, empID)))
        {
            printf("The name of employee with employee ID %S is %s\n", empID, (e + i - 1)->name);
            printf("The ID of employee with employee ID %S is %s\n", empID, (e + i - 1)->employeeID);
            printf("The basic salary of employee with employee ID %S is %f\n", empID, ((e + i - 1)->basic_salary));
            printf("The allowance percentage of employee with employee ID %S is %d\n", empID, ((e + i - 1)->a_percent));
        }
    }
}

int CalculateSalary()
{
    int salary;
    for (int i = 1; i <= a; i++)
    {
        if (!(strcmp((e + i - 1)->employeeID, empID)))
        {
            salary = (e + i - 1)->basic_salary + ((e + i - 1)->basic_salary * (e + i - 1)->a_percent);
            printf("Salary of the selected employee is %d\n", salary);
            printf("\n");
        }
    }
}

int listEmployees()
{
    for (int i = 1; i <= a; i++)
    {
        printf("Details of employee %d : \n", i);
        printf("Employee name is %s\n", (e + i - 1)->name);
        printf("Employee ID is %s\n", (e + i - 1)->employeeID);
        printf("Employee basic salary is %f\n", ((e + i - 1)->basic_salary));
        printf("Employee allowance percentage is %d\n", ((e + i - 1)->a_percent));
        printf("\n");
    }
}

int main()
{
    createEmployee();
    printf("\n");
    searchEmployeebyID();
    printf("\n");
    CalculateSalary();
    printf("\n");
    listEmployees();
    printf("\n");
    return 0;
}