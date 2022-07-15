#include <iostream>

using namespace std;

int a, b, c;

int main() {

	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

    cin >> a >> b >> c;

    // cost a + (b * sellCount)
    // sell = sellCount * c;
    // a / (c - b) <= x

    if(b >= c) {
        cout << -1;
    }
    else {
        cout << a / (c - b) + 1;
    }
    
	return 0;

}