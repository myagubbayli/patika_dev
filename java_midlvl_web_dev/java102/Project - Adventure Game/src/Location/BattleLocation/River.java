package Location.BattleLocation;

import Obstacle.Bear;
import Player.Player;

public class River extends BattleLocation {
    public River(Player player) {
        super(player, "River", new Bear(), "Water", 2);
    }
}
