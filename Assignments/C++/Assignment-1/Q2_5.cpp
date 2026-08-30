#include<iostream>
#include<cmath>
using namespace std;

class Drone{
    public:
    inline double distanceBetween(double x1, double y1, double x2, double y2){
        return sqrt( pow(x2-x1, 2) + pow(y2-y1, 2) );
    }

    inline double toRadians(double degrees){
        return degrees * (M_PI / 180.0);
    }

    inline double clamp1(double value, double minVal, double maxVal){
        if (value < minVal) {
            return minVal;
        }
        else if (value > maxVal) {
            return maxVal;
        }
        else {
            return value;
        }     
    }

    inline bool isInSafeZone(double x, double y, double cx, double cy, double radius){
        return (distanceBetween(x,y,cx,cy) <= radius);
    }
};

int main(){

    double home[]{0.0,0.0};
    int radius = 50;

    double waypoint1[] = {10.0, 20.0};
    double waypoint2[] = {30.0, 40.0};
    double waypoint3[] = {60.0, 10.0};

    Drone d;

    // Fixed bug: passing home coordinates (cx, cy) before waypoint (x, y)
    cout<<"Waypoint 1" << endl;
    cout<<"Distance : " << d.distanceBetween(home[0],home[1],waypoint1[0],waypoint1[1])<<endl;
    cout<<"SafeZone : " << d.isInSafeZone(waypoint1[0],waypoint1[1],home[0],home[1],radius) << endl;

    cout<<"Waypoint 2" << endl;
    cout<<"Distance : " << d.distanceBetween(home[0],home[1],waypoint2[0],waypoint2[1])<<endl;
    cout<<"SafeZone : " << d.isInSafeZone(waypoint2[0],waypoint2[1],home[0],home[1],radius) << endl;
    
    cout<<"Waypoint 3" << endl;
    cout<<"Distance : " << d.distanceBetween(home[0],home[1],waypoint3[0],waypoint3[1])<<endl;
    cout<<"SafeZone : " << d.isInSafeZone(waypoint3[0],waypoint3[1],home[0],home[1],radius) << endl;

    return 0;
}
 