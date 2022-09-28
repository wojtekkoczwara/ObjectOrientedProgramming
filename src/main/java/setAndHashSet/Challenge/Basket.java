package setAndHashSet.Challenge;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by dev on 17/02/2016.
 */
public class Basket {
    private final String name;
    private final Map<StockItem, Integer> list;

    public Basket(String name) {
        this.name = name;
        this.list = new TreeMap<>();
    }

    public int addToBasket(StockItem item, int quantity) {
        if ((item != null) && (quantity > 0)) {
            int inBasket = list.getOrDefault(item, 0);
            list.put(item, inBasket + quantity);
            return inBasket;
        }
        return 0;
    }

    public Map<StockItem, Integer> Items() {
        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString() {
        String s = "\nShopping basket " + name + " contains " + list.size() + ((list.size() == 1) ? " item" : " items") + "\n";
        double totalCost = 0.0;
        for (Map.Entry<StockItem, Integer> item : list.entrySet()) {
            s = s + item.getKey() + ". " + item.getValue() + " purchased\n";
            totalCost += item.getKey().getPrice() * item.getValue();
        }
        return s + "Total cost " + totalCost;
    }

    public void checkOutBasket(){
        for (Map.Entry<StockItem, Integer> entry: this.list.entrySet()) {
            entry.getKey().adjustStock(entry.getValue());
            entry.getKey().unReserveItem(entry.getValue());
        }
    }

    public int addToBasketWithReserve(String name, int quantity, StockList stockList) {
        StockItem item = stockList.get(name);
        if ((quantity > 0) && (stockList.reserveItem(name, quantity))) {
            int inBasket = list.getOrDefault(item, 0);
            list.put(item, inBasket + quantity);
            return inBasket;
        }
        return 0;
    }
    public int removeFromBasketWithUnReserve(String name, int quantity, StockList stockList) {
        StockItem item = stockList.get(name);
        Integer itemInBasket = this.list.get(item);
        if (itemInBasket == null || item == null){
            return 0;
        }
        if ((quantity > 0) && (stockList.unReserveItem(name, quantity)) && quantity < this.list.get(item)) {
            int inBasket = list.getOrDefault(item, 0);
            list.put(item, inBasket - quantity);
            return inBasket;
        } else if (this.list.get(item) == quantity){
            list.remove(item);
        }
        return 0;
    }


}