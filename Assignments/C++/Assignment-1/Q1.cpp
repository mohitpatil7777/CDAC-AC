#include <iostream>
using namespace std;


int main(){
    double range;
    cout<<"Enter temp range :";
    cin>>range;

    string StatusLabel;

    int statusCode;
    if(range < 0){
        statusCode = -1;
        StatusLabel = "SENSOR_ERROR";
    }
    else if(range>=0 && range<=29){
        statusCode = 0;
        StatusLabel = "NORMAL";
    }
    else if(range>=30 && range<=44){
        statusCode = 1;
        StatusLabel = "WARNING";
    }
    else if(range>=45 && range<=59){
        statusCode = 2;
        StatusLabel = "CRITICAL";
    }
    else{
        statusCode = 3;
        StatusLabel = "SHUTDOWN";
    }
    
    string action;
    switch (statusCode)
    {
    case -1:
    action= "Sensor fault - check wiring"; 
    break;
    case 0: 
    action= "No action required"; 
    break;
    case 1:  
    action= "Alert sent to supervisor"; 
    break;
    case 2:  
    action= "Cooling system triggered"; 
    break;
    case 3:  
    action= "Emergency shutdown initiated"; 
    break;
    default:
    action= "Invalid input";
    } 

    double fahrenheit = (range * 9 / 5) + 32;

    
    cout << "Temperature : " << range << "°C / " << fahrenheit << "°F" << endl;
    cout << "Status      : " << StatusLabel << endl;
    cout << "Action      : " << action << endl;

    cout << (range >= 25 ? "Reading     : Above Average" : "Reading    : Below Average");
    
        
}

