public class Instagram extends RedeSocial{
    public Instagram (String senha, int numAmigos){
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto() {
        System.out.println("Uma foto foi publicada no Instagram");
    }

    @Override
    public void postarVideo() {
        System.out.println("Um vídeo foi publicado no Instagram");
    }

    @Override
    public void postarComentario() {
        System.out.println("Um comentário foi publicado no Instagram");
    }

    @Override
    public void curtirPublicacao() {
        super.curtirPublicacao();
    }
}
