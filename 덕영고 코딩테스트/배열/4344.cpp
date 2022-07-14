#include <iostream>
#include <vector>
#include <string>

using namespace std;

int C;
vector<vector<int>> vec;

void input() {
    cin >> C;
    for(int i = 0; i < C; i++) {
        int N;
        cin >> N;
        for(int j = 0; j < N; j++) {
            int input;
            cin >> input;
            vec[i].push_back(input);
        }
    }
}

void solution() {
    for(int i = 0; i < C; i++) {
        double percent = 0;
        double avr = 0;
        double total = 0;
        int count = vec[i].size();
        int overAvrCount = 0;
        for(int j = 0; j < count; j++) {
            total += (double)vec[i][j];
        }
        avr = total / (double) count;
        for(int j = 0; j < count; j++) {
            if(avr < (double) vec[i][j]) {
                overAvrCount++;
            }
        }
        percent = ((double) overAvrCount / (double) count) * 100.0;
        printf("%.3lf\n", percent);
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