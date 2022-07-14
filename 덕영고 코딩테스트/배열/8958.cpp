#include <iostream>
#include <vector>
#include <string>

using namespace std;

int N;
vector<string> vec;

void input() {
    cin >> N;
    string temp;
	for(int i = 0; i < N; i++) {
        cin >> temp;
        vec.push_back(temp);
    }
}

void solution() {
    for(int i = 0; i < N; i++) {
        int count = 0;
        int total = 0;
        string str = vec[i];
        for(int j = 0; j < str.length(); j++) {
            char a = str.at(j);
            if(a == 'O') {
                count++;
                total += count;
            }
            else {
                count = 0;
            }
        }
        cout << total << '\n';
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