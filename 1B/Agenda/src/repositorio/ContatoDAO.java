package repositorio;

import entidade.Contato;

public interface ContatoDAO {

    void adicionar(Contato c);
    void atualizar(Contato c);
    void deletarPeloId( int id);
    Contato obterPeloId( int id);
    void desfazer(int id);
    void obterTodos();
   
}

