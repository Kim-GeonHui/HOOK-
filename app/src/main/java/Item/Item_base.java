package Item;

/**
 * Created by tahm_ on 2017-07-12.
 */

public class Item_base {
    private String name;
    private int item_code;
    private int level;
    private int price;
    private int plus_percent;

    public Item_base(String name, int item_code, int level, int price, int plus_percent) {
        this.name = name;
        this.item_code = item_code;
        this.level=level;
        this.price=price;
        this.plus_percent=plus_percent;
    }


}
