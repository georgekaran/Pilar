package pilar.menu2;

public class MenuItem
{
    private char atalho;
    private String descrição;
    private MenuItemAction ação;

    public MenuItem(char atalho, String descrição, MenuItemAction ação)
    {
        this.atalho = atalho;
        this.descrição = descrição;
        this.ação = ação;
    }

    public MenuItemAction getAção()
    {
        return ação;
    }

    public void setAção(MenuItemAction ação)
    {
        this.ação = ação;
    }

    public char getAtalho()
    {
        return atalho;
    }

    public void setAtalho(char atalho)
    {
        this.atalho = atalho;
    }

    public String getDescrição()
    {
        return descrição;
    }

    public void setDescrição(String descrição)
    {
        this.descrição = descrição;
    }
    
    
    
}
