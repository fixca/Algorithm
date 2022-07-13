#include <iostream>

using namespace std;

int main() {
	int hour, min, second, required;

	int totalSec = 0;

	cin >> hour >> min >> second;
	cin >> required;

	totalSec = (hour * 3600) + (min * 60) + second;
	totalSec += required;

	//cout << totalSec << '\n';

	hour = totalSec / 3600;
	totalSec -= hour * 3600;

	if (hour >= 24) {
		hour -= (24 * (hour / 24));
	}

	//cout << hour << " | " << totalSec << '\n';

	min = totalSec / 60;
	totalSec -= min * 60;
	if (min >= 60) {
		hour += min / 60;
		min -= (60 * (min / 60));
	}

	//cout << min << " | " << totalSec << '\n';

	cout << hour << ' ' << min << ' ' << totalSec << '\n';

	return 0;
}