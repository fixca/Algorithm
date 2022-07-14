#include <iostream>

using namespace std;

char a;

void input() {
    cin >> a;
}

void solution() {
    printf("%d", a);
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