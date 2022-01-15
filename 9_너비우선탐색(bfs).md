

## 1. 너비 우선 탐색(Breadth First Search)
- 탐색을 할 때 너비를 우선으로 탐색을 수행하는 탐색 알고리즘   
- 준비물은 큐(queue)

1. 큐에서 하나의 노드를 꺼냅니다.
2. 해당 노드에 연결된 노드 중 방문하지 않은 노드를 방문하고, 차례대로 큐에 삽입합니다.

![스크린샷 2022-01-14 오후 3 35 55](https://user-images.githubusercontent.com/93639793/149462608-f8ba5ef8-7f5d-45f4-8bec-f0e6f9ff8262.png)

<br>



## 2. 깊이 우선 탐색(Depth First Search)
- 탐색을 함에 있어서 보다 깊은것을 우선적으로 하여 탐색하는 알고리즘
- 준물은 스택(stack) -> 컴퓨터는 구조적으로 항상 스택의 원리를 사용

1. 스택의 최상단 노드를 확인합니다.
2. 최상단 노드에게 방문하지 않은 인접 노드가 있으면 그 노드를 스택에 넣고 방문처리합니다. 방문하지 않은 인접 노드가 없으면 스택에서
최상단 노드를 뺍니다.

![스크린샷 2022-01-14 오후 3 31 58](https://user-images.githubusercontent.com/93639793/149462209-c722851c-ab6e-4990-9376-e938befd4d37.png)



- 출처 : https://www.youtube.com/watch?v=8ZiSzteFRYc&list=PLRx0vPvlEmdDHxCvAQS1_6XV4deOwfVrz&index=2
