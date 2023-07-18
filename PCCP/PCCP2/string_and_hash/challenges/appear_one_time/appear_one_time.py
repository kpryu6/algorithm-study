from collections import defaultdict


def solution(s):
    answer = []
    sH = defaultdict(int)

    for x in s:
        sH[x] += 1

    for key in sH:
        if sH[key] == 1:
            answer.append(key)

    # �迭�� �ִ°� str�� join
    return "".join(sorted(answer))
