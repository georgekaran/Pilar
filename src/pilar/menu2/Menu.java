package pilar.menu2;

import java.util.ArrayList;
import pilar.menu2.MenuItem;
import pilar.Entrada;

public class Menu
{
    private ArrayList<MenuItem> opções;

    public Menu(ArrayList<MenuItem> opções)
    {
        this.opções = opções;    
    }
    
    public Menu()
    {
        this.opções = new ArrayList();
    }
            
            

    public void adicionar(MenuItem item)
    {
        opções.add(item);
    }
    
    public ArrayList<MenuItem> getOpções()
    {
        return opções;
    }

    public void setOpções(ArrayList<MenuItem> op)
    {
        this.opções = op;
    }
    
   

    public void gerar()
    {
        String m = "*** M E N U ***\n\n";
                
        for (MenuItem op: opções)
        {
            m += "["+op.getAtalho()+"] "+op.getDescrição()+"\n";
        }
  
        char atalho = ' ';
        while (atalho != opções.get(opções.size()-1).getAtalho())
        {
            atalho = Entrada.leiaChar(m);
            
            for (MenuItem opção: opções)
            {
                if (opção.getAtalho() == atalho)
                {
                    opção.getAção().executar();
                }
            }
        }
        
        
    }
    
    
}
