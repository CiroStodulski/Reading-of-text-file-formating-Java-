/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.app;

import trabalho.lista.ListaP;
import trabalho.lista.ListaM;
import trabalho.vetor.VetorP;
import trabalho.vetor.VetorM;
import trabalho.interfac.CSVParser;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Ciro
 */
public class TesteApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        CSVParser l = new ListaP();
        CSVParser v = new VetorP();
        CSVParser mv = new VetorM();
        CSVParser ml = new ListaM();

        // variavel para escolher entre vetor e lista
        int vl = -1;

        while (vl != 0) {

            try {
                System.out.println("Escolha o modolo:\n1- Vetor\n2- Lista\n0- Sair");
                vl = Integer.parseInt(entrada.nextLine());
            } catch (Exception e) {
                System.out.println("\n---Erro ao informar modolo---\n");
            }

            if (vl == 1) {
                int pm = -1;
                while (pm != 0) {
                    try {

                        System.out.println("Modolo Vetor:\n1- Paciente\n2- Medicamento\n0- Voltar");
                        pm = Integer.parseInt(entrada.nextLine());

                    } catch (Exception e) {
                        System.out.println("\n---Erro ao informar indice!---\n");
                    }

                    if (pm == 1) {
                        pm = -1;
                        int mpv = -1;
                        while (mpv != 0) {
                            try {

                                System.out.println("Paciente Menu Vetor:\n1- Carregar arquivo CSV\n2- Descarregar arquivo CSV no vetor\n3- Ordenar vetor\n4- Pesquisar Paciente por Nome\n5- Pesquisar Paciente por RG\n6- Imprimir vetor\n0- voltar");
                                mpv = Integer.parseInt(entrada.nextLine());
                            } catch (Exception e) {

                                System.out.println("\n---Erro ao informar indice!---\n");

                            }

                            switch (mpv) {
                                case 1:
                                    // paciente no vetor
                                    try {
                                        System.out.println("Digite o caminho do arquivo: ex C:\\pacientes.csv");
                                        //C:\\pacientes.csv
                                        v.open(entrada.nextLine());
                                    } catch (Exception e) {
                                        System.out.println("\n---Erro ao informar caminho---\n");
                                    }
                                    break;
                                case 2:

                                    try {
                                        while (v.readObjectPaciente() != null) {
                                            v.ensereVetorP(v.readObjectPaciente());
                                        }
                                        System.out.println("\n---Vetor Carregado!---\n");
                                    } catch (Exception e) {
                                        System.out.println("\n---Erro ao decarrgar Lista!---\n");
                                    }

                                    break;
                                case 3:
                                    v.ordenarVetor();
                                    break;
                                case 4:
                                    try {
                                        System.out.println("Digite o nome:");
                                        v.pesquisarNomeV(entrada.nextLine());
                                    } catch (Exception e) {
                                        System.out.println("\n---Erro ao pesquisar nome!---\n");
                                    }
                                    break;
                                case 5:
                                    try {
                                        System.out.println("Digite o rg:");
                                        v.pesquisarRgV(entrada.nextLine());
                                    } catch (Exception e) {
                                        System.out.println("\n---Erro ao pesquisar RG!---\n");
                                    }
                                    break;
                                case 6:
                                    v.imprimeVetor();
                                    break;

                            }
                        }

                    }

                    if (pm == 2) {
                        pm = -1;
                        int mpv = -1;
                        while (mpv != 0) {

                            try {

                                System.out.println("Medicamento Menu Vetor:\n1- Carregar arquivo CSV\n2- Descarregar arquivo CSV no vetor\n3- Ordenar arquivo CSV\n4- Pesquisar Remedio por Nome\n5- Pesquisar Remedio por Codigo\n6- Imprimir vetor\n0- Voltar");
                                mpv = Integer.parseInt(entrada.nextLine());
                            } catch (Exception e) {
                                System.out.println("\n---Erro ao informar caminho---\n");
                            }

                            switch (mpv) {
                                case 1:
                                    try {
                                        // Medicamento no vetor
                                        System.out.println("Digite o caminho do arquivo: ex: C:\\medicamentos.csv");
                                        //C:\\medicamentos.csv
                                    } catch (Exception e) {
                                        System.out.println("\n---Erro ao informar caminho!---\n");
                                    }
                                    mv.open(entrada.nextLine());
                                    break;
                                case 2:

                                    try {
                                        while (mv.readObjectMedicamento() != null) {
                                            mv.ensereVetorM(mv.readObjectMedicamento());
                                        }
                                        System.out.println("\n---Vetor Carregado!---\n");
                                    } catch (Exception e) {
                                        System.out.println("\n---Erro ao decarrgar Lista!---\n");
                                    }

                                    break;
                                case 3:
                                    mv.ordenarVetor();
                                    break;
                                case 4:
                                    try {
                                        System.out.println("Digite o nome:");
                                        mv.pesquisarNomeMV(entrada.nextLine());
                                    } catch (Exception e) {
                                        System.out.println("\n---Erro ao informar Nome!---\n");
                                    }
                                    break;
                                case 5:

                                    try {
                                        System.out.println("Digite o Codigo:");
                                        mv.pesquisarCodigoM(entrada.nextLine());
                                    } catch (Exception e) {
                                        System.out.println("\n---Erro ao informar Nome!---\n");
                                    }
                                    break;
                                case 6:
                                    mv.imprimeVetor();
                                    break;

                            }

                        }

                    }

                }
            }

            if (vl == 2) {
                int pm = -1;
                while (pm != 0) {
                    // lista
                    try {

                        System.out.println("Modolo Lista:\n1- Paciente\n2- Medicamento\n0- Voltar");
                        pm = Integer.parseInt(entrada.nextLine());

                    } catch (Exception e) {
                        System.out.println("\n---Erro ao informar indice!---\n");
                    }

                    if (pm == 1) {

                        // paciente na lista
                        int mpl = -1;
                        while (mpl != 0) {

                            try {

                                System.out.println("Paciente Menu Lista:\n1- Carregar arquivo CSV\n2- Descarregar arquivo CSV na Lista Ordenada\n3- Pesquisar Paciente por Nome\n4- Pesquisar Paciente por RG\n5- Imprimir Lista Paciente\n0- Voltar");
                                mpl = Integer.parseInt(entrada.nextLine());
                            } catch (Exception e) {
                                System.out.println("\n---Erro ao informar indice---\n");
                            }
                            switch (mpl) {

                                case 1:

                                    try {

                                        System.out.println("Digite o caminho do arquivo: ex C:\\pacientes.csv");
                                        //C:\\pacientes.csv
                                        l.open(entrada.nextLine());
                                    } catch (Exception e) {

                                        System.out.println("\n---Erro ao informar caminho---\n");
                                    }
                                    break;

                                case 2:
                                    try {
                                        while (l.readObjectPaciente() != null) {
                                            l.arquivoNaListaP(l.readObjectPaciente());
                                        }
                                        System.out.println("\n---Lista Carregada!---\n");
                                    } catch (Exception e) {
                                        System.out.println("\n---Erro ao decarrgar Lista!---\n");
                                    }
                                    break;

                                case 3:
                                    try {

                                        System.out.println("Digite nome para pesquisiar:");
                                        l.pesquisaNome(entrada.nextLine());
                                    } catch (Exception e) {
                                        System.out.println("\n---erro ao informar dado---\n");
                                    }
                                    break;

                                case 4:
                                    try {

                                        System.out.println("Digite RG para pesquisiar:");
                                        l.pesquisaRG(entrada.nextLine());
                                    } catch (Exception e) {
                                        System.out.println("\n---erro ao informar dado---\n");
                                    }
                                    break;

                                case 5:

                                    l.imprimeListadoInicio();

                                    break;

                            }
                        }

                    }

                    if (pm == 2) {

                        //medicamento na lista
                        int mpl = -1;
                        while (mpl != 0) {
                            try {

                                System.out.println("Medicamento Menu Lista:\n1- Carregar arquivo CSV\n2- Descarregar arquivo CSV na Lista Ordenada\n3- Pesquisar remedio por Nome\n4- Pesquisar Remedio por Codigo\n5- Imprimir lista\n0- Voltar");

                                mpl = Integer.parseInt(entrada.nextLine());
                            } catch (Exception e) {
                                System.out.println("\n---Erro ao infromar indice---\n");
                            }
                            switch (mpl) {

                                case 1:
                                    try {

                                        System.out.println("Digite o caminho do arquivo: ex: C:\\medicamentos.csv");
                                        //C:\\medicamentos.csv
                                        ml.open(entrada.nextLine());
                                    } catch (Exception e) {

                                        System.out.println("\n---Erro ao informar caminho---\n");
                                    }
                                    break;

                                case 2:

                                    try {
                                        while (ml.readObjectMedicamento() != null) {
                                            ml.arquivoNaListaM(ml.readObjectMedicamento());
                                        }
                                        System.out.println("\n---Lista Carregada!---\n");
                                    } catch (Exception e) {
                                        System.out.println("\n---Erro ao decarrgar Lista!---\n");
                                    }

                                    break;

                                case 3:

                                    try {

                                        System.out.println("Digite nome para pesquisiar:");
                                        ml.pesquisaNome(entrada.nextLine());
                                    } catch (Exception e) {

                                        System.out.println("\n---Erro ao informar dado---\n");
                                    }

                                    break;

                                case 4:

                                    try {

                                        System.out.println("Digite Codigo para pesquisiar:");
                                        ml.pesquisaCodigo(entrada.nextLine());
                                    } catch (Exception e) {

                                        System.out.println("\n---Erro ao informar dado---\n");
                                    }

                                    break;

                                case 5:

                                    ml.imprimeListadoInicio();

                                    break;

                            }

                        }
                    }
                }

            }

            if (vl == 0) {
                System.out.println("\n---Bye---\n");
            }

            // fim do while
        }

        //fim da classe
    }

}
