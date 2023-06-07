package atividadeExtra.exercicio3;

public class Main {
    public static void main(String[] args) {
        try {
            Conta minhaConta = new Conta();
            minhaConta.depositar(100);
            minhaConta.setLimite(100);
            minhaConta.sacar(1000);
        }catch (ContaExececao erro){
            System.out.println(erro.getMessage());
        }

    }
}
