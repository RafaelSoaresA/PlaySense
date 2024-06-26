package br.com.playsense.principal;

import java.util.Scanner;

import br.com.playsense.modelos.Musica;
import br.com.playsense.modelos.Podcast;
import br.com.playsense.modelos.Preferidas;

public class Main {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {

        int opcao = 0;
        Musica minhaMusica = new Musica();
        Podcast podcast = new Podcast();
        Preferidas preferidas = new Preferidas();


        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }


        for (int i = 0; i < 5000; i++) {
            podcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            podcast.curte();
        }

        while (opcao != 4) {
            //Sempre que executado, o terminal irá mostrar esses valores abaixo, podendo escolher o que fazer
            System.out.println("1 - Adicionar musica");
            System.out.println("2 - Adicionar podcast");
            System.out.println("3 - listar playlist");
            System.out.println("4 - Sair\n");
            System.out.println("Digite a opção desejada");
            opcao = entrada.nextInt();

            //Método que define para onde vai cada escolha
            //Ao digitar a música e artista/ podcast e host, não utilizar espaços
            if (opcao == 1) {
                System.out.println("<---------------------->");
                System.out.println("Digite a música");
                minhaMusica.setTitulo(entrada.nextLine());
                System.out.println("Digite o artista");
                minhaMusica.setArtista(entrada.nextLine());
                System.out.println("<---------------------->");

            }else if (opcao == 2) {
                System.out.println("<---------------------->");
                System.out.println("Digite o podcast");
                podcast.setTitulo(entrada.next());
                System.out.println("Digite o host");
                podcast.setHost(entrada.next());
                System.out.println("<---------------------->");

            }else if (opcao == 3) {
                System.out.println(minhaMusica.getTitulo() + " - " + minhaMusica.getArtista());
                System.out.println(podcast.getTitulo() + " - " + podcast.getHost());

                preferidas.inclui(podcast);
                preferidas.inclui(minhaMusica);

            }else if (opcao == 4) {
                System.out.println("Aplicação encerrada");
                break;
            }else{
                System.out.println("Valor não encontrado!");
            }
        }




    }
}