#include<iostream>
int main(){
int a,i;
  int fac=1;
  std::cin>>a;
  for(i=1;i<=a;i++)
  {
    fac=fac*i;
  }
  std::cout<<fac;
}