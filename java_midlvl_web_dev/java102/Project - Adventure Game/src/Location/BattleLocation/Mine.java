package Location.BattleLocation;

import Obstacle.Snake;
import Player.Player;

public class Mine extends BattleLocation {

    public Mine(Player player) {
        super(player, "Mine", new Snake(), "None", 5);
    }
    
}
