#include <iostream>

using namespace std;

int main() {
	int hour, min, required;

	int totalMin = 0;

	cin >> hour >> min;
	cin >> required;

	totalMin = (hour * 60) + min;
	totalMin += required;

	if (totalMin / 60 >= 24) {
		totalMin -= 24 * 60;
	}

	cout << totalMin / 60 << ' ' << totalMin % 60;

	return 0;
}