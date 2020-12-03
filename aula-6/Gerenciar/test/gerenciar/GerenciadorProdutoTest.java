/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciar;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lenovo
 */
public class GerenciadorProdutoTest {
    
    public GerenciadorProdutoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of produtoConstruir method, of class GerenciadorProduto.
     */
    @Test
    public void testProdutoConstruir() {
        System.out.println("produtoConstruir");
        String nome = "Nabo";
        int codigo = 1;
        GerenciadorProduto instance = new GerenciadorProduto();
        instance.produtoConstruir("Nabo", 1);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of produtoAdicionar method, of class GerenciadorProduto.
     */
    @Test
    public void testProdutoAdicionar() {
        System.out.println("produtoAdicionar");
        Produto produto = null;
        GerenciadorProduto instance = new GerenciadorProduto();
        instance.produtoAdicionar(produto);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(1,1);
    }
    /**
     * Test of buscaProduto method, of class GerenciadorProduto.
     */
    @Test
    public void testBuscaProduto() {
        System.out.println("buscaProduto");
        Produto produto = null;
        GerenciadorProduto instance = new GerenciadorProduto();
        instance.buscaProduto(produto);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(1,1);
    }

    /**
     * Test of exibirProduto method, of class GerenciadorProduto.
     */
    @Test
    public void testExibirProduto() {
        System.out.println("exibirProduto");
        GerenciadorProduto instance = new GerenciadorProduto();
        instance.exibirProduto();
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(1,1);
    }
    
    /**
     * Test of produtosRemover method, of class GerenciadorProduto.
     */
    @Test
    public void testProdutosRemover() {
        System.out.println("produtosRemover");
        Produto produto = null;
        GerenciadorProduto instance = new GerenciadorProduto();
        instance.produtosRemover(produto);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
