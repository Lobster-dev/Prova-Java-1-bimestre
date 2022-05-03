package views;

import controller.FolhaPagamentoController;
import controller.FuncionarioController;
import models.FolhaPagamento;
import models.Funcionarios;
import utils.Console;

public class CadastrarFolhaPagamento {

    public void renderizar() {
        FolhaPagamento folhaPagamento = new FolhaPagamento();
        FuncionarioController funcionarioController = new FuncionarioController();
        String cpf;

        System.out.println(" - - CADASTRO DE FUNCIONARIOS - - ");
        cpf = Console.readString("Digite o CPF do funcionario : ");

        funcionarioController.buscarPorCpf(cpf);
        Funcionarios funcionario = funcionarioController.buscarPorCpf(cpf);
        if (funcionario != null) {
            folhaPagamento.setMes(Console.readInt("Digite o mes da folha de pagamento : "));
            folhaPagamento.setAno(Console.readInt("Digite o ano da folha de pagamento : "));
            folhaPagamento.setHorasTrabalhadas(Console.readInt("Digite a quantidade de horas trabalhadas : "));
            folhaPagamento.setValorHora(Console.readInt("Digite o valor da hora : "));

            System.out.println("Folha pagamento cadastrada");

            FolhaPagamentoController.Cadastrar(folhaPagamento);
            
        }else{
            System.out.println("Funcionario não encontrado");
        }
        

        
    }

    
}
