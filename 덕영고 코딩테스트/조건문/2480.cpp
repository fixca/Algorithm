#include <iostream>

using namespace std;

int main() {
	int a, b, c;
	cin >> a >> b >> c;

	int prize = 0;

	if (a == b && b == c) {
		prize = 10000 + (a * 1000);
	}
	else if (a != b && b != c && c != a) {
		int highest = 0;
		if (highest < a) {
			highest = a;
		}
		if (highest < b) {
			highest = b;
		}
		if (highest < c) {
			highest = c;
		}
		prize = highest * 100;
	}
	else if (a == b && b != c) {
		prize = 1000 + (a * 100);
	}
	else if (a != b && b == c) {
		prize = 1000 + (b * 100);
	}
	else if (a == c && c != b) {
		prize = 1000 + (a * 100);
	}

	cout << prize;
	return 0;
}