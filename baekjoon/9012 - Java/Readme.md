2021/10/11

#9012번 문제 (Java) https://www.acmicpc.net/problem/9012

간단한 스택을 이용한 문제 였다.   
괄호가 열리는 ( 문자 를 감지하면 스택에 원소를 추가하고   
괄호가 닫히는 ) 문자 를 감지하면 스택에 원소를 제거한다. 

스택에서 pop 메소드가 호출 될 때, 스택의 size가 0 이면 문제의 조건에   
맞지 않는 다는것을 깨닫고 연산을 최소화 하려고 노력했다.   
또한, 모든 반복문을 마친 뒤에 스택의 size를 검사해 size가 0이면   
이 문자열은 조건에 맞고, 아닐 경우엔 조건에 어긋난다는 규칙을   
발견 하였고, 이 규칙을 이용하여 문제를 어렵지 않게 풀 수 있었다.   

근데 이게 실버 4 문제라고요...?
