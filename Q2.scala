object Q2{

    def patternMatching(n:Int)= n match{
        
        case x if(x <= 0) => "Negative/Zero ";
        case x if(x%2 == 0) => "Even number is given ";
        case _ => "Odd number is given ";
    }

    def main(args: Array[String]) = {
        print("Enter Integer number : ");
        var number = scala.io.StdIn.readInt();

        print(patternMatching(number));
    }

}  