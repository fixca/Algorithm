#include <iostream>

using namespace std;

int main() {

	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

    string str;
    cin >> str;

    int arr[26] = {0, };
    for(int i = 0; i < str.length(); i++) {
        int c = (int)str.at(i);
        if(c > 96) {
            c -= 32; // 대문자화
        }
        arr[c - 65]++;
    }
    bool duplicate;
    int highest = 0;
    int index = 0;
    
    for(int i = 0; i < 26; i++) {
        if(highest == arr[i]) {
            duplicate = true;
            continue;
        }
        if(highest < arr[i]) {
            highest = arr[i];
            index = i;
            duplicate = false;
        }
    }

    printf("%c", duplicate ? '?' : index + 65);

	return 0;

}