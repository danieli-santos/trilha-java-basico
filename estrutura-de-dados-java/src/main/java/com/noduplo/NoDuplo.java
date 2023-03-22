package com.noduplo;

public class NoDuplo <T>{
    private T conteudo;
    private NoDuplo<T> noproximo;
    private NoDuplo<T> noPrevio;

    public NoDuplo( T conteudo) {
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoDuplo<T> getNoproximo() {
        return noproximo;
    }

    public void setNoproximo(NoDuplo<T> noproximo) {
        this.noproximo = noproximo;
    }

    public NoDuplo getNoPrevio() {
        return noPrevio;
    }

    public void setNoPrevio(NoDuplo noPrevio) {
        this.noPrevio = noPrevio;
    }

    @Override
    public String toString() {
        return "NoDuplo{" +
                "conteudo=" + conteudo +
                '}';
    }
}
