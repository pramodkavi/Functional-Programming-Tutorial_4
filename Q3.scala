object Q3{

    def toUpper(x:String):String={
        x.toUpperCase();
    }

    def toLower(x:String):String={
        x.toLowerCase();
    }

    def formatNames(name: String)(changeList:Int *)(funct: String => String): String = {

        if(!changeList.isEmpty){
            var newWord="";
            var index = 0;

            for(i <- 0 to name.length-1 ){
                    
                if(changeList.length > index && i == changeList(index)-1 ){

                    newWord += funct(name.charAt(i).toString());
                    index += 1;

                }
                else newWord += name.charAt(i).toString();
            }

            newWord
        }
        else{
            funct(name)        
        }
    }

    def main(args: Array[String]) = {

        println(formatNames("Benny")()(toUpper(_)));
        println(formatNames("Niroshan")(1,2)(toUpper(_)));
        println(formatNames("Saman")()(toLower(_)));
        println(formatNames("Kumara")(6)(toUpper(_)));

    }  
}