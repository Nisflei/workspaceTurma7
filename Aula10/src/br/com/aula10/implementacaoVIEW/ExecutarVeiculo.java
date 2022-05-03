package br.com.aula10.implementacaoVIEW;

import br.com.aula10.beansMODEL.Veiculo;
import br.com.aula10.daoCONTROLLER.VeiculoDao;
import br.com.aula10.util.EntradaTela;

public class ExecutarVeiculo {
    public static void main(String[] args) {

        String opcao;
        Veiculo v = new Veiculo();
        VeiculoDao veiculoDao = new VeiculoDao();
        String placa;
        Veiculo veiculoLocalizado;

        do {
            opcao = EntradaTela.texto("==== Controle de Veiculos ==== \n\n"
                    + " Escolha a opção: \n"
                    + " <I>ncluir \n<A>lterar \n<C>onsultar \n<E>xcluir \n<S>air");

            switch (opcao.charAt(0)){
                case 'I':
                    // incluir
                    v = new Veiculo( EntradaTela.texto("Placa:"),
                                             EntradaTela.texto("Modelo"),
                                             EntradaTela.inteiro("Potenca"),
                                             EntradaTela.texto("Proprietario:"));
                    veiculoDao.incluir(v);
                    break;
                case 'A':
                    // alterar
                    placa = EntradaTela.texto("Digite a placa para alteração: ");

                    veiculoLocalizado = veiculoDao.consultaPorPlaca(placa);

                    if (veiculoLocalizado == null){
                        EntradaTela.show("Veiculo não Localizado...");
                        break;
                    }
                    veiculoLocalizado.setPotenca(EntradaTela.inteiro("Potenca"));
                    veiculoLocalizado.setProprietario(EntradaTela.texto("Proprietario:"));

                    veiculoDao.alterar(veiculoLocalizado);

                    break;
                case 'C':
                    // consultar
                    placa = EntradaTela.texto("Digite a placa: ");

                    veiculoLocalizado = veiculoDao.consultaPorPlaca(placa);

                    EntradaTela.show("==== Dados do Veiculo ==== \n"
                    + "\nPlaca: " + veiculoLocalizado.getPlaca()
                    + "\nModelo:" + veiculoLocalizado.getModelo()
                    + "\nPotencia:" + veiculoLocalizado.getPotenca()
                    + "\nProprietario:" + veiculoLocalizado.getProprietario());

                    break;
                case 'E':
                    // excluir
                    placa = EntradaTela.texto("Digite a placa: ");

                    veiculoLocalizado = veiculoDao.consultaPorPlaca(placa);

                    if (veiculoLocalizado == null){
                        EntradaTela.show("Veiculo não Localizado...");
                        break;
                    }

                    if (!veiculoDao.excluir(veiculoLocalizado)){
                        EntradaTela.show("Erro ao executar a exclusão..");
                    } else {
                        EntradaTela.show("Veiculo excluido com sucesso...");
                    }

                    break;
                case 'S':
                    // sair do programa
                    break;
                default:
                    EntradaTela.show("Voce precisa digitar as INICIAIS do menu..!!");
                    break;
            }
        } while (!opcao.equalsIgnoreCase("S"));

    }
}
