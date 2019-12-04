/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastrarpessoas;

/**
 *
 * @author AlexPaulo
 */
public class PF extends PESSOA {
    private String cpf;
    
    public PF(String nome, String cpf){
        super(nome);
        this.cpf = cpf;
    }
    
    
    public void inserirCPF(String cpf) {

        //this.email = endereco;
        this.nome = cpf;

    }
}
