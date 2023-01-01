#include <iostream>
 
int main () 
{
    for(int i=0;i<=100;i++){
        if(i%3==0 && i%5==0){
            std::cout << i << " - fizzbuzz \n";
        }else if(i%3==0){
            std::cout << i << " - fizz \n";
        }else if(i%5==0){
            std::cout << i << " - buzz \n";
        }

    }
    
    return 0;
}