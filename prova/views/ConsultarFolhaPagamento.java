package views;

import models.FolhaPagamento;
import models.Funcionarios;
import controller.*;
import utils.Console;

public class ConsultarFolhaPagamento {
    
    
    
    public void renderizar() {
        String cpf;
        int mes;
        int ano;
        double salarioBruto;
        double ir;
        double inss;

        FuncionarioController funcionarioController = new FuncionarioController();
        FolhaPagamentoController folhaPagamentoController = new FolhaPagamentoController();

        System.out.println(" - - CONSULTAR FOLHA DE PAGAMENTO - - ");

        cpf = Console.readString("Digite o CPF do funcionario : ");

        funcionarioController.buscarPorCpf(cpf);
        Funcionarios funcionario = funcionarioController.buscarPorCpf(cpf);
        if (funcionario != null) {
            
            mes = Console.readInt("Digite o mes da folha de pagamento : ");
            folhaPagamentoController.buscarPorMes(mes);
            FolhaPagamento mesFolhaPagamento = folhaPagamentoController.buscarPorMes(mes);
            if (mesFolhaPagamento != null) {
                
                ano = Console.readInt("Digite o ano da folha de pagamento : ");
                folhaPagamentoController.buscarPorAno(mes);
                FolhaPagamento anoFolhaPagamento = folhaPagamentoController.buscarPorAno(ano);
                if (anoFolhaPagamento != null) {
                   
                    salarioBruto = folhaPagamentoController.calculaSalarioBruto(ano, mes);
                    if (salarioBruto > 0) {
                        ir = folhaPagamentoController.calculaImpostoRenda(ano, mes, salarioBruto);
                        inss = folhaPagamentoController.calculaInss(ano, mes, salarioBruto);
                        folhaPagamentoController.calculaSalarioLiquido(salarioBruto, ir, inss);    
                    } else{
                        System.out.println("ERRO SALARIO BRUTO = 0");
                    }

                } else {
                    System.out.println("Ano não encontrado");
                }
            } else {
                System.out.println("Mes não encontrado");
            }
            
            
            // folhaPagamento.setMes(Console.readInt("Digite o mes da folha de pagamento : "));
            // folhaPagamento.setAno(Console.readInt("Digite o ano da folha de pagamento : "));
            // folhaPagamento.setHorasTrabalhadas(Console.readInt("Digite a quantidade de horas trabalhadas : "));
            // folhaPagamento.setValorHora(Console.readInt("Digite o valor da hora : "));

            // System.out.println("Folha pagamento cadastrada");

            // 
            
        }else{
            System.out.println("Funcionario não encontrado");
        }
    }
}
