#include <iostream>

using namespace std;

int main() {

	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

    int N;
    cin >> N;

    string str;
    cin >> str;
    int total = 0;
    for (int j = 0; j < N; j++) {
        total += (str.at(j) - '0');
    }
    cout << total;

    return 0;

}