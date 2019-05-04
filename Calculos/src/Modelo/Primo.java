package Modelo;

public class Primo extends absPropriedades implements intMetodos
{

    public Primo(int numero)
    {
        super(numero);
        Executar();
    }
    

    @Override
    public void Executar()
    {
        this.resposta = "É primo";
        for (int i = 2; i < getNumero() / 2 + 1; i++)
        {
            if (getNumero()% i == 0)
            {
                this.resposta = "Não é primo";
                break;
            }
        }
    }
    
}
