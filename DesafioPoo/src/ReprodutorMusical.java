public class ReprodutorMusical implements Musica {

    private String musica = null;
    @Override
    public void tocar() {
        if (musica != null) {
            System.out.println("Tocando a musica: " + musica);
        } else {
            System.out.println("Tente selecionar uma música antes!");
        }
    }

    @Override
    public void pausar() {
        System.out.println("Musica Pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        this.musica = musica;
        System.out.println("Musica Selecionada: " + musica);
    }
}
