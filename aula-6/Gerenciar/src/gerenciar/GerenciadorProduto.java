/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class GerenciadorProduto {
    
    List<Produto> produtos = new ArrayList();
    private static final Scanner entrada = new Scanner(System.in);
    
    public void produtoConstruir(String nome, int codigo){
        produtos.add(new Produto(nome, codigo));
    }
    public void produtoAdicionar(Produto produto){
        produtos.add(produto);
    }
    public void produtosRemover(Produto produto){
        produtos.remove(produto);
    }
    public void buscaProduto(Produto produto){
        System.out.println(produtos);
    }
    public void exibirProduto(){
        System.out.println(produtos);
    }
    
}
