package Modelo;
//@author d518615
public class Controle extends absPropriedades
{

    public Controle(String valor, String tipoCalculo)
    {
        super(valor, tipoCalculo);
    }

    @Override
    public void Executar()
    {

    absPropriedades validacao = new Validacao (this.valor);
      if (validacao.toString().equals(""))
      {
          if (tipoCalculo.equals("CF"))
                  {
                      Fahrenheit fahrenheit = new Fahrenheit (validacao.valorTemperatura);
                      this.mensagem = fahrenheit.resultado.toString();
                  }
          if (tipoCalculo.equals("FC"))
          {
              Celcius celcius = new Celcius (validacao.valorTemperatura);
                      this.mensagem = celcius.resultado.toString();
          }
          //absPropriedades fahnheit = new Fahrenheit(validacao.valorTemperatura);
              //this.resposta = fahnheit.resultado.toString();
      }
    }
    
}
