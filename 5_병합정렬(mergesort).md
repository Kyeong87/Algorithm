

## 1. 병합 정렬(merge Sort)
- 분할정복 알고리즘
- 일단 반으로 나누고 나중에 합쳐서 정렬하면 어떨까?   
  <br>
  ![스크린샷 2022-01-11 오후 5 36 54](https://user-images.githubusercontent.com/93639793/148908524-cc553d0e-3ce2-4afd-b4b0-c6592f8b39db.png)

<br>

## 2. 예제

```java
public class FirstClass {
  public static void main(String[] args) {

    int[] array = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};

    mergesort(array, 0, 10 - 1);
    for(int i =0; i<10;i++) {
      System.out.println(array[i]);
    }
  }
  // 재귀함수 이용
  public static void mergesort(int[] array, int start, int end) {
    if(start >= end) { // 원소가 1개인 경우
      return;
    }
    int key = start;  // 키는 첫번째 원소 (피벗값)
    int i = start + 1;
    int j = end;
    int temp = 0;

    while(i<=j) { // 엇갈릴때까지 반복
      while(i <= end && array[i] <= array[key]) { // 키 값보다 큰값을 만날떄까지
        i++;
      }
      while(j > start && array[j] >= array[key]) { // 키 값보다 작은값을 만날때까지
        j--;
      }
      if(i > j) { // 현재 엇갈린 상태면 키 값과 교체
        temp = array[j];
        array[j] = array[key];
        array[key] = temp;
      }else {
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
      }
    }
    // while 문이 끝나면 다시 시작
    quicksort(array, start, j-1);
    quicksort(array, j+1, end);
  }
}
```

## 3. 풀이

### 3-1. 시간 복잡도 O(N * logN)
- 분할정복

![스크린샷 2022-01-11 오후 5 40 49](https://user-images.githubusercontent.com/93639793/148909133-84281e00-1197-47f8-9743-c0f0f9c056b1.png)   

<br>

=> 항상 logN 일수 없고, 피벗값이 따라서 N^2가 될 수도 있는 퀵정렬과 달리 무조건 logN이 보장됨

<br>
<br>




- 출처 : https://www.youtube.com/watch?v=8ZiSzteFRYc&list=PLRx0vPvlEmdDHxCvAQS1_6XV4deOwfVrz&index=2
