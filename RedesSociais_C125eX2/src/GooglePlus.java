public class GooglePlus extends RedeSocial implements VideoConferencia, Compartilhamento{
    public GooglePlus (String senha, int numAmigos){
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto() {
        System.out.println("Uma foto foi postada no GooglePlus");
    }

    @Override
    public void postarVideo() {
        System.out.println("Um vídeo foi postado no GooglePlus");
    }

    @Override
    public void postarComentario() {
        System.out.println("Um comentário foi postado no GooglePlus");
    }

    @Override
    public void curtirPublicacao() {
        super.curtirPublicacao();
    }

    @Override
    public void compartilhar() {
        System.out.println("Foi compartilhado um post do GooglePlus");
    }

    @Override
    public void fazStreming() {
        System.out.println("Está fazendo um vídeo conferência");

    }
}
