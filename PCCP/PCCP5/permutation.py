def DFS(L, n, m, p, ch):
    # Level�� �ε���
    # �ߺ��ϸ� �ȵǴϱ� ch�� ����üũ
    if L == m:
        for x in p:
            print(x, end =' ')
        print()
    else:
        for i in range(1, n+1):
            if ch[i] == 0:
                p.append(i)
                DFS(L+1, n, m, p,ch)
                # ��Ʈ��ŷ
                ch[i] = 0
                p.pop()




def solution(n,m):
    ch = [0] * (n+1)
    DFS(0, n, m, [], ch)

solution(5,4)