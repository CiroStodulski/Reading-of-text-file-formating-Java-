/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.bean;

/**
 *
 * @author Ciro
 */
public class Paciente {

   private String rg;
   private String nome;
   private String dataNascimento;

    public Paciente(String rg, String nome, String data) {
    }

    public Paciente() {
    }
   
    
   
   private Paciente proximo, anterior;

    public Paciente getProximo() {
        return proximo;
    }

    public void setProximo(Paciente proximo) {
        this.proximo = proximo;
    }

    public Paciente getAnterior() {
        return anterior;
    }

    public void setAnterior(Paciente anterior) {
        this.anterior = anterior;
    }
    
   

    public String getRg() {

        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

}
