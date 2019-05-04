package Modelo;
//@author d518615
public class Celcius extends absPropriedades
{

    public Celcius(Double valorTemperatura)
    {
        super(valorTemperatura);
    }

    @Override
    public void Executar()
    {
        this.resultado = this.valorTemperatura * 1.8 + 32;
    }
    
}
