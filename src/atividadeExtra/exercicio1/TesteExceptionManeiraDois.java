package atividadeExtra.exercicio1;


public class TesteExceptionManeiraDois {
    public static void main(String[] args) {
        System.out.println("Inicio do main");
        metodo1();
        System.out.println("Fim do main");
    }
    static void metodo1(){
        System.out.println("Inicio do metodo1");
        metodo2();
        System.out.println("fim do metodo1");


    }
    static void metodo2(){
        try {
            System.out.println("Inicio do metodo 2");
            int[] array = new int[10];
            for (int i = 0; i <= 15; i++) {
                array[i] = i;
                System.out.println(i);
            }
            System.out.println("fim do metodo2");
        }catch (ArrayIndexOutOfBoundsException erroTamArray){
            System.out.println("O tamanho de vetor não condiz com o tamanho do laço");
        }

    }
}