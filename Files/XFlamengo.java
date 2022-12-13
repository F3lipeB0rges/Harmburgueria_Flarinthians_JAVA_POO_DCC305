public class XFlamengo extends Estocavel{
     //Metodo construtor
    public XFlamengo(){
        super("X-Flamengo", 28.00);
    }
    //Checar se há insumos o suficiente para o preparo do hamburguer
    @Override
    public void checarEstoque() throws EstoqueInsuficienteException{
        super.checarEstoque(super.getNome(), super.getPao(), super.getQueijo(), super.getCarne(), super.getBacon(), super.getTomate(), super.getBarbecue());
    }
    //Decremento dos insumos utilizados no hamburguer
    @Override
    public void retirar() {
        try {
            
            this.checarEstoque();

            super.setPao(super.getPao()-1);
            super.setQueijo(super.getQueijo()-1);
            super.setCarne(super.getCarne()-1);
            super.setBacon(super.getBacon()-1);
            super.setTomate(super.getTomate()-1);
            super.setBarbecue(super.getBarbecue()-1);

        } catch (EstoqueInsuficienteException e) {



        }
    }
}
