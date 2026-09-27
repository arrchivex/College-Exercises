 // Created this GPA calculator as part of my Programming in C during my freshman year Fall 2026

#include <stdio.h>

int main()

{
    float Credit_Points1, Credit_Value1;
    float Credit_Points2, Credit_Value2;
    float Credit_Points3, Credit_Value3;
    float Credit_Points4, Credit_Value4;
    float Credit_Points5, Credit_Value5;
    float sum, avg;

    printf("Programming in C\n");
    printf("Enter Credit Points: ");
    scanf("%f", &Credit_Points1);
    printf("Enter Credit Value: ");
    scanf("%f", &Credit_Value1);

    printf("Object Oriented Programming 1\n");
    printf("Enter Credit Points: ");
    scanf("%f", &Credit_Points2);
    printf("Enter Credit Value: ");
    scanf("%f", &Credit_Value2);

    printf("English Composition 2\n");
    printf("Enter Credit Points: ");
    scanf("%f", &Credit_Points3);
    printf("Enter Credit Value: ");
    scanf("%f", &Credit_Value3);

    printf("Web Application Techniques\n");
    printf("Enter Credit Points: ");
    scanf("%f", &Credit_Points4);
    printf("Enter Credit Value: ");
    scanf("%f", &Credit_Value4);

    printf("Analytical Geometry and Calculus\n");
    printf("Enter Credit Points: ");
    scanf("%f", &Credit_Points5);
    printf("Enter Credit Value: ");
    scanf("%f", &Credit_Value5);

    sum = (Credit_Value1 * Credit_Points1) + (Credit_Value2 * Credit_Points2) + (Credit_Value3 * Credit_Points3) + (Credit_Value4 * Credit_Points4) + (Credit_Value5 * Credit_Points5);
    avg = sum / (Credit_Value1 + Credit_Value2 + Credit_Value3 + Credit_Value4 + Credit_Value5);

    printf ("Your Semester GPA is: %.2f", avg);


    return 0;
