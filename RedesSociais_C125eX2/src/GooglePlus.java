public abstract class GooglePlus extends RedeSocial implements VideoConferencia, Compartilhamento{
    @Override
    public void compartilhar() {
        System.out.println("Está compatilhando uma informação");
    }

    @Override
    public void fazStreming() {
        System.out.println("Está fazendo um vídeo conferência");

    }
}
