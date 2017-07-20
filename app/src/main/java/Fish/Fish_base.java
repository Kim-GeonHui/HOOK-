package Fish;

/**
 * Created by tahm_ on 2017-07-12.
 */

public class Fish_base {
    private String name;
    private long fish_code;
    private int respon_map;
    private double respon_percent;
    private double catch_percent;
    private int price;
    private int hidden;

    public Fish_base(String name, long fish_code, int respon_map, double respon_percent, double catch_percent, int price, int hidden) {
        this.name=name;
        this.fish_code=fish_code;
        this.respon_map=respon_map;
        this.respon_percent=respon_percent;
        this.catch_percent=catch_percent;
        this.price=price;
        this.hidden=hidden;
    }

    public double get_catch_percent(Fish_base fish) {
        return fish.catch_percent;
    }

    public String get_name(Fish_base fish) {
        return fish.name;
    }

    public int get_price(Fish_base fish) {
        return fish.price;
    }

}
