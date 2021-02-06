# -*- coding: utf-8 -*-
"""
Created on Fri Feb  5 23:30:27 2021

@author: wangn
"""
##KATA: https://www.codewars.com/kata/539a0e4d85e3425cb0000a88/train/python


##I had no idea you could do this

class add(int):
    def __call__(self, value):
        return add(self+value)
    

class addTwo(int):
    def __call__(self, value):
        return addTwo(self+value+2)

    
print(add(1)(3)(4))

##Adds two for each calls? - yes
print(addTwo(1)(3)(4))