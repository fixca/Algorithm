#include <iostream>

using namespace std;

int N;

int fac(int n) {
    if(n == 0) {
        return 1;
    }
    return n * fac(n - 1);
}

int main() {

	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

    cin >> N;
    int res = fac(N);
    cout << res;

	return 0;

}