#include <iostream>

using namespace std;

int main() {
	int a;
	cin >> a;
	char grade = 'F';

	if (a >= 90) {
		grade = 'A';
	}
	else if (a >= 80) {
		grade = 'B';
	}
	else if (a >= 70) {
		grade = 'C';
	}
	else if (a >= 60) {
		grade = 'D';
	}

	cout << grade;

	return 0;
}