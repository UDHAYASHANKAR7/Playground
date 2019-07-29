#include<stdio.h>
#define PI 3.14
int main()
{
 float a,b,c;
 scanf("%f\n%f",&a,&b);
 c=(2*PI*a*(b/360));
 printf("%.2f",c);
 return 0;
 }