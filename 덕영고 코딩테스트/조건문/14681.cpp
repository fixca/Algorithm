#include <iostream>

using namespace std;

int main() {
	int a, b;
	cin >> a >> b;

	int quadrant = 0;

	// x가 양수 일때
	if (a > 0) {
		quadrant = (b > 0) ? 1 : 4;
	}
	else {
		// x가 음수 일때
		quadrant = (b > 0) ? 2 : 3;
	}

	cout << quadrant;

	return 0;
}