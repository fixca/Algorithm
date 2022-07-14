#include <iostream>

using namespace std;

int N;
int arr[1001];
double new_arr[1001];

void input() {
    cin >> N;
	for(int i = 0; i < N; i++) {
        cin >> arr[i];
    }
}

void solution() {
    int highest = 0;
    for(int i = 0; i < N; i++) {
        if(highest < arr[i]) {
            highest = arr[i];
        }
    }
    for(int i = 0; i < N; i++) {
        new_arr[i] = ((double)arr[i] / (double)(highest)) * 100.0;
    }
    double total = 0;
    for(int i = 0; i < N; i++) {
        total += new_arr[i];
    }
    cout << total / (double)N;
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