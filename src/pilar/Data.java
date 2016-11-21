package pilar;

import java.util.Calendar;

public class Data
{

    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano)
    {
        this.dia = 1;
        this.mes = 1;
        this.ano = 1980;
        setData(dia, mes, ano);
    }
    
    public Data(String dt)
    {
        this.dia = 1;
        this.mes = 1;
        this.ano = 1980;
        
        String[] vet = dt.split("/");
        
        if (vet.length == 3)
        {
            int d = Integer.parseInt(vet[0]);
            int m = Integer.parseInt(vet[1]);
            int a = Integer.parseInt(vet[2]);
            setData(d, m, a);
        }
    }
    
    
    public boolean equals(Data dt)
    {
        return (dt.dia == dia && dt.mes == mes && dt.ano == ano);
    }

    public String getDataFormatada(int formato)
    {
        String df = "";

        if (formato == 1)
        {

            if (dia < 10)
            {
                df = "0" + dia + "/";
            } else
            {
                df = "" + dia + "/";
            }
            if (mes < 10)
            {
                df = df + "0" + mes + "/" + ano;
            } else
            {
                df = df + mes + "/" + ano;
            }
        }
        if (formato == 2)
        {
            if (mes < 10)
            {
                df = ano+"/0"+mes+"/";
            } else
            {
                df = ano+"/"+mes+"/";
            }
            if (dia < 10)
            {
                df = df + "0" + dia;
            } else
            {
                df = df + dia ;
            }
        }
        return df;
    }

    public Data()
    {
        Calendar x = Calendar.getInstance();
        this.dia = x.get( Calendar.DAY_OF_MONTH );
        this.mes = x.get( Calendar.MONTH )+1;
        this.ano = x.get( Calendar.YEAR );
    }

    public void setData(int dia, int mes, int ano)
    {
        if (Data.validarData(dia, mes, ano))
        {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }
    }

    public int getAno()
    {
        return ano;
    }

    public void setAno(int ano)
    {
        if (Data.validarData(this.dia, this.mes, ano))
        {
            this.ano = ano;
        }
    }

    public int getDia()
    {
        return dia;
    }

    public void setDia(int dia)
    {
        if (Data.validarData(dia, this.mes, this.ano))
        {
            this.dia = dia;
        }
    }

    public int getMes()
    {
        return mes;
    }

    public void setMes(int mes)
    {
        if (Data.validarData(this.dia, mes, this.ano))
        {
            this.mes = mes;
        }

    }

    public static boolean validarData(int dia, int mes, int ano)
    {
        boolean ok = false;
        int[] dmax =
        {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        };

        if (ano > 0)
        {
            if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0))
            {
                dmax[1] = 29;
            }
            if (mes >= 1 && mes <= 12)
            {
                if (dia >= 1 && dia <= dmax[mes - 1])
                {
                    ok = true;
                }
            }
        }
        return ok;
    }
    
    public int compareTo( Data dt )
    {
        int ret = 0;
        
        String s1 = this.getDataFormatada(2);
        String s2 = dt.getDataFormatada(2);
        
        if (s1.compareTo(s2) > 0)
        {
            ret = 1;
        }
        else if (s1.compareTo(s2) < 0)
        {
            ret = -1;
        }
        return ret;
    }
    

}
