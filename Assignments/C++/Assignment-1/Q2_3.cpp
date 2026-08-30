#include<iostream>
using namespace std;

int main(){

    int statusReg = 10;
    int controlReg = 20;
    int dataReg = 30;

    // Pointer to constant
    const int* regPtr1 = &statusReg;
    cout<<"status Reg ->" << &statusReg << endl;
    cout<< "regPtr1 -> " << regPtr1 << endl;
    cout<< "regPtr1 -> " << *regPtr1 << endl;
    
    regPtr1 = &controlReg; // Allowed: pointer target can change
    cout<< "regPtr1 ->" << regPtr1 << endl;
    cout<< "regPtr1 ->" << *regPtr1 << endl;
    
    // *regPtr1 = 10; // Not allowed: value is const


    // Constant Pointer
    int* const regPtr2 = &controlReg;  
    cout<<"Control Reg ->" << &controlReg << endl;
    cout<< "regPtr2 -> " << regPtr2 << endl;
    cout<< "regPtr2 -> " << *regPtr2 << endl;

    *regPtr2 = 100; // Allowed: value can change
    cout<< "regPtr2 ->" << regPtr2 << endl;
    cout<< "regPtr2 ->" << *regPtr2 << endl;

    // regPtr2 = &statusReg; // Not allowed: address is const


    // Const pointer to const variable
    const int* const regPtr3 = &dataReg;
    cout<<"Control Reg ->" << &dataReg << endl;
    cout<< "regPtr2 -> " << regPtr3 << endl;
    cout<< "regPtr2 -> " << *regPtr3 << endl;

    // *regPtr3 = 110; // Not allowed: both value and address are const
    // regPtr3 = &statusReg;

    return 0;
}