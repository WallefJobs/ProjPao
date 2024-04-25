package com.systec.model;

public class CadasUsuario {
    public static int id_usuario;
    private static String nome;
    private static String login;
    private static String senha;
    
    public CadasUsuario(int idUsuario, String nome, String login, String senha) {
        
        this.setId_usuario(idUsuario);
        this.setNome(nome);
        this.setLogin(login);
        this.setSenha(senha);
        
    }
    
    public CadasUsuario(String nome, String login, String senha) {
        
        this.setNome(nome);
        this.setLogin(login);
        this.setSenha(senha);
        
    }

    public CadasUsuario() {
    }
    

    
    
     public static int getId_usuario() {
        return id_usuario;
    }

    public static void setId_usuario(int id_usuario) {
        CadasUsuario.id_usuario = id_usuario;
    }

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        CadasUsuario.nome = nome;
    }

    public static String getLogin() {
        return login;
    }

    public static void setLogin(String login) {
        CadasUsuario.login = login;
    }

    public static String getSenha() {
        return senha;
    }

    public static void setSenha(String senha) {
        CadasUsuario.senha = senha;
    }
   
    
}
