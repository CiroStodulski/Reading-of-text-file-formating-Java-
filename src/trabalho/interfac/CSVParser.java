package trabalho.interfac;

import trabalho.bean.Paciente;
import trabalho.bean.Medicamento;
import java.io.FileNotFoundException;
import java.util.Scanner;

public interface CSVParser {

    public void open(String filename) throws FileNotFoundException;

    // CSFFILE
    Scanner getFile();

    void setFile(Scanner file);

    void close();

    // Parser
    Paciente readObjectPaciente();

    Medicamento readObjectMedicamento();

    // junção do vp e lp
    void enserirArquivoP(Paciente novop);

    void ImprimeP();

    void pesquisaNomeP(String nome);

    void pesquisarRgP(String rg);

    // junção do vm e lm
    
    
    void imprimeM();

    void enserirArquivoM(Medicamento novo);

    void pesquisarNomeM(String nome);

    void pesquisarCodigoM(String codigo);
    
  
    void ordenarVetor();
    //M
}
