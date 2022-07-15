#include <iostream>

using namespace std;

int T;

int main() {

	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

    cin >> T;
    for(int i = 0; i < T; i++) {
        int H, W, N;
        cin >> H >> W >> N;
        int count = 0;
        bool solved = false;
        for(int j = 1; j <= W && !solved; j++) {
            for(int k = 1; k <= H && !solved; k++) {
                count++;
                if(count == N) {
                    cout << k * 100 + j;
                    solved = true;
                }
            }
        }
    }
    
	return 0;

}