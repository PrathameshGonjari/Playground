#include <iostream>
int main() 
{
  int a,b,c;
  std::cin>>a;
  while(a>0)
  {
    b=a%10;
    std::cout<<b;
    a=a/10;
  }
}
    