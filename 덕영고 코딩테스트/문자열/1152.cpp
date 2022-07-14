#include <iostream>
#include <string>

using namespace std;

int main() {

	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

    string str;
    getline(cin, str);

    int blank = 0;
    int i;
    for(i = 0; i < str.length() -1; i++) {
        if(str.at(i) == 32) {
            blank += (i == 0) ? 0 : 1;
        }
    }

    cout << blank + (i == 0 ? 0 : 1);

	return 0;

}