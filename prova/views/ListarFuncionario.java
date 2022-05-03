package views;

import controller.FuncionarioController;
import models.Funcionarios;


public class ListarFuncionario {
        
        /**
         * Metodo responsavel por mostrar o retorno da lista de funcionarios no terminal
         */
        public void renderizar(){
            System.out.println("\n -- LISTA DE FUNCIONÁRIOS -- \n");
            //System.out.println(FuncionarioController.listarFuncionarios());
            for(Funcionarios funcionariosCadastrado : FuncionarioController.listarFuncionarios()){
                System.out.println("Funcionarios cadastrados : ");
                System.out.println(funcionariosCadastrado);
            }
        }
}
