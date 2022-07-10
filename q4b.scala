def attendance(ticketPrice:Int):Int={
    return (120 + (15 - ticketPrice)/5 * 20);
}

def cost(ticketPrice:Int):Int={
    return (500 + attendance(ticketPrice)*3);
}

def profit(ticketPrice:Int):Int={
    return (attendance(ticketPrice)*ticketPrice - cost(ticketPrice));
}

def bestTicketPrice(ticketPrice:Int):Int={
    var bestPrice :Int = 15;
    var firstPrice :Int = ticketPrice;

    while(attendance(firstPrice)>=0){
        if(profit(firstPrice) > profit(bestPrice)){
            bestPrice = firstPrice;
        }
        firstPrice = firstPrice + 5;
    }

    firstPrice = ticketPrice;
    while(firstPrice>=0){
        if(profit(firstPrice) > profit(bestPrice)){
            bestPrice = firstPrice;
        }
        firstPrice = firstPrice - 5;
    }

    return bestPrice;
}

def main(args: Array[String])={
    println("Best Ticket Price :" + bestTicketPrice(15));
}

