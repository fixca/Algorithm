#include <iostream>

using namespace std;

int main() {
	int hour, min;

	int totalMin = 0;

	cin >> hour >> min;

	totalMin = ((hour == 0 ? 24 : hour) * 60) + min;
	totalMin -= 45;

	cout << totalMin / 60 << ' ' << totalMin % 60;

	return 0;
}