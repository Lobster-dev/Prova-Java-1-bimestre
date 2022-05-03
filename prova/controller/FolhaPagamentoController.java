package controller;

import java.util.ArrayList;
import models.FolhaPagamento;

public class FolhaPagamentoController {
    private static ArrayList <FolhaPagamento> listaFolhaPagamento = new ArrayList<FolhaPagamento>();

    public static void Cadastrar(FolhaPagamento funcionario){
        listaFolhaPagamento.add(funcionario);
    }
    public static ArrayList<FolhaPagamento> listarFolhaPagamento(){
        return listaFolhaPagamento;
    }

    public FolhaPagamento buscarPorMes(int mes){
        for (FolhaPagamento funcionarioCadastrado : listaFolhaPagamento) {
            if(funcionarioCadastrado.getMes() == mes){
                return funcionarioCadastrado;
            }
        }
        return null;
    }

    public FolhaPagamento buscarPorAno(int ano){
        for (FolhaPagamento funcionarioCadastrado : listaFolhaPagamento) {
            if(funcionarioCadastrado.getAno() == ano){
                return funcionarioCadastrado;
            }
        }
        return null;
    }
    

    public double calculaSalarioBruto(int ano, int mes) {
        int horasTrabalhadas;
        double valorHora;
        double salarioBruto;
        salarioBruto = 0;
        
        for (FolhaPagamento funcionarioCadastrado : listaFolhaPagamento) {
            
            if(funcionarioCadastrado.getAno() == ano || funcionarioCadastrado.getMes() == mes){
                horasTrabalhadas = funcionarioCadastrado.getHorasTrabalhadas();
                valorHora = funcionarioCadastrado.getValorHora();

                salarioBruto =  horasTrabalhadas * valorHora;
                System.out.println("Salario bruto "+salarioBruto);
                //System.out.println("Salario bruto : " + salarioBruto);
                return salarioBruto;
            }
        }
        return salarioBruto;
    }

    public double calculaImpostoRenda(int ano,int mes, double salarioBruto) {
        double parcelaDeduzir;
        parcelaDeduzir = 0;

        for (FolhaPagamento funcionarioCadastrado : listaFolhaPagamento) {
            if(funcionarioCadastrado.getAno() == ano || funcionarioCadastrado.getMes() == mes){
                if (salarioBruto >= 1904 || salarioBruto <= 2826.65) {
                    parcelaDeduzir = 142.8;
                } else{
                    if (salarioBruto > 2826.66 || salarioBruto <= 3751.05) {
                        parcelaDeduzir = 354.8;
                    } else {
                        if (salarioBruto >= 3751.06 || salarioBruto <= 4664.68) {
                            parcelaDeduzir = 636.13; 
                        } else {
                            if (salarioBruto > 4664.68) {
                                parcelaDeduzir = 869.36;
                            }
                        }
                    }
                }
                

                System.out.println("Imposto de renda : R$" + parcelaDeduzir);
                return parcelaDeduzir;
            }
        }
        return parcelaDeduzir;
    }

    public double calculaInss(int ano, int mes, double salarioBruto) {
        double desconto;
        desconto = 0;

        for (FolhaPagamento funcionarioCadastrado : listaFolhaPagamento) {
            if(funcionarioCadastrado.getAno() == ano || funcionarioCadastrado.getMes() == mes){
                desconto = 621.03;
                if (salarioBruto <= 1693.72) {
                    desconto = salarioBruto*0.08;
                } else{
                    if (salarioBruto <= 2822.90) {
                        desconto = salarioBruto*0.09;
                    } else {
                        if (salarioBruto <= 5645.8) {
                            desconto = salarioBruto*0.11;
                        }
                    }
                }
                

                System.out.println("Desconto INSS : R$" + desconto);
                return desconto;
            }
        }
        return desconto;
    }

    public void calculaFgts(int ano, int mes, double salarioBruto) {
        double desconto;
        for (FolhaPagamento funcionarioCadastrado : listaFolhaPagamento) {
            if(funcionarioCadastrado.getAno() == ano || funcionarioCadastrado.getMes() == mes){
               desconto = salarioBruto*0.08;
                

                System.out.println("Desconto FGTS : R$" + desconto);
            }
        }
    }

    public void calculaSalarioLiquido(double salarioBruto, double ir, double inss) {
        double salarioLiquido;

        salarioLiquido = salarioBruto - ir - inss;
        System.out.println("Salario liquido : R$" + salarioLiquido);
    }

}
