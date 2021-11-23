public class Aluno {
    String nome;
    int codigo;
    double nota;

    public Aluno(){

    }

    public Aluno(String nome, int codigo, double nota) {
        this.nome = nome;
        this.codigo = codigo;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome +
                ", codigo=" + codigo +
                ", nota=" + nota;
    }
}
