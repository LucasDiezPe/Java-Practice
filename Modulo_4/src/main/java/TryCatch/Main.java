package TryCatch;

public class Main {
    public static void main(String[] args){
        /*try{
            int a = 1020;
            int b = 10;
            System.out.println("el resultado de la divsión entre a="+a+" y b="+b+" es:"+a/b);
        }catch (Exception uno){
            uno.printStackTrace();
            System.out.println("-----------------------------------");
            System.out.println("Error Detectado Revise Su Código");
            System.out.println("-----------------------------------");
        }*/
        //---------Manejo de errores orginales por el programdor--------------
        int a = 0;
        int b = 70;
        Calculadora CalculadoraDiv = new Calculadora();
        try {
            CalculadoraDiv.dividir(a,b);
        } catch (DivicionException e) {
             e.printStackTrace();
        }
    }

}
