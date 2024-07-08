public class Iphone implements reprodutorMusical, aparelhoTelefonico, navegadorInternet {

    @Override
    public void tocarMusica() {
        System.out.println("Tocando Música...");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando música....");
    }

    @Override
    public void avancarFaixa() {
        System.out.println("Avançando para a próxima faixa.....");
    }

    @Override
    public void voltarFaixa() {
        System.out.println("Voltando para faixa anterior....");
    }

    @Override
    public void fazerLigacao(String numero) {
        System.out.println("Ligando para " + numero + "...");
    }

    @Override
    public void receberLigacao(String numero) {
        System.out.println("Recebendo ligação de " + numero + "....");
    }

    @Override
    public void desligarLigacao() {
        System.out.println("Desligando a ligação...");
    }

    @Override
    public void abrirPagina(String url) {
        System.out.println("Abrindo página: " + url);
    }

    @Override
    public void fecharPagina() {
        System.out.println("Fechando página atual.");
    }

    @Override
    public void navegarHistorico() {
        System.out.println("Navegando pelo histórico da Web");
    }

    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();

        meuIphone.tocarMusica();
        meuIphone.avancarFaixa();
        meuIphone.fazerLigacao("21970222861");
        meuIphone.abrirPagina("feegow.com");
    }
    
}
