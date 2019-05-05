
package trabalhocadastro;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class TrabalhoCadastro {

    
    
    ArrayList <Alunos> cadastro = new ArrayList();
    
    public static void main(String[] args) {
        
        
        TrabalhoCadastro obj = new  TrabalhoCadastro();
        String nome, email,cidade,uf;
        int codigo,quantidade,opc = 0;
         
        
         
     
     do{
         JOptionPane.showMessageDialog(null,"Cadastro de alunos.");
         opc= Integer.parseInt(JOptionPane.showInputDialog("escolha uma opção\n1=cadastrar alunos\n2=Consultar tamanho da fila \n3=Exluir\n4=listar\n5=Sair. "));
         
        
  switch (opc){         // cadastro de alunos
         case 1 :
     
   do{
         nome= JOptionPane.showInputDialog("digite o seu nome");
         codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite seu codigo "));
         email= JOptionPane.showInputDialog("digite o seu E-mail");
         cidade= JOptionPane.showInputDialog("digite o sua Cidade");
         uf= JOptionPane.showInputDialog("digite o seu Estado");
         obj.cadastro.add(new Alunos(nome,codigo,email,cidade,uf));
         
         JOptionPane.showMessageDialog(null, "cadastro salvo.\n clique em ok para continuar ");
         }while("1".equals(JOptionPane.showInputDialog("digite 1 para continuar inserindo ou 2 para sair")));
   
  }
    
   
           
     switch (opc){
         case 4 :             //visualizar lista;
             if(obj.cadastro.size()==0){
               JOptionPane.showMessageDialog(null, "Lista vazia");
   }else{
                
         for(int i=0;i<obj.cadastro.size();i++){
             JOptionPane.showMessageDialog (null,obj.cadastro.get(i).nome);
             JOptionPane.showMessageDialog (null,obj.cadastro.get(i) .codigo);
             JOptionPane.showMessageDialog (null,obj.cadastro.get(i).email);
             JOptionPane.showMessageDialog (null,obj.cadastro.get(i).cidade);
             JOptionPane.showMessageDialog (null,obj.cadastro.get(i).uf);
          
             break ;
         }
         }
   }
     
     
     switch (opc){      // remover
         case  3 :
             int remover;
             remover= Integer.parseInt(JOptionPane.showInputDialog("digite 1 para apagar "));
            if(remover>obj.cadastro.size()){
                JOptionPane.showMessageDialog(null,"Numero invalido");
                
     }if (remover==1 ){
             obj.cadastro.remove(0);
 
          
     break;}
     }
      
                 switch (opc){  // tamanho da lista 
            case 2 :
                JOptionPane.showMessageDialog(null,"o tamanho da lista é : "+ obj.cadastro.size() );
                break;
        }
         
        
     
     
     
     
     
     }while(opc==1|| opc==2 || opc == 3 || opc== 4);
                
    }
        
}


