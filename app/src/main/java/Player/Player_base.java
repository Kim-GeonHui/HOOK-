package Player;

/**
 * Created by tahm_ on 2017-07-14.
 */

public class Player_base {
    int money;
    int rod_level;
    int check_bait;
    int count_bait_normal;
    int count_bait_hidden;
    int plus_percent;

    public Player_base(int money, int rod_level, int check_bait, int count_bait_normal, int count_bait_hidden, int plus_percent) {
        this.money=money;
        this.rod_level=rod_level;
        this.check_bait=check_bait;
        //0은 아무 미끼도 없는것. 1은 기본미끼만. 2는 고급미끼만. 3은 둘다
        this.count_bait_normal=count_bait_normal;
        this.count_bait_hidden=count_bait_hidden;
        this.plus_percent=plus_percent;
    }

    public int get_check_bait() {
        return check_bait;
    }

    public int get_plus_percent() {
        return plus_percent;
    }

    public int get_rod_level() { return rod_level; }

    public int choice_bait() {
        if (check_bait==2) {
            return 0;
        }
        else {
            return 0;
        }
    }

}
