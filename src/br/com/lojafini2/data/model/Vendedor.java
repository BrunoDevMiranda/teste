package br.com.lojafini2.data.model;

public class Vendedor extends Pessoa {

    private double salario;
    private double comissao;

    public Vendedor(int id, String nome, String cpf, double salario, double comissao) {
        super(id, nome, cpf);
        this.salario = salario;
        this.comissao = comissao;
    }
}
