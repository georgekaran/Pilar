package pilar.menu2.exemplo;

import pilar.menu2.Menu;
import pilar.menu2.MenuItem;
import pilar.menu2.MenuItem;

public class Principal
{
    public static void main(String[] args)
    {
//        MenuItemAction ação01 = new Acao01();
//        MenuItemAction ação02 = new AcaoTwo();
//        
//        MenuItem op1 = new MenuItem('a',"Descrição do item 1",ação01);
//        MenuItem op2 = new MenuItem('b',"Descrição do item 2",ação02);
        
//        ****************       
        
//        MenuItem op1 = new MenuItem('a',"Descrição do item 1",new Acao01());
//        MenuItem op2 = new MenuItem('b',"Descrição do item 2",new AcaoTwo());
//        
//        Menu menu = new Menu();
//        menu.adicionar(op1);
//        menu.adicionar(op2);
//        menu.gerar();
               
        Menu menu = new Menu();
        menu.adicionar(new MenuItem('a',"Descrição do item 1",new Acao01()));
        menu.adicionar(new MenuItem('b',"Descrição do item 2",new AcaoTwo()));
        menu.gerar();
        
        
        System.exit(0);
    }
}
