public abstract class Twitter extends RedeSocial implements VideoConferencia, Compartilhamento{
    @Override
    public void compartilhar() {
        System.out.println("Está compartilhando uma foto no Twitter");
    }


}
