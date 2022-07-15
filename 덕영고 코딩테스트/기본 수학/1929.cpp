#include <iostream>
#include <cmath>

using namespace std;

int M, N;
bool arr[1000001];

int main() {

	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

    cin >> M >> N;

    for(int i = 2; i <= N; i++) {
        arr[i] = false;
    }

    for(int i = 2; i <= sqrt(N); i++) {
        if(arr[i]) {
            continue;
        }
        for(int j = i * i; j <= N; j += i) {
            arr[j] = true;
        }
    }

    for(int i = 2; i <= N; i++) {
        if(!arr[i]) {
            cout << i << '\n';
        }
    }

	return 0;

}