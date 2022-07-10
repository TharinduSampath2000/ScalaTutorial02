def salary(workingHours:Double, otHours:Double):Double={
    return(workingHours*250 + otHours*85)
}

def tax(workingHours:Double, otHours:Double):Double={
    return(salary(workingHours, otHours)*0.12)
}

def takeHomeSalary(workingHours:Double, otHours:Double):Double={
    return(salary(workingHours, otHours) - tax(workingHours, otHours))
}

def main(args: Array[String])={
    println("Take home salary of an employee :" + takeHomeSalary(40,30))
}