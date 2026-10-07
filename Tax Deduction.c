// Tax dedution

#include <stdio.h>

int main()
{
    float Tax, New_Salary;
    int Current_Salary;

    printf("Please Enter Your Salary: ");
    scanf("%i", &Current_Salary);

    if (Current_Salary > 2000)

        Tax = Current_Salary * 0.08;

    else if (Current_Salary <= 2000 && Current_Salary >= 1000)

        Tax = Current_Salary * 0.03;

    else

        Tax = 0;

        New_Salary = Current_Salary - Tax;

        printf ("Salary After Deduction is %.2f\n", New_Salary);

    return 0;
}
