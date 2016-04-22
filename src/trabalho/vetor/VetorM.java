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
import trabalho.parser.MedicamentoParser;
import trabalho.interfac.CSVParser;

/**
 *
 * @author Stodulski
 */
public class VetorM implements CSVParser {

    private Medicamento[] p = new Medicamento[1];
    private int quantidade = 1; // quantidade de elementos;
    private int posicao = 0; // posição dos elementos

    public void add(Medicamento elemento) {
        //cria um novo array conforme vai add elementos
        Medicamento[] temp = new Medicamento[quantidade];
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

    public Medicamento get(int i) {
        return p[i];
    }

    public void set(int pos, Medicamento p) {
        this.p[pos] = p;
    }

    CSVParser v = new MedicamentoParser();

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
    public void enserirArquivoM(Medicamento novo) {
  
                add(novo);

    }

    @Override
    public void imprimeM() {

        if (getFile() != null) {

            if (!isEmpty()) {
                for (int i = 0; i < size() - 2; i++) {
                    System.out.println("Codigo:" + get(i).getCodigo() + " Medicamento:" + get(i).getNome());
                }
                System.out.println("\n---Fim---\n");
            } else {
                System.out.println("\n---Vetor está vazio!---\n");
            }
        } else {
            System.out.println("\n---Arquivo não Carregado!---\n");
        }

    }

    @Override
    public void ordenarVetor() {
        if (getFile() != null) {
            // armazenam o menor valor e o índice do menor valor
            Medicamento menor;
            int indiceMenor;
            for (int i = 0; i < size() - 2; i++) {
                // antes de comparar, considera-se menor o valor atual do loop
                menor = get(i);
                indiceMenor = i;
                // compara com os outros valores do vetor
                for (int j = i + 1; j < size() - 2; j++) {
                    if (get(j).getCodigo().compareTo(menor.getCodigo()) <= -1) {
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
            System.out.println("\n---Vetor Vazio!---\n");
        }
    }

    @Override
    public void pesquisarNomeM(String nome) {
        boolean condicao = false;

        for (int i = 0; i < size() - 1; i++) {

            if (get(i).getNome().equals(nome)) {
                System.out.println("\n---Nome encontrado!---\nNome:" + get(i).getNome() + " Codigo:" + get(i).getCodigo() + "\n");
                condicao = true;
            }

        }

        if (condicao == false) {
            System.out.println("\n---Nome do remedio não encontrado!---\n");
        }

    }

    @Override
    public void pesquisarCodigoM(String codigo) {
        boolean condicao = false;

        for (int i = 0; i < size() - 1; i++) {

            if (get(i).getCodigo().equals(codigo)) {
                System.out.println("\n---Codigo encontrado!---\nNome:" + get(i).getNome() + " Codigo:" + get(i).getCodigo() + "\n");
                condicao = true;
            }

        }

        if (condicao == false) {
            System.out.println("\n---Codigo do remedio não encontrado!---\n");
        }

    }

    // indices
    // int menor, comparado;
//        int menor = 0;
//        int comparado = 0;
//        Paciente aux[] = null;
//
//        while (comparado != vetor.size()) {
//
//            for (comparado = 0; comparado < vetor.size(); comparado++) {
//                if (Integer.parseInt(vetor.get(menor).getRg()) > Integer.parseInt(vetor.get(comparado).getRg())) {
//                    menor = menor;
//                } else {
//                    menor = comparado;
//                }
//            }
//            if (comparado == vetor.size()) {
//
//                aux[menor] = vetor.get(menor);
//                vetor.set(menor, vetor.get(comparado));
//                vetor.set(comparado, aux[menor]);
//                menor++;
//                comparado=menor;
//
//            }
//
//        }
    //-----------------------------------------------
    @Override
    public void setFile(Scanner file) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void close() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 

    @Override
    public void enserirArquivoP(Paciente novop) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ImprimeP() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void pesquisaNomeP(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void pesquisarRgP(String rg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    }
