import java.util.ArrayList;
import java.util.List;

public class Iphone {

    interface ReprodutorMusical {
        void tocar();
        void pausar();
        void selecionarMusica(String musica);
    }

    interface AparelhoTelefonico {
        void ligar(String numero);
        void atender();
        void iniciarCorreioVoz();
    }

    interface NavegadorInternet {
        void exibirPagina(String url);
        void adicionarNovaAba(String url);
        void atualizarPagina();
    }

    class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
        private List<String> musicas;
        private boolean tocando;
        private boolean ligado;
        private String estado;
        private List<String> paginasAbertas;

        @Override
        public void tocar() {
            if (musicas != null && !musicas.isEmpty()) {
                System.out.println("Tocando a música: " + musicas.get(0));
            } else {
                System.out.println("Nenhuma música disponível para tocar.");
            }
        }

        @Override
        public void pausar() {
            System.out.println("Música pausada.");
        }

        @Override
        public void selecionarMusica(String musica) {
            if (musicas.contains(musica)) {
                System.out.println("Selecionando música: " + musica);
            } else {
                System.out.println("Música não encontrada.");
            }
        }

        @Override
        public void ligar(String numero) {
            System.out.println("Chamando o número: " + numero);
        }

        @Override
        public void atender() {
            System.out.println("Atendendo chamada.");
        }

        @Override
        public void iniciarCorreioVoz() {
            System.out.println("Iniciando correio de voz.");
        }

        @Override
        public void exibirPagina(String url) {
            System.out.println("Exibindo página: " + url);
        }

        @Override
        public void adicionarNovaAba(String url) {
            paginasAbertas.add(url);
            System.out.println("Nova aba adicionada com a página: " + url);
        }

        @Override
        public void atualizarPagina() {
            System.out.println("Página atualizada.");
        }

        public IPhone() {
            musicas = new ArrayList<>();
            musicas.add("Música 1");
            musicas.add("Música 2");
            musicas.add("Música 3");

            estado = "Desligado";
            paginasAbertas = new ArrayList<>();
        }
    }

    /*
    public static void main(String[] args) {
        Iphone iPhone = new Iphone();

        iPhone.ligar("123456789");
        iPhone.atender();
        iPhone.tocar();
        iPhone.selecionarMusica("Música 2");
        iPhone.exibirPagina("https://www.example.com");
        iPhone.adicionarNovaAba("https://www.example2.com");
        iPhone.atualizarPagina();
    }
    */
}
