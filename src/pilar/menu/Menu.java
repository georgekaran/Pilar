package pilar.menu;

import pilar.Entrada;

public class Menu
{
    private MenuModel model;
    private char[] atalhos;  
    private String[] opções;    

    public Menu(char[] atalhos, String[] opções, MenuModel model)
    {
        this.atalhos = atalhos;
        this.opções = opções;
        this.model = model;
    }

    public String[] getOpções()
    {
        return opções;
    }

    public void setOpções(String[] opções)
    {
        this.opções = opções;
    }
    
    
    public void exibir()
    {
        String m = "*** M E N U ***\n\n";
        for (int i = 0; i < atalhos.length; i++)
        {
            m += "["+atalhos[i]+"] "+opções[i]+"\n";
        }
        
        char op = ' ';
        while (op != atalhos[atalhos.length-1])
        {
            op = Entrada.leiaChar(m);
            model.executar(op);
        }
        
        
    }
    
    
}
