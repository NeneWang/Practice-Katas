# -*- coding: utf-8 -*-
"""
Created on Sat Feb  6 11:26:47 2021

@author: wangn
"""

import math, sympy

##https://www.codewars.com/kata/54d512e62a5e54c96200019e/train/python



def prime_factors(n):
    
    primes = primes = list(sympy.primerange(1, n))
    dict_composition = dict()
    pi = 0
    while(n>1):
        while(n%primes[pi] == 0):
            dict_composition[primes[pi]] = dict_composition.get(primes[pi], 0) +1 
            n=math.floor(n/primes[pi])
        pi+=1
        
    text = ""
    for key in dict_composition:
        val = dict_composition[key]
        multiplier = "**{}".format(val) if val>1 else ""
        text += "({}{})".format(key, multiplier)
    return(text)
    

    
def get_primes_under(max):
    primeList = []
    thisNCount = 0
    
    for n in range(2, max):
        thisNCount = 0
        
        for divider in range(1,n):
            if( (n%(divider)) ==0):
                thisNCount+=1
        
        if thisNCount<=2:
            primeList.append(n)
        
    return primeList


##print(json.dumps(prime_factors(18)))
##print(prime_factors(18))
print(prime_factors(7775460))
        