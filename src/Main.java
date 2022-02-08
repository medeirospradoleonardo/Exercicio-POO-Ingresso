public class Main {
    

    public static void main(String[] args){
        Ingresso ingresso1 = new Ingresso();
        ingresso1.setValor(40);
        System.out.println(ingresso1.toString());

        IngressoVip ingresso2 = new IngressoVip();
        ingresso2.setValor(40);
        ingresso2.setValorAdicional(20);
        System.out.println(ingresso2.toString());
    }

}
