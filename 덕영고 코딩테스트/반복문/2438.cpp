#include <iostream>

using namespace std;

int main() {

	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	int a;

	cin >> a;

	for (int i = 1; i <= a; i++) {
		for (int j = 0; j < i; j++) {
			cout << '*';
		}
		cout << '\n';
	}

	return 0;
}