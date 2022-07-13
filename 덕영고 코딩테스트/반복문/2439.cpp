#include <iostream>

using namespace std;

int main() {

	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	int a;

	cin >> a;

	for (int i = 0; i < a; i++) {
		for (int j = 0; j < (a - 1) - i; j++) {
			cout << ' ';
		}
		for (int j = 0; j < i + 1; j++) {
			cout << '*';
		}
		cout << '\n';
	}

	return 0;
}