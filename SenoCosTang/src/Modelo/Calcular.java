package Modelo;
//@author d518615
public class Calcular extends absPropriedades
{
    public Calcular(Double n1)
    {
        super(n1);
    }
    
    @Override
    public void Executar()
    {
        this.seno = Math.sin(Math.toRadians(n1));
        this.cosseno = Math.cos(Math.toRadians(n1));
        this.tangente = Math.tan(Math.toRadians(n1));
        
        this.resposta = "<html>Seno =" + this.seno + "<br>Cosseno =" + this.cosseno
                + "<br>Tangente ="+ this.tangente +"</html>";
    }
}
