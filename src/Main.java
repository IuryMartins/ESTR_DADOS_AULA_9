public class Main {

    public static void main(String[] args) {
        Aluno[] alunos = new Aluno[10];
        int index = alunos.length-1;

        alunos[0] = new Aluno( "João", 1234, 6.0 );
        alunos[1] = new Aluno( "Maria", 4321, 7.5 );
        alunos[2] = new Aluno( "Felipe", 5678, 8.9 );
        alunos[3] = new Aluno( "Thiago", 8765, 4.7 );
        alunos[4] = new Aluno( "Pedro", 2468, 3.4 );
        alunos[5] = new Aluno( "José", 8642, 5.5 );
        alunos[6] = new Aluno( "Ana", 1357, 2.2 );
        alunos[7] = new Aluno( "Jessica", 7531, 1.4 );
        alunos[8] = new Aluno( "Rafaela", 1111, 10.0 );
        alunos[9] = new Aluno( "Sabrina", 2222, 9.5 );

        long tempoInicial = System.currentTimeMillis();
        Aluno[] aux = bubbleSort(alunos);
        long tempoFinal = System.currentTimeMillis();
        Aluno[] alunosBubbleSort = new Aluno[alunos.length];

        for (Aluno al: aux) {
            alunosBubbleSort[index] = al;
            index--;
        }

        for (Aluno al: alunosBubbleSort) {
            System.out.print("[");
            System.out.print(al.nome + " - ");
            System.out.print(al.nota);
            System.out.print("]");
        }
        System.out.println("");
        System.out.println(tempoFinal-tempoInicial);

        tempoInicial = System.currentTimeMillis();
        index = alunos.length-1;
        aux = selectionSort(alunos);
        tempoFinal = System.currentTimeMillis();
        Aluno[] alunosSelectionSort = new Aluno[alunos.length];

        for (Aluno al: aux) {
            alunosSelectionSort[index] = al;
            index--;
        }

        for (Aluno al: alunosSelectionSort) {
            System.out.print("[");
            System.out.print(al.nome + " - ");
            System.out.print(al.nota);
            System.out.print("]");
        }
        System.out.println("");
        System.out.println(tempoFinal-tempoInicial);
    }

    public static Aluno[] bubbleSort(Aluno vetor[]){
        boolean troca = true;
        Aluno aux;
        while (troca) {
            troca = false;
            for (int i = 0; i < vetor.length - 1; i++) {
                if (vetor[i].nota > vetor[i + 1].nota) {
                    aux = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = aux;
                    troca = true;
                }
            }
        }
        return vetor;
    }

    public static Aluno[] selectionSort(Aluno[] vetor) {
        for (int fixo = 0; fixo < vetor.length - 1; fixo++) {
            int menor = fixo;

            for (int i = menor + 1; i < vetor.length; i++) {
                if (vetor[i].nota < vetor[menor].nota) {
                    menor = i;
                }
            }
            if (menor != fixo) {
                Aluno t = vetor[fixo];
                vetor[fixo] = vetor[menor];
                vetor[menor] = t;
            }
        }
        return vetor;
    }
}
