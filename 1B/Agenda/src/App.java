import java.util.Scanner;

import controller.Controller;

public class App {

    public static void main(String[] args) throws Exception {

        boolean out = false;
        
        while (out==false) {

            Scanner scan = new Scanner(System.in);

            App.menu();
    
            int index = scan.nextInt();
            Controller controller = new Controller();

            switch(index){
                case 1:
                    controller.adicionarContato();
                    break;
                case 2:
                    controller.alterarContato();
                    break;
                case 4:
                    controller.consultarContatos();
                    break;
                case 3:
                    controller.excluirContato();
                    break;
                case 5:
                    controller.desfazer();
                    break;
                default:
                    out = true;
                    break;
                    

            }
            
        }
        
    }

    public static void menu(){

        System.out.println("Digite A Opção Desejada:");
        System.out.println("===============================");
        System.out.println("1 - Adcionar Contato");
        System.out.println("2 - Editar Contato");
        System.out.println("3 - Excluir Contato");
        System.out.println("4 - Consultar Contatos");
        System.out.println("5 - Desfazer");  
        System.out.println("6 - Sair");
        System.out.println("===============================");
    }
}
