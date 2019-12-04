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
public class PJ extends PESSOA {
     private String cnpj;
    
    public PJ(String nome, String cnpj){
        super(nome);
        this.cnpj = cnpj;
    }
    
    
    public void inserirCNPJ(String cnpj) {

        //this.email = endereco;
        this.nome = cnpj;

    }
}
