public class Ingresso {
    private float valor;

    public Ingresso() {
    }

    public Ingresso(float valor) {
        this.valor = valor;
    }

    public float getValor() {
        return this.valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }


    @Override
    public String toString() {
        return "{" +
            "valor='" + getValor() + "'" +
            "}";
    }


}
