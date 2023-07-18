def solution(moves):
    r = c = 0
    dr = [-1, 0, 1, 0]
    dc = [0, 1, 0, -1]
    d = 1
    for command in moves:
        if command == 'G':
            r = r + dr[d]
            c = c + dc[d]
            # ������ �����ϸ鼭 �����ϰ� ������
            # r = r - dr[d]
            # c = c - dc[d]
        elif command == 'R':
            # �ð� �������� 90�� ȸ��
            d = (d + 1) % 4
        elif command == 'L':
            # �ð� �������� 270�� ȸ��
            d = (d + 3) % 4


    return [r, c]


print(solution('GGGRGGG'))
print(solution('GGRGGG'))
print(solution('GGGGGGGRGGGRGGRGGGLGGG'))
print(solution('GGLLLGLGGG'))
