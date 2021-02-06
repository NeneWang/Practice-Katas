# -*- coding: utf-8 -*-
"""
Created on Sat Feb  6 11:26:47 2021

@author: wangn
"""


##https://www.codewars.com/kata/54d512e62a5e54c96200019e/train/python



def prime_factors(n):
    
    primes = get_primes(n)
    dict_composition = dict()
    pi = 0
    lengthPrimes = len(primes)
    while(n>1 and pi <= lengthPrimes ):
        while(n%primes[pi] == 0):
            dict_composition[primes[pi]] = dict_composition.get(primes[pi], 0) +1 
            n=(n/primes[pi])
        pi+=1
        
    text = ""
    for key in dict_composition:
        val = dict_composition[key]
        multiplier = "**{}".format(val) if val>1 else ""
        text += "({}{})".format(key, multiplier)
    return(text)
    

    
def get_primes(n):
    numbers = set(range(n, 1, -1))
    primes = []
    while numbers:
        p = numbers.pop()
        primes.append(p)
        numbers.difference_update(set(range(p*2, n+1, p)))
    return primes
##print(json.dumps(prime_factors(18)))
##print(prime_factors(18))
print(prime_factors(7775460))
        

def primeFactorsSolv(n):
    i, j, p = 2, 0, []
    while n > 1:
        while n % i == 0: n, j = n / i, j + 1
        if j > 0: p.append([i,j])
        i, j = i + 1, 0
    return ''.join('(%d' %q[0] + ('**%d' %q[1]) * (q[1] > 1) + ')' for q in p)