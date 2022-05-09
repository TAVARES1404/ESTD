package repositorio;

public class PilhaEstatica {

    private Object vetor[];
    private int topo;
    
    
    public PilhaEstatica(int tamanho){
        vetor = new Object[tamanho];
    }

    public boolean isVazia(){
        return topo ==0; 
    }

    public boolean isCheia(){
        return vetor.length == topo;
    }

    public void push(Object valor) throws PilhaCheiaException{

        if(isCheia()){
            throw new PilhaCheiaException();
        }else{
            vetor [topo++] = valor;
        }
       
        
    }

    public Object pop() throws PilhaVaziaException{
        if(isVazia()){
            throw new PilhaVaziaException();
        }else{
            Object valor = vetor[--topo];
            return valor;    
        }
    }
    
}
