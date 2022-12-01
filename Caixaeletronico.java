import java.util.Scanner;
public class Caixaeletronico {

    static double saldo = 100;

    /*  Um método simples que só exibe uma mensagem ao usuário e em seguida chama a função principal. */
    public static void ver_saldo() {

        System.out.println("digite a senha");
        Scanner he= new Scanner(System.in);
        int senha= he.nextInt();


        while(senha!=3589){
            System.out.println("senha incorreta tente novamente");
            ver_saldo();

        }



        System.out.println("Seu saldo atual é: " + saldo);

        //O método "main" pode receber comandos diretamente da linha de comando. Quando isso não ocorre, usamos a palavra "null" para avisar que nada será passado
        main(null);
    }

    /*  Método para receber informado pelo usuário, processar e levar a uma mensagem de sucesso ou a repetição da função */


    public static void fazer_deposito() {


        System.out.println("digite a senha");
        Scanner he= new Scanner(System.in);
        int senha= he.nextInt();


        while(senha!=3589){
            System.out.println("senha incorreta tente novamente");
            ver_saldo();

        }

        System.out.println("Qual o valor a ser depositado?");


        Scanner valor = new Scanner(System.in);


        Double deposito = valor.nextDouble();

        // Not a Number
        boolean checaNumero = deposito.isNaN(); // o método isNaN retorna checa se o valor informado é um Não-Número e retorna verdadeiro ou falso.

        if (checaNumero || deposito <= 0) {


            System.out.println("Por favor, informe um número válido:");


            fazer_deposito();



        }if (deposito<=0 ){


            System.out.println("opracao nâo autorizada");
        }




        else {
            saldo += deposito;
            ver_saldo();
        }

        valor.close();
    }

    public static void fazer_saque() {


        System.out.println("digite a senha");
        Scanner he= new Scanner(System.in);
        int senha= he.nextInt();


        while(senha!=3589){
            System.out.println("senha incorreta tente novamente");
            ver_saldo();

        }

        System.out.println("Qual o valor para saque?");


        Scanner valor = new Scanner(System.in);


        Double saque = valor.nextDouble();

        boolean checaNumero = saque.isNaN();

        if (checaNumero || saque < 0) {


            System.out.println("Por favor, informe um número válido:");


            fazer_saque();


        }if (saldo < saque) {


            System.out.println("opração não autorizada");


        }if(saque<=0){


            System.out.println("opração não autorizada");

        } else {


            saldo -= saque;


            ver_saldo();

            valor.close();
        }

    }


    public static void erro() {


        System.out.println("Por favor, informe um número entre 1 e 6");


        main(null);
    }

    public static void sair() {

        System.out.println("qual è o seu nome");

        Scanner em= new Scanner(System.in);

        String nome= em.nextLine();


        System.out.println("Você deseja sair? S/N");

        Scanner sair = new Scanner(System.in);


        String escolha = sair.nextLine();

        if (escolha.equals("S")) {


            System.out.println(nome +" foi um prazer ter você por aqui!");


            System.exit(0);
        } else if (escolha.equals("N")) {
            main(null);
        } else {
            System.out.println("Desculpe, mas não compreendi.");
            sair();
        }

        sair.close();

    }


    public static void ver_Extrato(){


        System.out.println("digite a senha");
        Scanner he= new Scanner(System.in);
        int senha= he.nextInt();


        while(senha!=3589){
            System.out.println("senha incorreta tente novamente");
            ver_saldo();

        }

        System.out.println("saque 1200");



        System.out.println("saque 800");


        System.out.println("compra 50.00");


    }

    public static void fazer_transferencia(){

        System.out.println("digite a senha");
        Scanner he= new Scanner(System.in);
        int senha= he.nextInt();


        while(senha!=3589){
            System.out.println("senha incorreta tente novamente");
            ver_saldo();

        }

        System.out.println("qual e o valor da trasferencia");


        Scanner ter= new Scanner(System.in);


        float transferencia= ter.nextFloat();

        System.out.println("digite o numero da conta para a trasferencia");


        Scanner em= new Scanner(System.in);


        double conta= em.nextDouble();
        
        








        if(conta<0 ){
            System.out.println("opracao nâo autorizada");

        }if (transferencia>saldo || transferencia<=0){

            System.out.println("opracao nâo autorizada");

        }else{

            saldo-=transferencia;
            ver_saldo();
        }










    }





    public static void main(String[] args) {

        System.out.println("qual è o seu nome");

        Scanner em= new Scanner(System.in);

        String nome= em.nextLine();

        System.out.println("Ola,seja bem vindo e um prazer telo aqui"+" "+nome);















        System.out.println("Selecione uma opção 1.) Saldo 2.) extrato 3.) Saque 4.) deposito  5.)transferencia  6.)sair");

        Scanner in = new Scanner(System.in);
        int escolha = in.nextInt();

        int diferença=escolha;

        switch (escolha){

            case 1:
                ver_saldo();
                break;

            case 4:
                fazer_deposito();
                break;


            case 3:
                fazer_saque();
                break;


            case 6:
                sair();
                break;

            case 2:
                ver_Extrato();
                break;

            case 5:
                fazer_transferencia();

        }



        in.close();
    }

}
