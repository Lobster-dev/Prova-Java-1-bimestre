package views;


import utils.Console;;

/**
 * Main
 */
public class Main {
    
    public static void main(String[] args) {
        int escolhaMenu;

        do {
            System.out.println(" - - FOLHA DE PAGAMENTO - - ");
            System.out.println("\n escolha uma das opções para continuar");
            System.out.println("1 - Cadastrar funcionario ");
            System.out.println("2 - Cadastrar folha de pagamento");
            System.out.println("3 - Consultar folha de pagamento");
            System.out.println("4 - Consultar todas as folhas de pagamento");
            System.out.println("0 - Sair");

            escolhaMenu =  Console.readInt("qual menu deseja escolher : "); 

            switch (escolhaMenu) {
                case 1:
                    CadastraFuncionario cadastro = new CadastraFuncionario();
                    cadastro.renderizar();
                    break;
                case 2:
                    /* ListarFuncionario listarFuncionario = new ListarFuncionario();
                    listarFuncionario.renderizar();
                    System.out.println("Funcionario cadastrado"); */
                    CadastrarFolhaPagamento folhaPagamento = new CadastrarFolhaPagamento();
                    folhaPagamento.renderizar();
                    break;
                case 3:
                    ConsultarFolhaPagamento consultaFolhaPagamento = new ConsultarFolhaPagamento();
                    consultaFolhaPagamento.renderizar();

                    break;
                case 4:
                    MostraFolhaPagamento mostraFolhaPagamento = new MostraFolhaPagamento();
                    mostraFolhaPagamento.renderizar();
                    break;
                case 0:
                    System.out.println(" - - Saindo - - ");
                    break;

                default:
                    System.out.println("\n -- OPÇÃO NÃO ENCONTRADA -- \n");
                break;       

            }
        } while (escolhaMenu != 0);
    }
}
