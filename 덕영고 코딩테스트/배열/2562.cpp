#include <iostream>

using namespace std;

int arr[9];

void input() {
	for (int i = 0; i < 9; i++) {
		cin >> arr[i];
	}
}

void solution() {
	int highest = arr[0];
	int index = 0;
	for (int i = 0; i < 9; i++) {
		if (highest < arr[i]) {
			highest = arr[i];
			index = i;
		}
	}
	cout << highest << '\n' << index + 1;
}

void solve() {
	input();
	solution();
}

int main() {

	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	
	solve();
	return 0;

}