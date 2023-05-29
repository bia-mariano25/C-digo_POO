import java.lang.reflect.Array;
import java.util.ArrayList;

public class Usuario{
    protected String nome;
    protected String email;
    protected RedeSocial[] RedesSociais;

    public Usuario (String nome, String email)
    {
        this.nome = nome;
        this.email = email;
    }
    ArrayList<RedeSocial> Redesociais = new ArrayList<>();
   public void Usuario (RedeSocial[] redeSociais){ //um array list para adicionar as redes sociais do usuário
      for (RedeSocial s: redeSociais){ //for each
          Redesociais.add(s);
      }
}


}
