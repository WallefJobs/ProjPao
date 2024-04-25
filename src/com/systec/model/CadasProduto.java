
package com.systec.model;

public class CadasProduto {
    public static int id_produtos;
    public static String nome;
    public static String valor;
    public static String qtd;

    public CadasProduto(int idProdutos, String nome, String valor, String qtd) {
        
        CadasProduto.setId_produtos(idProdutos);
        CadasProduto.setNome(nome);
        CadasProduto.setValor(valor);
        CadasProduto.setQtd(qtd);
    }
    
    public CadasProduto(String nome, String valor, String qtd) {
        
        CadasProduto.setNome(nome);
        CadasProduto.setValor(valor);
        CadasProduto.setQtd(qtd);
    }

    public CadasProduto() {
    }
    
    

    public static int getId_produtos() {
        return id_produtos;
    }

    public static void setId_produtos(int id_produto) {
        CadasProduto.id_produtos = id_produto;
    }

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        CadasProduto.nome = nome;
    }

    public static String getValor() {
        return valor;
    }

    public static void setValor(String valor) {
        CadasProduto.valor = valor;
    }

    public static String getQtd() {
        return qtd;
    }

    public static void setQtd(String qtd) {
        CadasProduto.qtd = qtd;
    }
}
