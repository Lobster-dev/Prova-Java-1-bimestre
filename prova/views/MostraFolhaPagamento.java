package views;

import models.FolhaPagamento;
import controller.FolhaPagamentoController;

public class MostraFolhaPagamento {
    
    FolhaPagamentoController folhaPagamentoController = new FolhaPagamentoController();
    
    public void renderizar() {
        int ano;
        int mes;
        double salarioBruto;
        double ir;
        double inss;
        System.out.println(" - - CONSULTANDO TODAS AS FOLHAS DE PAGAMENTO - - ");
        for(FolhaPagamento folhaPagamento  : FolhaPagamentoController.listarFolhaPagamento()){
            System.out.println("Funcionarios cadastrados : ");
            System.out.println(folhaPagamento);

            ano = folhaPagamento.getAno();
            mes = folhaPagamento.getMes();

            salarioBruto = folhaPagamentoController.calculaSalarioBruto(ano, mes);
            if (salarioBruto > 0) {
                ir = folhaPagamentoController.calculaImpostoRenda(ano, mes, salarioBruto);
                inss = folhaPagamentoController.calculaInss(ano, mes, salarioBruto);
                folhaPagamentoController.calculaSalarioLiquido(salarioBruto, ir, inss);    
            }
        }    
    }
}
