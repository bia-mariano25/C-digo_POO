public class Main {
    public static <NullPointerException> void main(String[] args) {
        //criando redes sociais e o vetor redes sociais
      RedeSocial twitter = new Twitter("inatelC125",200);
      RedeSocial instagram = new Instagram("C125INATEL", 470);
      RedeSocial[] redeSociais = new RedeSocial[6];

      redeSociais[0] = twitter;
      redeSociais[1] = instagram;

      Usuario usuario = new Usuario("Ana Mariano", "ana.mariano@geb.inatel.br");
      usuario.Usuario(redeSociais);
      for(int i = 0; i<redeSociais.length;i++){
          try{
              redeSociais[i].postarComentario();
          } catch (Exception e){
              System.out.println(e);
          }
          try {
              redeSociais[i].postarFoto();
          } catch (Exception e){
              System.out.println(e);
          }
          try {
              redeSociais[i].postarVideo();
          }catch (Exception e){
              System.out.println(e);
          }
      }
    }
}