#include <iostream>

using namespace std;

int main() {

	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	int count;
	
	cin >> count;

	for (int i = 0; i < count; i++) {
		int a, b;
		cin >> a >> b;
		cout << a + b << '\n';
	}

	return 0;
}