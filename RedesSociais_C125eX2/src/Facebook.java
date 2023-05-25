public abstract class Facebook  extends RedeSocial implements VideoConferencia, Compartilhamento{
    @Override
    public void compartilhar() {
        System.out.println("Está compatilhando uma foto no Facebook");
    }

    @Override
    public void fazStreming() {
        System.out.println("Está fazendo um vídeo conferência");

    }
}
