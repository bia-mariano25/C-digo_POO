public class Twitter extends RedeSocial implements Compartilhamento{
   public Twitter (String senha, int numAmigos){
       super(senha,numAmigos);
   }

    @Override
    public void postarFoto() {
        System.out.println("Uma foto foi publicada no Twitter");
    }

    @Override
    public void postarVideo() {
        System.out.println("Um vídeo foi publicado no Twitter");
    }

    @Override
    public void postarComentario() {
        System.out.println("Um comentário foi publicado no Twitter");
    }

    @Override
    public void curtirPublicacao() {
        super.curtirPublicacao();
    }

    @Override
    public void compartilhar() {
        System.out.println("Está compartilhando uma foto no Twitter");
    }


}
