public class IngressoVip extends Ingresso{
    private float valorAdicional;

    public IngressoVip() {
    }


    public IngressoVip(float valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public float getValorAdicional() {
        return this.valorAdicional;
    }

    public void setValorAdicional(float valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    @Override
    public String toString() {
        return "{" +
            "valor='" + (getValorAdicional()+getValor()) + "'" +
            "}";
    }



}