#include <iostream>

using namespace std;

int N;
int count;

int fibo(int n) {
    if(n == 0) {
        return 0;
    }
    if(n == 1) {
        return 1;
    }
    return fibo(n - 1) + fibo(n - 2);
}

int main() {

	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

    cin >> N;
    int res = fibo(N);
    cout << res;

	return 0;

}