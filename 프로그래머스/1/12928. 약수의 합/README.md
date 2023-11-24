# [level 1] 약수의 합 - 12928 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/12928) 

## 🫡배운 것 | 약수 구하는 알고리즘
1. N이 들어오면 N의 제곱근까지만 나눠서 0으로 떨어지는 숫자들을 구한다  
2. N을 그 숫자들로 나눈다

#### 제곱근까지만 나눠도 되는 이유 :
* 제곱근 : ```sqrt(Double or Float)```  
  import 해줘야 함!
* 수정가능한 리스트 초기화 : ```val answerList = mutableListOf<Int>()```  
  코틀린의 List는 기본적으로 immutable 이다.  
  하지만, mutable로 선언할 경우 값을 변경할 수 있다.
* 리스트에서 중복요소 제거 : ```answerList.distinct()```


### ex) N이 12일 경우

```
1. 12를 3까지 나눔
-> 1,2,3

2. 12를 1,2,3(위에서 구한 리스트)으로 나눔
-> 12,6,4

3. 합한다
-> 1,2,3,4,6,12
```

### 성능 요약

메모리: 60.5 MB, 시간: 6.17 ms

### 구분

코딩테스트 연습 > 연습문제

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2023년 11월 5일 10:3:9

### 문제 설명

<p>정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.</p>

<h5>제한 사항</h5>

<ul>
<li><code>n</code>은 0 이상 3000이하인 정수입니다.</li>
</ul>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>n</th>
<th>return</th>
</tr>
</thead>
        <tbody><tr>
<td>12</td>
<td>28</td>
</tr>
<tr>
<td>5</td>
<td>6</td>
</tr>
</tbody>
      </table>
<h6>입출력 예 설명</h6>

<p>입출력 예 #1<br>
12의 약수는 1, 2, 3, 4, 6, 12입니다. 이를 모두 더하면 28입니다.</p>

<p>입출력 예 #2<br>
5의 약수는 1, 5입니다. 이를 모두 더하면 6입니다.</p>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
