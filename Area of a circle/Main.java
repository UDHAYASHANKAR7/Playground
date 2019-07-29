#include<stdio.h>
#define PI 3.14
int main()
{
  float a,d,r;
  scanf("%f",&d);
  r=d/2;
  a=(PI*r*r);
  printf("%.2f",a);
  return 0;
}