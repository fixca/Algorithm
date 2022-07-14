#include <iostream>

using namespace std;

int main() {

	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

    string str;
    cin >> str;

    int arr[26];
    fill_n(arr, 26, -1);

    for(int i = 0; i < str.length(); i++) {
        if(arr[(int)str.at(i) - 97] == -1) {
            arr[(int)str.at(i) - 97] = i;
        }
    }

    for(int i = 0; i < 26; i++) {
        cout << arr[i] << ' ';
    }

	return 0;

}