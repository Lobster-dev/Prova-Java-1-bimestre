package models;

public class FolhaPagamento {
    
    private int mes;
    private int ano;
    private int horasTrabalhadas;
    private double valorHora;
    

    /**
     * FUnção responsavel por pegar o mês 
     * @return nome
     */

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }


    public int getAno() {
            return ano;
        }


    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getHorasTrabalhadas() {
            return horasTrabalhadas;
        }


    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }


    public double getValorHora() {
        return valorHora;
    }


    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    /**
     * Metodo Override responsvel por definir como serão mostrado os dados
     */
    @Override
    public String toString(){ 
        return "Mes " + mes + "\nAno" + ano + "\n";
    }


    


}
