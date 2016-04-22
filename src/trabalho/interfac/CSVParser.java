package trabalho.interfac;

import trabalho.bean.Paciente;
import trabalho.bean.Medicamento;
import java.io.FileNotFoundException;
import java.util.Scanner;

public interface CSVParser {

    //interfaces
    //csvfile
    public void open(String filename) throws FileNotFoundException;

    Scanner getFile();

    void setFile(Scanner file);

    void close();

    //csvparse
    //p
    Paciente readObjectPaciente();

    void ensereVetorP(Paciente novop);

    void arquivoNaListaP(Paciente novop);

    //M
    Medicamento readObjectMedicamento();

    void arquivoNaListaM(Medicamento novop);

    void ensereVetorM(Medicamento novop);

    void imprimeListadoInicio();

    void pesquisaNome(String nome);

    void pesquisaRG(String rg);

    void pesquisaCodigo(String Codigo);

    void imprimeVetor();

    void ordenarVetor();

    void pesquisarRgV(String rg);

    void pesquisarNomeV(String nome);

    void pesquisarNomeMV(String nome);

    void pesquisarCodigoM(String codigo);

}
