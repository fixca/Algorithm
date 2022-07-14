#include <iostream>

using namespace std;

int divided_arr[10];
int count_arr[42];

void input() {
	for(int i = 0; i < 10; i++) {
        int input;
        cin >> input;
        divided_arr[i] = input % 42;
    }
}

void solution() {
    for(int i = 0; i < 10; i++) {
        // cout << divided_arr[i] << '\n';
        count_arr[divided_arr[i]]++;
    }
    int total = 0;
    for(int i = 0; i < 42; i++) {
        if(count_arr[i] != 0) {
            total++;
        }
    }
    cout << total;
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