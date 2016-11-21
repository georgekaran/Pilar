package pilar.menu2.exemplo;

import pilar.menu2.MenuItemAction;

public class Acao01 implements MenuItemAction
{

    @Override
    public void executar()
    {
        System.out.println("Eu sou a opção 01");
        System.out.println("fui comer pastel!!!");
    }
    
}
