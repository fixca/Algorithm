#include <iostream>

using namespace std;

int main() {
	int a, b;
	cin >> a >> b;

	int first = a * (b % 10);
	int second = a * ((b / 10) % 10);
	int third = a * (b / 100);
	int total = first + (second * 10) + (third * 100);
	cout << first << '\n';
	cout << second << '\n';
	cout << third << '\n';
	cout << total << '\n';
	return 0;
}