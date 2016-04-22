/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.bean;

/**
 *
 * @author Stodulski
 */
public class Medicamento {
    
    
    private String nome, codigo;
    private Medicamento proximo, anterior;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Medicamento getProximo() {
        return proximo;
    }

    public void setProximo(Medicamento proximo) {
        this.proximo = proximo;
    }

    public Medicamento getAnterior() {
        return anterior;
    }

    public void setAnterior(Medicamento anterior) {
        this.anterior = anterior;
    }
    
    
}
