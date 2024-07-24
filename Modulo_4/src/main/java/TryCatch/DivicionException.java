package TryCatch;

public class DivicionException extends Exception{
    @Override
    public String getMessage(){
        return "no se puede dividir por cero";
    }
}
