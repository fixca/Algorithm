#include <iostream>

using namespace std;

int main() {

	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	int a;

	cin >> a;

	for (int i = a; i >= 1; i--) {
		cout << i << '\n';
	}

	return 0;
}