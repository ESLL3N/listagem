public class Listagem {

    public static void main(String [] args) {
        int numero = 5;
        int inicio = 10;
        int tamanho = 6;
    
        for(int i = inicio;i < (inicio + tamanho);i++){
            System.out.println(numero + " * " + i + " = " + (numero * i));
        }
    }
}