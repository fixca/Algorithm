#include <iostream>

using namespace std;

int main() {

	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

    int T;
    cin >> T;

    for(int i = 0; i < T; i++) {
        int R;
        cin >> R;
        string str;
        cin >> str;

        for(int j = 0; j < str.length(); j++) {
            for(int k = 0; k < R; k++) {
                cout << str.at(j);
            }
        }
        cout << '\n';
    }

	return 0;

}