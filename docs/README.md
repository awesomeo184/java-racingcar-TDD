# 자동차 경주 게임 - TDD
테스트 주도 개발로 자바 프로그램을 작성하는 연습을 한다.

## 비기능적 요구사항

1. TDD 생명 주기에 따라 코드를 작성한다.
![TDD Life Cycle](https://cio-wiki.org/wiki/images/thumb/1/1f/TDD2.png/300px-TDD2.png)

2. TDD 원칙을 준수한다.
    1. 실패하는 단위 테스트를 작성할 때까지 실제 코드를 작성하지 않는다.
    2. 컴파일은 실패하지 않으면서 실행이 실패하는 정도로만 단위 테스트를 작성한다.
    3. 현재 실패하는 테스트를 통과할 정도로만 실제 코드를 작성한다.

3. [객체 지향 훈련 지침](https://developerfarm.wordpress.com/2012/02/03/object_calisthenics_summary/) 을 지킨다.

4. 함수(또는 메소드)의 길이가 15라인을 넘어가지 않도록 구현한다.
   - 함수(또는 메소드)가 한 가지 일만 잘 하도록 구현한다.


## 기능적 요구사항

* 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
* 각 자동차에 이름을 부여할 수 있다. 
* 자동차 이름은 쉼표(,)를 기준으로 구분하며 이름은 5자 이하만 가능하다.
* 사용자는 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
* 매 이동마다 자동차의 이름과 함께 진행 상황을 출력한다.
* 전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4 이상일 경우 전진하고, 3 이하의 값이면 멈춘다.
* 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한 명 이상일 수 있다.
* 예외 상황 시 에러 문구를 출력해야 한다. 단, 에러 문구는 `[ERROR]` 로 시작해야 한다.

## 구현 기능 목록

v 자동차 이름을 입력받는다.
v 시도 횟수를 입력받는다.
v 각각의 이름에 맞게 자동차를 생성한다.
v 0에서 9 사이의 난수를 생성한다.
v 조건에 맞춰 이동한다.
* 각 차수별 진행 상황을 출력한다.
* 최종 우승자를 출력한다.

## 예외 사항

* 이름이 5자를 초과하는 경우
* 이동 횟수가 자연수가 아닌 경우

## ✍🏻 입출력 요구사항
### ⌨️ 입력
- 경주 할 자동차 이름(이름은 쉼표(,) 기준으로 구분)
```
pobi,woni,jun
```
- 시도할 회수
```
5
```

### 🖥 출력
- 각 차수별 실행 결과
```
pobi : --
woni : ----
jun : ---
```
- 단독 우승자 안내 문구
```
최종 우승자: pobi
```
- 공동 우승자 안내 문구
```
최종 우승자: pobi, jun
```
- 예외 상황 시 에러 문구를 출력해야 한다. 단, 에러 문구는 [ERROR] 로 시작해야 한다.
```
[ERROR] 시도 횟수는 숫자여야 한다.
```

### 💻 프로그래밍 실행 결과 예시
```
경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)
pobi,woni,jun
시도할 회수는 몇회인가요?
5

실행 결과
pobi : -
woni : 
jun : -

pobi : --
woni : -
jun : --

pobi : ---
woni : --
jun : ---

pobi : ----
woni : ---
jun : ----

pobi : -----
woni : ----
jun : -----

최종 우승자: pobi, jun
```

<br>