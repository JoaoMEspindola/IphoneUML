public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet{
    @Override
    public void ligar(String contato) {
        AparelhoTelefonico.super.ligar(contato);
        System.out.println("Ligando para " + contato);
    }

    @Override
    public void atender() {
        AparelhoTelefonico.super.atender();
        System.out.println("Ligação atendida");
    }

    @Override
    public void iniciarCorreioVoz() {
        AparelhoTelefonico.super.iniciarCorreioVoz();
        System.out.println("Correio de voz");
    }

    @Override
    public void exibirPagina(String pagina) {
        NavegadorInternet.super.exibirPagina(pagina);
        System.out.println("Abrindo página " + pagina);
    }

    @Override
    public void adicionarNovaAba() {
        NavegadorInternet.super.adicionarNovaAba();
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        NavegadorInternet.super.atualizarPagina();
        System.out.println("Atualizando página");
    }

    @Override
    public void tocar() {
        ReprodutorMusical.super.tocar();
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        ReprodutorMusical.super.pausar();
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica(String musica) {
        ReprodutorMusical.super.selecionarMusica(musica);
        System.out.println("Selecionando musica " + musica);
    }
}
