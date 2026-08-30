#include <iostream>
using namespace std;

int main() {
    double grid[3][3];

    cout << "Enter 9 readings for 3x3 grid:" << endl;
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            cin >> grid[i][j];
        }
    }

    cout << "\n\tRoom1\tRoom2\tRoom3" << endl; // \t is for tab space
    double hottestTemp = -999;
    int hottestFloor = 0, hottestRoom = 0;

    double maxFloorAvg = -999;
    int maxAvgFloorIndex = 0;
    int warningCount = 0;

    for (int i = 0; i < 3; i++) {
        cout << "Floor " << (i + 1) << " : ";
        double floorSum = 0;

        for (int j = 0; j < 3; j++) {
            cout << grid[i][j] << "\t";
            floorSum += grid[i][j];

            // Finding individual hottest room
            if (grid[i][j] > hottestTemp) {
                hottestTemp = grid[i][j];
                hottestFloor = i + 1;
                hottestRoom = j + 1;
            }

            // Count rooms at or above 30
            if (grid[i][j] >= 30) {
                warningCount++;
            }
        }
        cout << endl;

        // Floor average check
        double floorAvg = floorSum / 3.0;
        if (floorAvg > maxFloorAvg) {
            maxFloorAvg = floorAvg;
            maxAvgFloorIndex = i + 1;
        }
    }

    cout << "\nHottest Room            : Floor " << hottestFloor << ", Room " << hottestRoom << " -> " << hottestTemp << "°C" << endl;
    cout << "Hottest Floor             : Floor " << maxAvgFloorIndex << " (avg " << maxFloorAvg << "°C)" << endl;
    cout << "Rooms at WARNING or above : " << warningCount << endl;

    return 0;
}