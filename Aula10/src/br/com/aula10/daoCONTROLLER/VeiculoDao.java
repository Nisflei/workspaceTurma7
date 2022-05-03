package br.com.aula10.daoCONTROLLER;

import br.com.aula10.beansMODEL.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class VeiculoDao {

    // Usar collections para "simular" um BD

    List<Veiculo> bancoDeVeiculo = new ArrayList<Veiculo>();

    //

    public VeiculoDao(){}

    public boolean conectarDB(String URLConexao){
        // Neste ponto é elaborado o codigo para estabelecer uma conexão com o BD.
        return true;
    }

    public boolean incluir(Veiculo v){
        // salvar no BD
        if (!conectarDB("url Teste MySQL")){
            System.out.println("Erro de conexão BD");
            return false;
        }
        bancoDeVeiculo.add(v);
        System.out.println("--log: Salvo BD");
        return true;
    }

    public Veiculo consultaPorPlaca(String placa) {
        // consulta no BD
        if (!conectarDB("url Teste MySQL")){
            System.out.println("Erro de conexão BD");
            //return false;
        }

        for (Veiculo item : bancoDeVeiculo){
            if (item.getPlaca().equalsIgnoreCase(placa)){
                return item;
            }
        }
        return null;

    }

    public boolean alterar(Veiculo veiculoLocalizado) {
        // alterar no BD
        if (!conectarDB("url Teste MySQL")){
            System.out.println("Erro de conexão BD");
            //return false;
        }

        for (Veiculo item : bancoDeVeiculo){
            if (item.getPlaca().equalsIgnoreCase(veiculoLocalizado.getPlaca())){
                bancoDeVeiculo.remove(item);
                bancoDeVeiculo.add(veiculoLocalizado);
                return true;
            }
        }
        return false;
    }

    public boolean excluir(Veiculo veiculoLocalizado) {
        // excluir no BD
        if (!conectarDB("url Teste MySQL")){
            System.out.println("Erro de conexão BD");
            //return false;
        }

        return bancoDeVeiculo.remove(veiculoLocalizado);
    }
}
