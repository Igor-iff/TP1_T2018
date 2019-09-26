package br.edu.iff.teste.heranca;

/**
 *
 * @author luizcanf
 */
public class AlunoConcomitante extends Aluno {
    
    long matriculaEM;
    String escolaEM;
    boolean apresentouCertificadoEM;
    boolean concluiuocurso;
    boolean documentacaodamatricula;
    
    public boolean podeSolicitarDiploma() {
        if (apresentouCertificadoEM && documentacaodamatricula && concluiuocurso) {
            return true;
        } else {
            return false;
        }
    }

}
