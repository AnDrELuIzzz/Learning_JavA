package Learning_Java.src.Livro.Unidade7.aplications;

public class analisandoPesquisa {
    public static void main(String[] args) {
        // array das respostas dos alunos (mais tipicamente, inserido em tempo de
        // execução)
        int[] responses = { 1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3,
                2, 3, 3, 2, 14 };
        int[] frequency = new int[6]; // array de contadores de frequência

        // para cada resposta, seleciona elemento de respostas e utiliza esse valor
        // como índice de frequência para determinar elemento a incrementar
        for (int answer = 0; answer < responses.length; answer++) {
            try {
                ++frequency[responses[answer]];
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e); // invoca o método toString
                System.out.printf("esponses[%d] = %d%n%n", answer, responses[answer]);
            }
        }
    }
}
