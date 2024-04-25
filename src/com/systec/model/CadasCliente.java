package com.systec.model;

public class CadasCliente {

    public static int id_cliente;
    public static String nome;
    public static String cpf;
    public static String telefone;

    public CadasCliente(int idCliente, String nome, String cpf, String telefone) {

        CadasCliente.setId_cliente(idCliente);
        CadasCliente.setNome(nome);
        CadasCliente.setCpf(cpf);
        CadasCliente.setTelefone(telefone);

    }

    public CadasCliente(String nome, String cpf, String telefone) {

        CadasCliente.setNome(nome);
        CadasCliente.setCpf(cpf);
        CadasCliente.setTelefone(telefone);

    }

    public CadasCliente() {
    }
    

    public static int getId_cliente() {
        return id_cliente;
    }

    public static void setId_cliente(int id_cliente) {
        CadasCliente.id_cliente = id_cliente;
    }

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        CadasCliente.nome = nome;
    }

    public static String getCpf() {
        return cpf;
    }

    public static void setCpf(String cpf) {
        CadasCliente.cpf = cpf;
    }

    public static String getTelefone() {
        return telefone;
    }

    public static void setTelefone(String telefone) {
        CadasCliente.telefone = telefone;
    }

}
