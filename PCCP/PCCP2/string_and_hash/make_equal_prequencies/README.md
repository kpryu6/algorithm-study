# 같은 빈도수 만들기

## 설명

소문자 a, b, c, d, e로 이루어진 문자열이 주어지면 해당 문자열에서 a, b, c, d, e의 최소의 개수를 추가하여 a, b, c, d, e의 빈도수가 동일하게 되도록 해야 합니다. 동일빈도수가 되는 최소 추가 개수를 알파벳 a, b, c, d, e순으로 배열에 저장하여 반환하는 프로그램을 작성하세요.
만약 주어진 문자열이 "aaabc" 라면 빈도수는 a:3 , b:1, c:1, d:0, e:0 이고 최소 개수를 추 가하여 동일 빈도수가 되게 하려면 b를 2개, c를 2개, d를 3개, e를 3개 추가하면 모두 빈도 수가 3개로 동일해집니다.

## 입출력 예:

s
answer

"aaabc"
[0, 2, 2, 3, 3]

"aabb"
[0, 0, 2, 2, 2]

"abcde"
[0, 0, 0, 0, 0]

"abcdeabc"
[0, 0, 0, 1, 1]

"abbccddee"
[1, 0, 0, 0, 0]

## 제한사항:

? 문자열 s의 길이는 100을 넘지 않습니다.
