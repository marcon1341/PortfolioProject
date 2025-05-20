import java.util.ArrayList;
import java.util.List;

public class Portfolio {
    private String name;
    private String owner;
    private List<Valuable> valuables;

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
        this.valuables = new ArrayList<>();
    }
    public void add(Valuable v){
        valuables.add(v);
    }
    public double getValue(){
        double total = 0;
        for(Valuable v: valuables){
            total += v.getValue();
        }
        return total;
    }
}