#include <iostream>

using namespace std;

int main() {

	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	int a;

	cin >> a;

	int temp = a;
	int count = 0;

	while (a != temp || count == 0) {
		int first = temp / 10;
		int second = temp % 10;
		int sum = first + second;
		temp = (second * 10) + (sum % 10);
		count++;
	}

	cout << count;

	return 0;

}