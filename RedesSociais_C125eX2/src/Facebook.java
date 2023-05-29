public class Facebook  extends RedeSocial implements VideoConferencia, Compartilhamento{
    public Facebook (String senha, int numAmigos){
        super(senha,numAmigos);
    }
@Override
public void postarFoto(){
    System.out.println("Uma foto foi publicada no Facebook");
}
@Override
public void postarVideo(){
    System.out.println("Um vídeo foi publicado no Facebook");
}

    @Override
    public void postarComentario() {
        System.out.println("Um comentário foi publicado no Facebook");
    }

    @Override
    public void curtirPublicacao() {
        super.curtirPublicacao();
    }

    @Override
    public void compartilhar() {
        System.out.println("Está compatilhando uma foto no Facebook");
    }

    @Override
    public void fazStreming() {
        System.out.println("Está fazendo um vídeo conferência");

    }
}
