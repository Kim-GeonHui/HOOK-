package Fish;

/**
 * Created by tahm_ on 2017-07-12.
 */

public class Fish_base {
    private String name;
    private long fish_code;
    private int respon_map;
    private double respon_percent;
    private double up_hp;
    private int price;
    private int hidden;

    public Fish_base(String name, long fish_code, int respon_map, double respon_percent, double up_hp, int price, int hidden) {
        this.name=name;
        this.fish_code=fish_code;
        this.respon_map=respon_map;
        this.respon_percent=respon_percent;
        this.up_hp=up_hp;
        this.price=price;
        this.hidden=hidden;
    }

    public double get_catch_percent(Fish_base fish) {
        return fish.up_hp;
    }

    public String get_name(Fish_base fish) {
        return fish.name;
    }

    public int get_price(Fish_base fish) {
        return fish.price;
    }

    public double get_up_hp (Fish_base fish) {
        return fish.up_hp;
    }

}
