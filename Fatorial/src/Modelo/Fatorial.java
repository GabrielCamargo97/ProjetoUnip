package Modelo;

public final class Fatorial extends absPropriedades implements intMetodos
{

    public Fatorial(Integer num)
    {
        super(num);
        Executar();
    }

    @Override
    public void Executar()
    {
        int base = this.num;
        for (int i = 1; i < base; i++)
        {
            this.num *= i;
        }
        if (this.num == 0) this.num = 1;
    }

}
