#include <iostream>
using namespace std;

int main() {
    int N;
    cout << "Enter number of readings: ";
    cin >> N;

    double arr[100];
    cout << "Enter " << N << " temperature values: ";
    for (int i = 0; i < N; i++) {
        cin >> arr[i];
    }

    int skipped = 0;
    int validCount = 0;

    cout << "Valid readings : ";
    for (int i = 0; i < N; i++) {
        if (arr[i] < 0) {
            skipped++;
            continue; // skip negative error readings
        }
        cout << arr[i] << " ";
        validCount++;
    }
    cout << endl;

    // Find first critical index
    int criticalIndex = -1;
    double criticalVal = 0;
    for (int i = 0; i < N; i++) {
        if (arr[i] >= 45) {
            criticalIndex = i;
            criticalVal = arr[i];
            break; 
        }
    }

    // Min, max, sum in one loop pass
    double minVal = 999999, maxVal = -999999, sum = 0;
    int normal = 0, warning = 0, critical = 0, shutdown = 0;

    for (int i = 0; i < N; i++) {
        if (arr[i] < 0) continue; // skip error values for stats

        if (arr[i] < minVal) minVal = arr[i];
        if (arr[i] > maxVal) maxVal = arr[i];
        sum += arr[i];

        // Counting categories
        if (arr[i] <= 29) normal++;
        else if (arr[i] <= 44) warning++;
        else if (arr[i] <= 59) critical++;
        else shutdown++;
    }

    cout << "Skipped (errors): " << skipped << endl;
    if (criticalIndex != -1) {
        cout << "First CRITICAL  : Index " << criticalIndex << " -> " << criticalVal << "°C" << endl;
    }
    
    cout << "Min: " << minVal << "°C Max: " << maxVal << "°C Avg: " << (sum / validCount) << "°C" << endl;
    cout << "Normal: " << normal << " Warning: " << warning << " Critical: " << critical << " Shutdown: " << shutdown << endl;

    return 0;
}