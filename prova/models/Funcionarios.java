package models;

public class Funcionarios {
    private String nome;
    private String cpf;
    

    /**
     * FUnção responsavel por pegar o nome do funcionario 
     * @return nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * função responsavel por definir o nome do funcionario com base no parametro passado
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * FUnção responsavel por pegar o CPF do funcionario
     * @return
     */
    public String getCpf() {
        return nome;
    }

    /**
     * função responsavel por definir o CPF do funcionario com base no parametro passado
     * @param nome
     */
    public void setCpf(String nome) {
        this.nome = nome;
    }
    
    /**
     * Metodo Override responsvel por definir como serão mostrado os dados
     */
    @Override
    public String toString(){ 
        return "Funcionário: " + nome + "\nCPF: " + cpf + "\n";
    }
}
