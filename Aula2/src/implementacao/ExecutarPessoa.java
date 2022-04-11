package implementacao;

import beans.Pessoa;

public class ExecutarPessoa {
    public static void main(String[] args) {
        System.out.println("Iniciando..!!");

        Pessoa cliente1 = new Pessoa();

        cliente1.setNome("Fausto Silva");
        cliente1.setIdade(-50);
        cliente1.setSentimento("nervoso");

        System.out.println("Dados do Cliente: ");
        System.out.println(cliente1.getNome());
        System.out.println(cliente1.getIdade());
        System.out.println(cliente1.getSentimento());

        cliente1.comer("Almoço");
        System.out.println("Sentimento atual após comer:" + cliente1.getSentimento());

        cliente1.dormir(8);
        System.out.println("Sentimento atual após dormir:" + cliente1.getSentimento());
    }
}
