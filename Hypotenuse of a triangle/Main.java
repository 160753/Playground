#include<stdio.h>
int main()
{
  double a,b,h;
  scanf("%lf%lf",&a,&b);
   h=sqrt((a*a)+(b*b));
  printf("%.2f",h);
  return 0;
}