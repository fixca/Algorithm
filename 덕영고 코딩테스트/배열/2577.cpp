#include <iostream>
#include <string>

using namespace std;

int arr[3];
int count_arr[10];

void input() {
	for(int i = 0; i < 3; i++) {
        cin >> arr[i];
    }
}

void solution() {
    int total = 1;
    for(int i = 0; i < 3; i++) {
        total *= arr[i];
    }

    string s = to_string(total);

    for(int i = 0; i < s.size(); i++) {
        int index = s.at(i) - '0';
        count_arr[index]++;
    }

    for(int i = 0; i < 10; i++) {
        cout << count_arr[i] << '\n';
    }
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