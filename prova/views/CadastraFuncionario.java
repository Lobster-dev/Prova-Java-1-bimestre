package views;

import controller.FuncionarioController;
import models.Funcionarios;
import utils.Console;

public class CadastraFuncionario {
    public void renderizar() {
        Funcionarios funcionario = new Funcionarios();

        System.out.println(" - - CADASTRO DE FUNCIONARIOS - - ");
        funcionario.setNome(Console.readString("Digite o nome do funcionario : "));
        funcionario.setCpf(Console.readString("Digite o CPF do funcionario : "));

        FuncionarioController.Cadastrar(funcionario);
    }
}
