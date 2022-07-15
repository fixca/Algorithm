#include <iostream>

using namespace std;

int N;

int main() {

	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

    cin >> N;
    int count = 0;
    for(int i = 0; i < N; i++) {
        int temp;
        cin >> temp;
        if(temp == 1) {
            continue;
        }
        bool found = false;
        for(int j = 2; j < temp; j++) {
            if(temp % j == 0) {
                found = true;
                break;
            }
        }
        count += found ? 0 : 1;
    }
    cout << count;
    
	return 0;

}