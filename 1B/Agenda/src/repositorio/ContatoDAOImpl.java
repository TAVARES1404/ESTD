package repositorio;

import entidade.Contato;
import java.util.HashMap;
import java.util.Map;

public class ContatoDAOImpl implements ContatoDAO{

    final Map<Integer, Contato> dados = new HashMap<Integer, Contato>();
    final Map<Integer, PilhaEstatica> historico = new HashMap<Integer, PilhaEstatica>();

    private static int contador;

    @Override
    public void adicionar(Contato c) {
        contador++;
        c.setId(contador);
        dados.put(c.getId(),c);
        historico.put(c.getId(), new PilhaEstatica(10));
    }

    public void atualizar(Contato c) {
        Contato antigo = dados.get(c.getId());

        PilhaEstatica pilha = historico.get(c.getId());

       try {
           pilha.push(antigo);
        } catch (PilhaCheiaException e) {
           System.out.println("pilha cheia");
        }
        
        dados.replace(c.getId(), c);
    }

    @Override
    public void deletarPeloId(int id) {
        dados.remove(id);
    }

    @Override
    public Contato obterPeloId(int id) {
        return dados.get(id);
        
    }

    @Override
    public void obterTodos(){
        System.out.println("Obtendo  os registros");
        System.out.println(dados);
    
    }

    @Override
    public void desfazer(int id) {

        PilhaEstatica pilha = historico.get(id);

        try {
            Contato contato = (Contato) pilha.pop();
            
            dados.replace(id,contato);
        } catch (PilhaVaziaException e) {
            // TODO Auto-generated catch block
            System.out.println("erro");
        }

        

       

        System.out.println("estou aqui");
        
    }

}
