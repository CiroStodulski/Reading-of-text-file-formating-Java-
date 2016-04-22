/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.file;

import trabalho.bean.Paciente;
import trabalho.bean.Medicamento;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import trabalho.interfac.CSVParser;
/*
 * @author Ciro
 */
public class CSFile implements CSVParser {

    private Scanner file;

    //metodos para carregar o arquivo       
    @Override
    public void open(String filename) throws FileNotFoundException {
       // tenta realizar o procedimento abaixo
        try {

            // cria uma variavel que irar usar os ; \n como delemitador   
            Scanner scanner = new Scanner(new FileReader(filename)).useDelimiter("[;\n]");
            // pula uma linha
            String linha = scanner.nextLine();
            // guarda o arquivo na variavel file
            this.file = scanner;
            System.out.println("\n---Arquivo Carregado!---\n");

        } catch (Exception e) {
            // informa que deu erro ao carregar arquivo
            System.out.println("\n---Erro para carregar o arquivo!--\n");
        }

    }
    
    // metodo para retornar o arquivo
    @Override
    public Scanner getFile() {
        return file;
    }

    // metodo para setar o arquivo
    @Override
    public void setFile(Scanner file) {
        this.file = file;
    }

    // metodo para encerrar o programa
    @Override
    public void close() {
        System.exit(0);
    }

        
    //metodos @Override
    
    
    @Override
    public Paciente readObjectPaciente() {
        return null;
    }

    @Override
    public void arquivoNaListaP(Paciente novop) {

    }

    @Override
    public void imprimeListadoInicio() {
    }

    @Override
    public void ensereVetorP(Paciente novop) {

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
    public void pesquisaNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void pesquisaRG(String rg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Medicamento readObjectMedicamento() {
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
