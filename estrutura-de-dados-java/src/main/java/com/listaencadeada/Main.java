package com.listaencadeada;

public class Main {
    public static void main(String[] args) {

        ListaEncadeada<String> minhaListaEncadada = new ListaEncadeada<String>();
        minhaListaEncadada.add("teste1");
        minhaListaEncadada.add("teste2");
        minhaListaEncadada.add("teste3");
        minhaListaEncadada.add("teste4");


        System.out.println(minhaListaEncadada.get(0));
        System.out.println(minhaListaEncadada.get(1));
        System.out.println(minhaListaEncadada.get(2));
        System.out.println(minhaListaEncadada.get(3));

        System.out.println(minhaListaEncadada);

        System.out.println(minhaListaEncadada.remove(3));
        System.out.println(minhaListaEncadada);

    }
}
