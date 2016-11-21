package pilar.menu.exemplo;

import pilar.menu.Menu;

public class Principal
{
    public static void main(String[] args)
    {
        char[] atalhos = { 'o','f','l','s','x' };
        String[] descr = { "Ligar", "Desligar",
        "Levantar", "Dormir", "Sair" };
        MeuMenuDoMeuSistema m = new MeuMenuDoMeuSistema();

        Menu menu = new Menu(atalhos,descr,m);
        
        menu.exibir();
        
    }
}
