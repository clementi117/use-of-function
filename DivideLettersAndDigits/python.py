import random
import string

print('{0:25s} {1:13s} {2:13s} {3:10s}'.format('Given String', "Uppercases", "Lowercases", "Digits"))

for i in range(0, 5):
    random_string = ""
    
    for j in range(0, 20):
        random_string += random.choice(string.ascii_letters + string.digits)

    upperCases = ''.join([a for a in random_string if a.isupper()])
    lowerCases = ''.join([c for c in random_string if c.islower()])
    digits = ''.join([c for c in random_string if c.isdigit()])

    print('{0:25s} {1:13s} {2:13s} {3:10s}'.format(random_string, upperCases, lowerCases, digits))
