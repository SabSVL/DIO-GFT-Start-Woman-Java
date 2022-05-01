public class Main {
    public static void main(String[] args) {

        int i;
        //int i; nao pode com o mesmo nome
        int I; // variaveis sao sensitives
       // int 1a; nao pode começar com números
        int _1a; // fortemente evitado
        int $aq; // fortemente evitado

        i = 5;
        I = 10;
        _1a = 20;
        $aq = 7;

        final int j = 10;
        int asrn24678md;
        // int asrn246 78md; nao pode ter espaço
        int asrn2$678_md = 10; // fortemente evitado
        // int asrn2$6%78_md = 10 nao pode usar caracter especial no nome da variavel

        asrn24678md = 100;
        asrn2$678_md = 10;

        int quantidadeProduto = 50;
       // int QuantidadeProduto; nao tem problema mas nao segue as boas praticas
        final int NUMERO_TENTATIVAS = 5;
       // final int  numerosTentativas = 5 ;nao segue o padrao
        int QUANTIDADE_OPCOES = 25;
        int qtdProd;



        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println($aq);

        System.out.println(j);
        System.out.println(asrn24678md);
        System.out.println(asrn2$678_md);
        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);


    }
}
