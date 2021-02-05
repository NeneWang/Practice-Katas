def get_pins(observed):
    lengthObserved = len(observed)
    pinsLists = []
    solutions = []
    for i in range(lengthObserved):
        digit = int(observed[i])
        pinsLists.append(getSingleDigitSolutions(digit))
    '''
    for indexListA in range(len(pinsLists[0])):
        for indexListB in range(len(pinsLists[1])):
            solutions.append(pinsLists[0][indexListA-1]+pinsLists[1][indexListA-1])
            
    '''
    addElementRecursive(solutions, pinsLists, "", 0)
            
    return solutions

def addElementRecursive(solutions, pinsList, wordSums, indexA):
    if(indexA>=len(pinsList)):
            ##Add to the solutions and return
            solutions.append(wordSums)
            return
    for element in pinsList[indexA]:
        hold = wordSums+str(element)
        
        ##else recursive
        addElementRecursive(solutions, pinsList, hold, indexA+1)
    
def getSingleDigitSolutions(observed):
    solutions = []
    appendIfPosible(solutions, observed, 3)
    appendIfPosible(solutions, observed, 1)
    appendIfPosible(solutions, observed, 0)
    appendIfPosible(solutions, observed, -1)
    appendIfPosible(solutions, observed, -3)
    return solutions
    
def appendIfPosible(solutions, observed, target):
    result = getDiff(observed, target)
    if( result != -99):
        solutions.append(result)
    return solutions
    
def getDiff(value, add):
    result = value+add;
    if(value == 0):
        if(result==1):
                result = 8
                return result
        if((result==0)):  
            
            return result
        return -99
    if(result == 10 or result>11 or result <1 or ((value==3 or value ==6) and add==1) or ((value==7 or value ==4)and add==-1)):
        return -99
    
    if (result == 11):
        result = 0
    return str(result)

print(get_pins("0"))