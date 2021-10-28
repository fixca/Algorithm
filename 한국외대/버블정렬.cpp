/*
    2021/10/28 한국외대 알고리즘 멘토
    
    버블정렬(ASC)
*/
#include <stdio.h>
void swap(int* a, int* b);

int main() {
    int data[5] = {19, 80, 77, 11, 54};
    for(int i = 0; i < 5; i++) {
        for(int j = 0; j < 5 - 1; j++) {
            if(data[j] > data[j + 1]) {
                swap(&data[j], &data[j + 1]);
            }
        }
    }
    for(int i = 0; i < 5; i++) {
        printf("%d\n", data[i]);
    }
}

void swap(int* a, int* b) {
    int temp = *a;
    *a = *b;
    *b = temp;
}
