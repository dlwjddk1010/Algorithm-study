#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n) {
    int answer = n/7;
    if(n%7!=0&&n!=7){
        answer+=1;
    }
    return answer;
}