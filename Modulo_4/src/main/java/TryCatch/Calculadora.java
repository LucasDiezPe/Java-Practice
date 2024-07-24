package TryCatch;

public class Calculadora {
    public int dividir(int dividendo, int divisor) throws DivicionException{
        if(dividendo==0){
            throw new DivicionException();
        }
        return (dividendo/divisor);
    }
}
