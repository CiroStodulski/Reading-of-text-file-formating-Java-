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
import trabalho.parser.PacienteParser;

/*
 *
 * @author Ciro
 */
public class ListaP implements CSVParser {

    private Paciente primeiro;
    private Paciente ultimo;
    private int cont;

    PacienteParser p = new PacienteParser();

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
    public void arquivoNaListaP(Paciente novop) {

        if (novop != null) {

            // verifica se a lista está vazia
            if (primeiro == null) {
                // cria um novo nodo
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
                //como ja existe um valor para primeiro "memoria" é criado um novo objeto nodo 
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
                    if (Integer.parseInt(novop.getRg()) <= Integer.parseInt(novop.getAnterior().getRg())) {

                        Paciente aux = new Paciente();
                        Paciente anterior = novop.getAnterior();

                        aux.setNome(novop.getNome());
                        aux.setRg(novop.getRg());
                        aux.setDataNascimento(novop.getDataNascimento());

                        novop.setNome(anterior.getNome());
                        novop.setRg(anterior.getRg());
                        novop.setDataNascimento(anterior.getDataNascimento());

                        anterior.setNome(aux.getNome());
                        anterior.setRg(aux.getRg());
                        anterior.setDataNascimento(aux.getDataNascimento());

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
        Paciente pesquisa = primeiro.getProximo();
        // percorrendo a lista até o final onde a mesma recebe null
        while (pesquisa != null) {
            // compara o nome do nodo com o nome que está sendo comparado
            if (pesquisa.getNome().equals(nome)) {
                System.out.println("\n---Nome encontrado!---\nNome:" + pesquisa.getNome() + " RG:" + pesquisa.getRg() + "/n");
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
    public void pesquisaRG(String rg) {
        // criando duas variaves onde sentinela sempre ira ficar um elemento a traz do remove
        Paciente pesquisa = primeiro.getProximo();
        boolean condicao = false;

        // percorrendo a lista até o final onde a mesma recebe null
        while (pesquisa != null) {
            // compara o nome do nodo com o nome que está sendo comparado
            if (pesquisa.getRg().equals(rg)) {
                System.out.println("\n---Rg encontrado!---\nNome:" + pesquisa.getNome() + "Rg:" + pesquisa.getRg());
                condicao = true;
            }
            // seguew pro proximo nodo
            pesquisa = pesquisa.getProximo();
        }
        if (condicao == false) {
            System.out.println("\n---RG não encontrado---\n");
        }

    }

    @Override
    public void imprimeListadoInicio() {
        // criando um variavel do tipo Nodo para percorrer, a mesma está recebendo o proximo da primeira posição
        Paciente percorre = primeiro;

        if (percorre != null) {
            // percorrendo a lista até o final onde a mesma recebe null
            while (percorre != null) {
                // imprime a varivel nome do nodo
                System.out.println("RG:" + percorre.getRg() + " Paciente:" + percorre.getNome());
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
    public void ensereVetorP(Paciente novop) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

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
