/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.lista;

import trabalho.bean.Paciente;
import trabalho.bean.Medicamento;
import java.io.FileNotFoundException;
import java.util.Scanner;
import trabalho.interfac.CSVParser;
import trabalho.parser.MedicamentoParser;

/**
 *
 * @author Stodulski
 */
public class ListaM implements CSVParser {

    private Medicamento primeiro;
    private Medicamento ultimo;
    private int cont;

    MedicamentoParser p = new MedicamentoParser();

    @Override
    public void open(String filename) throws FileNotFoundException {
        p.open(filename);
    }

    @Override
    public Scanner getFile() {
        return p.getFile();
    }

    @Override
    public void close() {

    }

    @Override
    public Paciente readObjectPaciente() {

        return p.readObjectPaciente();

    }

    @Override
    public Medicamento readObjectMedicamento() {
       return p.readObjectMedicamento();
    }

    @Override
    public void setFile(Scanner file) {

    }

    @Override
    public void arquivoNaListaM(Medicamento novop) {

      
        if (novop != null) {

            // verifica se a lista está vazia
            if (primeiro == null) {
                

                // setando null para o proximo do novo nodo
                novop.setProximo(null);
                // setando null para o anterior do novo nodo 
                novop.setAnterior(null);
                // os ponteiros "primeiro e ultimo" irão receber o nodo criado
                primeiro = novop;
                ultimo = novop;
                // adicionando 1 para tamanho
                cont++;
            } else {

             
                // proximo do Ultimo aponta para o nodo criado
                ultimo.setProximo(novop);
                // setando o nome para o novo nodo2

                // apontando o proximo do nodo criado para null
                novop.setProximo(null);
                // apontando o anterior do nodo criado para o ultimo
                novop.setAnterior(ultimo);
                // o ultimo vai receber o novo
                ultimo = novop;
                // adicionando 1 para tamanho
                cont++;

                while (novop.getAnterior() != null) {

                    if (novop.getCodigo().compareTo(novop.getAnterior().getCodigo()) <= -1) {
                        //vetor.get(j).getCodigo().compareTo(menor.getCodigo()) == -1
                        Medicamento aux = new Medicamento();
                        Medicamento anterior = novop.getAnterior();

                        aux.setNome(novop.getNome());
                        aux.setCodigo(novop.getCodigo());

                        novop.setNome(anterior.getNome());
                        novop.setCodigo(anterior.getCodigo());

                        anterior.setNome(aux.getNome());
                        anterior.setCodigo(aux.getCodigo());

                    }
                    novop = novop.getAnterior();
                }
            }

        }

    }

    // pesquisa na lista 
    @Override
    public void pesquisaNome(String nome) {
        // criando duas variaves onde sentinela sempre ira ficar um elemento a traz do remove
        Medicamento pesquisa = primeiro.getProximo();
        // percorrendo a lista até o final onde a mesma recebe null
        while (pesquisa != null) {
            // compara o nome do nodo com o nome que está sendo comparado
            if (pesquisa.getNome().equals(nome)) {
                System.out.println("\n---Nome encontrado!---\nNome:" + pesquisa.getNome() + "Codigo:" + pesquisa.getCodigo() + "\n");
                break;
            }
            if (pesquisa.getProximo() == null) {
                System.out.println("\n---Nome não encontrado---\n");
            }

            // seguew pro proximo nodo
            pesquisa = pesquisa.getProximo();
        }

    }

    // pesquisa na lista 
    @Override
    public void pesquisaCodigo(String Codigo) {
        // criando duas variaves onde sentinela sempre ira ficar um elemento a traz do remove
        Medicamento pesquisa = primeiro.getProximo();
        boolean condicao = false;
        // percorrendo a lista até o final onde a mesma recebe null
        while (pesquisa != null) {
            // compara o nome do nodo com o nome que está sendo comparado
            if (pesquisa.getCodigo().equals(Codigo)) {
                System.out.println("\n---Codigo encontrado!---\nNome:" + pesquisa.getCodigo() + "Codigo:" + pesquisa.getCodigo() + "/n");
                condicao = true;
            }

            // seguew pro proximo nodo
            pesquisa = pesquisa.getProximo();
        }
        if (condicao == false) {
            System.out.println("---Codigo não encontrado---");
        }

    }

    @Override
    public void imprimeListadoInicio() {
        // criando um variavel do tipo Nodo para percorrer, a mesma está recebendo o proximo da primeira posição
        Medicamento percorre = primeiro;

        if (percorre != null) {
            // percorrendo a lista até o final onde a mesma recebe null
            while (percorre != null) {
                // imprime a varivel nome do nodo
                System.out.println("Codigo:" + percorre.getCodigo() + " Remedio:" + percorre.getNome());
                // seguew pro proximo nodo
                percorre = percorre.getProximo();

            }
            System.out.println("\n---Fim---\n");
        } else {
            System.out.println("\n---lista vazia---\n");
        }

    }

    
    
    // metodos  @Override
    
    
    @Override
    public void imprimeVetor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ordenarVetor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void pesquisarRgV(String rg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void pesquisarNomeV(String nome) {
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
    public void pesquisaRG(String rg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ensereVetorP(Paciente novop) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void arquivoNaListaP(Paciente novop) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ensereVetorM(Medicamento novop) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
