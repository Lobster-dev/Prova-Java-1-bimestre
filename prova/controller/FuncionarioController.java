
package controller;

import java.util.ArrayList;
import models.Funcionarios;

public class FuncionarioController{
    private static ArrayList <Funcionarios> listaFuncionarios = new ArrayList<Funcionarios>();

    public static void Cadastrar(Funcionarios funcionario){
        listaFuncionarios.add(funcionario);
    }
    public static ArrayList<Funcionarios> listarFuncionarios(){
        return listaFuncionarios;
    }

    public Funcionarios buscarPorCpf(String cpf){
        for (Funcionarios funcionarioCadastrado : listaFuncionarios) {
            if(funcionarioCadastrado.getCpf().equals(cpf)){
                return funcionarioCadastrado;
            }
        }
        return null;
    }
}
