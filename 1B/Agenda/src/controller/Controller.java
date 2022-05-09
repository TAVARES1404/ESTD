package controller;

import java.util.Scanner;

import entidade.Contato;
import repositorio.Repositorio;

public class Controller {

    public void adicionarContato(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome do contato:");
        String nome = scan.next();
        System.out.println("Digite o telefone do(a) " + nome + ":");
        String telefone = scan.next();
        System.out.println("Digite o e-mail do(a) " + nome + ":");
        String email = scan.next();
        Contato contato = new Contato(nome, telefone, email);
        Repositorio.obterInstancia().contato().adicionar(contato);
        
    }

    public void alterarContato(){

        Repositorio.obterInstancia().contato().obterTodos();

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o Id do Contato a ser atualizado:");
        int id = scan.nextInt();
        System.out.println("Digite o nome do contato:");
        String nome = scan.next();
        System.out.println("Digite o telefone do(a) " + nome + ":");
        String telefone = scan.next();
        System.out.println("Digite o e-mail do(a) " + nome + ":");
        String email = scan.next();
        Contato contato = new Contato(nome, telefone, email);
        contato.setId(id);
       
        Repositorio.obterInstancia().contato().atualizar(contato);
       
    }

    public void excluirContato(){

        Repositorio.obterInstancia().contato().obterTodos();

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o Id do Contato a ser deletado:");
        int id = scan.nextInt();

        Repositorio.obterInstancia().contato().deletarPeloId(id);
            
    }

    public void consultarContatos(){
        
        Repositorio.obterInstancia().contato().obterTodos();
    }

    public void desfazer(){
        
        Repositorio.obterInstancia().contato().obterTodos();

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o Id do Contato a ser atualizado:");
        int id = scan.nextInt();

        Repositorio.obterInstancia().contato().desfazer(id);

    }
    
}
