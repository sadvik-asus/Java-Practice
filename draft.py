def check(expression):
    s = []
    mapping = {')' : '(', '}' : '{', ']' : '['}
    for ch in expression:
        if ch in mapping.values():
            s.append(ch)
        elif ch in mapping:
            if s:
                if s.pop() != mapping[ch]:
                    return "not balanced"
            else:
                return "not balanced"
            if len(s) ==0:
                return "Balanced"
            else:
                return "Not balanced"
            

test = check((2,3,4))
print(test)