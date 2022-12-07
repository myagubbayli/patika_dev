package Location.BattleLocation;

import Obstacle.Vampire;
import Player.Player;

public class Forest extends BattleLocation {
    public Forest(Player player) {
        super(player, "Forest", new Vampire(), "Firewood", 3);
    }
}
