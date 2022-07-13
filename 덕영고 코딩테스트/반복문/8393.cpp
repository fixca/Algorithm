#include <iostream>

using namespace std;

int main() {
	int a;
	
	cin >> a;

	int total = 0;

	for (int i = 1; i <= a; i++) {
		total += i;
	}

	cout << total;

	return 0;
}