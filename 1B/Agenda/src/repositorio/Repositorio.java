package repositorio;

public class Repositorio{

    private static Repositorio instancia = null ;
    private final ContatoDAO contatoDaAO = new ContatoDAOImpl();

    public Repositorio() {
    }

    public static Repositorio obterInstancia(){

        if (instancia == null){
            instancia = new Repositorio();
        }
        return instancia;
    }

    public ContatoDAO contato(){

        return contatoDaAO;

    }


}
