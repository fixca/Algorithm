#include <iostream>

using namespace std;

int T;

int function(int a, int b) {
    if(a == 0) {
        return b;
    }
    if(b == 1) {
        return 1;
    }
    return function(a - 1, b) + function(a, b - 1);
}

int main() {

	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

    cin >> T;
    for(int i = 0; i < T; i++) {
        int a, b;
        cin >> a >> b;
        int res = function(a, b);
        cout << res << '\n';
    }

	return 0;

}