package pilar.menu.exemplo;

import pilar.menu.MenuModel;

public class MeuMenuDoMeuSistema implements MenuModel
{
    
    
    public void executar(char op)
    {
       if (op == 'l') 
       {
           System.out.println("Levantou");
       }
       else if (op == 'o')
       {
           System.out.println("Ligou");
       }
       else if (op == 'f')
       {
           System.out.println("Desligou");
       }
       else if (op == 's')
       {
           System.out.println("Dormiu");
       }
    }
    
}
