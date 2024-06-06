import java.util.Scanner;
import java.time.LocalDate;

import UmaCartaDeAmor.ThatsJava.valores.DadosDaCarta;
import UmaCartaDeAmor.ThatsJava.valores.Dados;

public class CartaParaBelle {

    public static void main(String[] args) {
        System.out.println("Não é muito, mas este projeto foi feito com  muito amor...");
        System.out.println("Dedico esta carta para Isabelle Belizotti, minha namorada e eterna companheira");


        //Dados incluídos na carta

        String Autor;
        Autor = "Christoffer Isac, o seu eterno companheiro";

        LocalDate DataCarta = LocalDate.of(2024, 6, 2);
        System.out.println("última atualização: " + DataCarta);

        LocalDate DataRelacionamento = LocalDate.of(2023, 3, 21);


        String CartaDeAmor;
        CartaDeAmor = """ 
                
                Amor, você se lembra de como esta rosa floresceu? Do exato momento quando esta flor
                da nossa relação pode então encontrar a luz de nossa própria paixão...? Podemos juntos relembrar
                cada um destes pequenos momentos dos quais nos trouxeram até aqui...?""";

        System.out.println(CartaDeAmor);
        System.out.println("Você se lembra de quando ela floresceu?");

        Scanner scanner = new Scanner(System.in);
        String resposta = scanner.nextLine();

        if (resposta.equalsIgnoreCase("21/03/2023")) {
            System.out.println("Foi nesta data e foi neste instante... " + DataRelacionamento + ", o momento em que nossa relação começou");

            CartaDeAmor = """ 
                    Logo após o florescer, surgiram os primeiros espinhos, as nossas primeiras dificuldades,
                    mas que ao cultivar esta flor, vieram a perder as pontas, tornado-se somente detalhes de uma bela rosa e
                    assim regamos e cultivamos o nosso amor. Não somente de flores fizemos nossa relação, mas também de jóias e metais,
                    como a prata da qual fundiu nossa promessa e como a esmeralda dos seus olhos, que com esta preciosidade obteve minha 
                    fixação.
                    """;


            System.out.println(CartaDeAmor);

            System.out.println(""" 
                                        
                    Tudo começou aqui:""" + DataRelacionamento);

            System.out.println("""
                                        
                    Foi quando nasceu o nosso amor...""");

            String Memorias = "Quer se aprofundar ainda mais na história desse relacionamento?";
            System.out.println(Memorias);

        } else {
            System.out.println("Qual é a nossa chave, a data em que tudo começou...?");

        }

        Scanner scanner1 = new Scanner(System.in);
        String resposta1 = scanner.nextLine();


        if (resposta1.equalsIgnoreCase("Sim")) {
            System.out.println("E foi...");

            CartaDeAmor = """ 
               
               Desde aquele instante iniciamos essa luta pela nossa relação, tendo que conviver com
               a distância estabelecida entre nós dois. Além das grandes dificuldades de aceitação dos seus pais,
               que continuam existindo até os dias atuais. Mas mesmo com tudo isto que tentou nos derrubar e
               impedir o prosseguimento da nossa relação, você não desistiu e igualmente eu jamais desistirei.
               Assim fomos para o nosso segundo encontro...""";

            System.out.println(CartaDeAmor);

            CartaDeAmor = """ 
               
               Que a princípio demorou quase 6 meses para conseguirmos esta oportunidade, mas que felizmente aconteceu.
               Foi quando nossa relação de fato saiu das telas, foi quando nosso amor pôde ser concretizado através dos
               nossos pequenos gestos... Foi naquele instante que eu tive a certeza de que seria para sempre, não somente
               uma fase, mas sim uma vida. Mas ainda tinhámos que aprender muitas coisas...""";

            System.out.println(CartaDeAmor);

            String Memorias1 = "Posso contar um pouco mais?";
            System.out.println(Memorias1);


        } else if (resposta1.equalsIgnoreCase("Não")) {
            System.out.println("Encerrando a execução do código.");

            CartaDeAmor = """ 
                
                Respeito sua descisão... Se esta é sua resposta imagino que possa estar em um momento ruim amor,
                porém independente de como esteja, eu sempre estarei contigo. Igualmente Deus sempre lhe guardará.""";

            System.out.println(CartaDeAmor);


        } else {
            System.out.println("Amor, para prosseguirmos você pode digitar sim ou não");

        }


        System.out.println("Esta carta foi escrita por: " + Autor);
        System.out.println("Que Deus nos guarde e juntos possamos fazer disto um amor eterno");


        scanner.close();
        scanner1.close();
    }




    }




