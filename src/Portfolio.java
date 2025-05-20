import java.util.ArrayList;
import java.util.List;

public class Portfolio {
    private String name;
    private String owner;
    private List<Valuable> assetes;

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
        this.assetes = new ArrayList<>();
    }
    public void add(Valuable asset){
        assetes.add(asset);
    }
    public double getValue(){
        double total = 0;
        for(Valuable assete: assetes){
            total += assete.getValue();
        }
        return total;
    }
    public Valuable getMostValuable(){
       if(assetes.isEmpty()) return null;
       Valuable mostValuable = assetes.get(0);
       for(Valuable asset: assetes){
           if(asset.getValue() > mostValuable.getValue()){
               mostValuable  = asset;
           }
       }
       return mostValuable;
    }
    public Valuable getLeastValuable(){
        if(assetes.isEmpty())return  null;
        Valuable leastValuable = assetes.get(0);
        for(Valuable asset:assetes){
            if(asset.getValue()< leastValuable.getValue()){
                leastValuable = asset;
            }
        }
        return leastValuable;
    }
}