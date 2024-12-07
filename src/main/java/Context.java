public class Context {


    private Strategy strategy=new StrategyImplDefault();
    public void perform(){
        System.out.println("###### Début de l'opération ######");
        System.out.println("******************* Initialisation ***************************");
        strategy.apply();
        System.out.println("===============Netoyage=======================");

    }
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
