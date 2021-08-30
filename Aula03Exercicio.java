package inicio.estudo.java;
/*
Prática
Criar variáveis para os campos descritos abaixo entre <> e imprimir a seguinte mensagem
Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salario>, na data <data>
 */
public class Aula03Exercicio {
    public static void main(String[] args) { // psvm
        String nome = "Madu Silva";
        String endereco = "Rua Abobrinha";
        Double salario = 15000.0;
        String dataRecebimentoSalario = "30/08/2021";
        String relatorio = "Eu " + nome + ", morando no endereço " + endereco + ", confirmo que recebi o salário de " + salario + ", na data " + dataRecebimentoSalario;
        System.out.println(relatorio);
    }
}
