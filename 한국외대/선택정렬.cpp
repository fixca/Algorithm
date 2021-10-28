/*
    2021/10/28 한국외대 알고리즘 멘토

    선택정렬(DESC)
*/
#include <stdio.h>
void swap(int* a, int* b);

int main() {
    int data[8] = {35, 80, 21, 54, 11, 45, 92, 39};
    int *max;
    for(int i = 0; i < 8; i++) {
        max = &data[i];
        for(int j = i + 1; j < 8; j++) {
            if(data[j] > *max) {
                swap(&data[j], max);
            }
        }
    }
    for(int i = 0; i < 8; i++) {
        printf("%d\n", data[i]);
    }
}

void swap(int* a, int* b) {
    int temp = *a;
    *a = *b;
    *b = temp;
}
