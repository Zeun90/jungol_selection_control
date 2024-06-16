# 선택 연산자

## 연습 문제

#### [1] 한 개의 정수를 입력 받은 후, 입력받은 수를 출력하고 그 수가 10보다 크면 다음 줄에 “10보다 큰 수를 입력하셨습니다.”라는 메시지를 출력하는 프로그램을 작성하시오.
입력
```
15
```
출력
```
15
10보다 큰 수를 입력하셨습니다.
```
---
#### [2] 정수 2개를 입력받아서 큰 수와 작은 수를 차례로 출력하는 프로그램을 작성하시오.
입력
```
2 9
```
출력
```
입력받은 수 중 큰 수는 9이고 작은 수는 2입니다.
```
---
#### [3] 점수를 입력받아 80점 이상이면 합격 아니면 불합격을 출력하는 프로그램을 작성하시오. 
입력
```
점수를 입력하세요. 89
```
출력
```
축하합니다. 합격입니다.
```
---
#### [4] 입력받은 점수를 "ABCDF"로 평가하는 프로그램을 작성하시오.
입력
```
점수를 입력하세요. 89
```
출력
```
B
```
---
#### [5] 주사위를 두 번 던져서 나온 수를 입력받아<br>두 수가 모두 4 이상이면 “이겼습니다.”<br>한 개만 4 이상이면 “비겼습니다.”<br>모두 4 미만이면 “졌습니다.”<br>라고 출력하는 프로그램을 작성하시오.
입력
```
주사위를 두 번 던진 결과를 입력하세요. 3 4
```
출력
```
비겼습니다.
```
---
#### [6] 정수 3개를 입력 받아 그중 가장 큰 수를 출력하는 프로그램을 작성하시오.
입력
```
세 수를 입력하세요. 1 5 4
```
출력
```
입력받은 수 중 가장 큰 수는 5입니다.
```
---
#### [7] 아래의 메뉴에서 선택한 메뉴를 알려주는 프로그램을 작성하시오.
입력
```
1. 삽입
2. 수정
3. 삭제
숫자를 선택하세요. 2
```
출력
```
수정을 선택하셨습니다.
```
---
#### [8] 입력받은 점수를 "ABCDF"로 평가하는 프로그램을 작성하시오.
입력
```
점수를 입력하세요. 92
```
출력
```
A
```
---
#### [9] 두 개의 정수를 입력받아 조건연산자를 이용하여 두 수중 큰 수를 출력하는 프로그램을 작성하시오.
입력
```
89 100
```
출력
```
100
```
<br>

---
## 자가 진단

#### [1] 정수를 입력받아 첫 줄에 입력 받은 숫자를 출력하고 둘째 줄에 음수이면 “minus” 라고 출력하는 프로그램을 작성하시오.
입력
```
-5
```
출력
```
-5
minus
```
---
#### [2] “몸무게+100-키”를 비만수치 공식이라고 하자.<br>키와 몸무게를 자연수로 입력받아 첫 번째 줄에 비만수치를 출력하고, 비만수치가 0보다 크면 다음줄에 비만("Obesity")이라는 메시지를 출력하는 프로그램을 작성하시오.
입력
```
155 60
```
출력
```
5
Obesity
```
---
#### [3] 나이를 입력받아 20살 이상이면 "adult"라고 출력하고 그렇지 않으면 몇 년후에 성인이 되는지를 "○ years later"라는 메시지를 출력하는 프로그램을 작성하시오.
입력
```
18
```
출력
```
2 years later
```
---
#### [4] 복싱체급은 몸무게가<br>50.80kg 이하를 Flyweight,<br>61.23kg 이하를 Lightweight,<br>72.57kg 이하를 Middleweight,<br>88.45kg 이하를 Cruiserweight,<br>88.45kg 초과를 Heavyweight<br>라고 하자.<br>몸무게를 입력받아 체급을 출력하는 프로그램을 작성하시오.
입력
```
87.3
```
출력
```
Cruiserweight
```
---
#### [5] 두 개의 실수를 입력받아 모두 4.0 이상이면 "A", 모두 3.0 이상이면 "B", 아니면 "C" 라고 출력하는 프로그램을 작성하시오.
입력
```
4.3 3.5
```
출력
```
B
```
---
#### [6] 남자는 'M' 여자는 'F'로 나타내기로 하고 18세 이상을 성인이라고 하자.<br>성별('M', 'F')과 나이를 입력받아 "MAN"(성인남자), "WOMAN"(성인여자), "BOY"(미성년남자), "GIRL"(미성년여자)을 구분하여 출력하는 프로그램을 작성하시오.
입력
```
F 15
```
출력
```
GIRL
```
---
#### [7] 영문 대문자를 입력받아<br>'A'이면 “Excellent”,<br>'B'이면 “Good”,<br>'C'이면 “Usually”,<br>'D'이면 “Effort”,<br>'F'이면 “Failure”,<br>그 외 문자이면 “error” 라고 출력하는 프로그램을 작성하시오.
입력
```
B
```
출력
```
Good
```
---
#### [8] 4.5 이하의 평점을 입력받아 그 값에 따라 다음과 같이 출력하는 프로그램을 작성하시오.<br>(C, C++, Java는 switch ~ case문 사용) (Python은 if ~ else사용) 단 입력는 0이상 4.5 이하이다.<br>4.0 이상 : "scholarship"<br>3.0 이상 : "next semester"<br>2.0 이상 : "seasonal semester"<br>2.0 미만 : "retake"<br>>> 실수를 정수형(int)으로 변환하여 분기한다. (예 - switch( (int)score ))
입력
```
3.5
```
출력
```
next semester
```
---
#### [9] 3개의 정수를 입력받아 조건연산자를 이용하여 입력받은 수들 중 최소값을 출력하는 프로그램을 작성하시오.
입력
```
18 -5 10
```
출력
```
-5
```
<br>

---
## 형성 평가

#### [1] 정수 두 개의 정수를 입력받아 큰 수에서 작은 수를 뺀 차를 출력하는 프로그램을 작성하시오.
입력
```
50 85
```
출력
```
35
```
---
#### [2] 정수를 입력받아 0 이면 "zero" 양수이면 "plus" 음수이면 "minus" 라고 출력하는 프로그램을 작성하시오.
입력
```
0
```
출력
```
zero
```
---
#### [3] 년도를 입력받아 윤년(leap year)인지 평년(common year)인지 판단하는 프로그램을 작성하시오.
입력
```
2008
```
출력
```
leap year
```
---
#### [4] 1번은 개, 2번은 고양이, 3번은 병아리로 정하고 번호를 입력하면 번호에 해당하는 동물을 영어로 출력하는 프로그램을 작성하시오. 해당 번호가 없으면 "I don't know."라고 출력한다.<br>개-dog<br>고양이-cat<br>병아리-chick
입력
```
Number? 2
```
출력
```
cat
```