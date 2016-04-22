/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.vetor;

import trabalho.bean.Paciente;
import trabalho.bean.Medicamento;
import java.io.FileNotFoundException;
import java.util.Scanner;
import trabalho.interfac.CSVParser;
import trabalho.parser.PacienteParser;

/**
 *
 * @author Stodulski
 */
public class VetorP implements CSVParser {

    // vetor dinamico
    private Paciente[] p = new Paciente[1];
    private int quantidade = 1; // quantidade de elementos;
    private int posicao = 0; // posição dos elementos

    // para dicionar novo elemento
    public void add(Paciente elemento) {
        //cria um novo vetor conforme vai add elementos
        Paciente[] temp = new Paciente[quantidade];
        // add os elementos de s no novo array 
        for (int i = 0; i < p.length; i++) {
            temp[i] = p[i];
        }
        // add o o novo elemento 
        temp[posicao] = elemento;
        // repassa para s o novo array 
        p = temp;
        quantidade++;
        posicao++;
    }

    public int size() {
        return this.quantidade;
    }

    public boolean isEmpty() {
        if (this.quantidade == 0) {
            return true;
        } else {
            return false;
        }
    }

    public Paciente get(int i) {
        return this.p[i];
    }

    public void set(int pos, Paciente p) {
        this.p[pos] = p;
    }

    PacienteParser v = new PacienteParser();

    @Override
    public void ensereVetorP(Paciente novop) {

        add(novop);

    }

    @Override
    public void imprimeVetor() {

        if (getFile() != null) {

            if (!isEmpty()) {
                for (int i = 0; i < size() - 1; i++) {
                    System.out.println("RG:" + get(i).getRg() + " Paciente:" + get(i).getNome());
                }
            } else {
                System.out.println("\n---Vetor está vazio!---\n");
            }
        } else {
            System.out.println("\n---Arquivo não Carregado!---\n");
        }

    }

    @Override
    public void ordenarVetor() {

        // armazenam o menor valor e o índice do menor valor
        if (getFile() != null) {
            Paciente menor;
            int indiceMenor;
            for (int i = 0; i < size() - 2; i++) {
                // antes de comparar, considera-se menor o valor atual do loop
                menor = get(i);
                indiceMenor = i;
                // compara com os outros valores do vetor
                for (int j = i + 1; j < size() - 1; j++) {
                    if (Integer.parseInt(get(j).getRg()) < Integer.parseInt(menor.getRg())) {
                        menor = get(j);
                        indiceMenor = j;
                    }
                }
                // troca os valores menor e maior
                set(indiceMenor, get(i));
                set(i, menor);
            }
            System.out.println("\n---Vetor Ordenado!---\n");
        } else {
            System.out.println("\n---Vetor está vazio!---\n");
        }
    }

    @Override
    public void pesquisarRgV(String rg) {

        boolean condicao = false;

        for (int i = 0; i < size() - 1; i++) {

            if (Integer.parseInt(get(i).getRg()) == Integer.parseInt(rg)) {
                System.out.println("\n---Rg encontrado!---\nNome:" + get(i).getNome() + " RG:" + get(i).getRg() + "\n");
                condicao = true;
            }

        }

        if (condicao == false) {
            System.out.println("\n---RG não encontrado!---\n");
        }

    }

    @Override
    public void pesquisarNomeV(String nome) {
        boolean condicao = false;

        for (int i = 0; i < size() - 1; i++) {

            if (get(i).getNome().equalsIgnoreCase(nome)) {
                System.out.println("\n---Nome encontrado!---\nNome:" + get(i).getNome() + " RG:" + get(i).getRg() + "\n");
                condicao = true;
            }

        }

        if (condicao == false) {
            System.out.println("\n---Nome não encontrado!---\n");
        }

    }

    //-----------------------------------------------
    @Override
    public Medicamento readObjectMedicamento() {
        return v.readObjectMedicamento();
    }

    @Override
    public Paciente readObjectPaciente() {
        return v.readObjectPaciente();

    }

    @Override
    public Scanner getFile() {
        return v.getFile();
    }

    @Override
    public void open(String filename) throws FileNotFoundException {
        v.open(filename);
    }

    @Override
    public void setFile(Scanner file) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void close() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void arquivoNaListaP(Paciente novop) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void imprimeListadoInicio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void pesquisaNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void pesquisaRG(String rg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void pesquisarNomeMV(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void pesquisarCodigoM(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void pesquisaCodigo(String Codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void arquivoNaListaM(Medicamento novop) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ensereVetorM(Medicamento novop) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
