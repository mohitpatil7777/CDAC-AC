#include<iostream>
using namespace std;

void resetSensorPairV1(int reading1, int reading2){
    int temp = reading1;
    reading1 = reading2;
    reading2 = temp;
}

void resetSensorPairV2(int& reading1, int& reading2){
    int temp = reading1;
    reading1 = reading2;
    reading2 = temp;
}

void resetSensorPairV3(int *reading1, int *reading2){
    int temp = *reading1;
    *reading1 = *reading2;
    *reading2 = temp;
}

int main(){

    int reading1 , reading2;
    cin>> reading1;
    cin>> reading2;

    cout<< "--- V1: Call by Value ---"<<endl;
    cout<<"Before : A= " << reading1 << " B= " << reading2 <<endl;
    resetSensorPairV1(reading1,reading2);
    cout<<"After : A= " << reading1 << " B= " << reading2 <<endl;
    // V1 doesn't swap main variables because pass by value only creates local copies inside the function.
    // Dynamic stack memory allocated for copies destroys them right after function execution finishes.
    // Meanwhile V2 (references) and V3 (pointers) directly access main memory addresses.
    // Hence changes made inside V2 and V3 persist and reflect back in main scope.
    
    cout<< "--- V1: Call by Refrence ---"<<endl;
    cout<<"Before : A= " << reading1 << " B= " << reading2 <<endl;
    resetSensorPairV2(reading1,reading2);
    cout<<"After : A= " << reading1 << " B= " << reading2 <<endl;
    
    cout<< "--- V1: Call by Address/Pointer ---"<<endl;
    cout<<"Before : A= " << reading1 << " B= " << reading2 <<endl;
    resetSensorPairV3(&reading1,&reading2);
    cout<<"After : A= " << reading1 << " B= " << reading2 <<endl;
}