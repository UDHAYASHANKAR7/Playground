#include <stdio.h>
int main()
{
   int n,m,p;
  scanf("%d\n%d",&n,&m);
   if(p=pow(n,m))
   {
    printf("%d",p);
   }
     else if(p=pow(n,-m))
     {
      printf("Wrong input");
     }
       return 0;
}