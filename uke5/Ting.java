/**
 * Ting
 abstract class Ting implements Kjorbar {
     
     abstract public Boolean kjor();
     
    }
    
    */

class Bil implements Kjorbar{
    public Boolean kjor(){
        return true;
    }
    
}

class Sykkel implements Kjorbar{
    
    public Boolean kjor(){
        return false;
    }
}