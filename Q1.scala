object Q1 {

    def interest(deposite:Double):Double = 
        deposite match {
            case x if(deposite <= 20000) => deposite * 0.02;
            case x if(deposite > 20000 && deposite <= 200000) => deposite * 0.04;
            case x if(deposite > 200000 && deposite <= 2000000) => deposite * 0.035;
            case x if(deposite > 2000000) => deposite * 0.065;
        
    }

    def main(args: Array[String]) = {
        println(interest(250000));
    }  

}