/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.parser;

import trabalho.file.CSFile;
import trabalho.bean.Paciente;
import trabalho.bean.Medicamento;
import java.io.FileNotFoundException;
import java.util.Scanner;
import trabalho.interfac.CSVParser;


/**
 *
 * @author Ciro
 */
public class PacienteParser implements CSVParser {

    // istancia um objeto csfile
    CSFile f = new CSFile();

    // metodo para descarregar os dados do arquivo do paciente 
    @Override
    public Paciente readObjectPaciente() {
        // cria um objeto paciente
        Paciente novop = new Paciente();
        while (f.getFile().hasNext()) {
            // set atributos para o objeto
            novop.setNome(getFile().next());
            novop.setRg(getFile().next());
            novop.setDataNascimento(getFile().next());
            // retorna o atributo
            return novop;
        }
        return null;
    }

    // carrega o csfile
    @Override
    public void open(String filename) throws FileNotFoundException {
        f.open(filename);
    }

    //retorna o file do csfile carregado
    @Override
    public Scanner getFile() {
        return f.getFile();
    }

    //encerra o programa
    @Override
    public void close() {
        f.close();
    }

    // seta o file do csfile
    @Override
    public void setFile(Scanner file) {
        f.setFile(file);
    }

    //metodos @Override
 
    @Override
    public void ordenarVetor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    @Override
    public Medicamento readObjectMedicamento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
    @Override
    public void pesquisarCodigoM(String codigo) {
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

    @Override
    public void imprimeM() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void enserirArquivoM(Medicamento novo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void pesquisarNomeM(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
