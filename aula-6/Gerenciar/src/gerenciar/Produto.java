/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciar;

/**
 *
 * @author Lenovo
 */
public class Produto {
    
    private int codigo;
    private String nome;

    Produto(String nome, int codigo) {
         nome = this.nome;
         codigo = this.codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}
