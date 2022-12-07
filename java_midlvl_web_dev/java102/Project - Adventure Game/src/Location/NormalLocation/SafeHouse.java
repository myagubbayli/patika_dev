package Location.NormalLocation;

import Player.Player;

public class SafeHouse extends NormalLocation {
    public SafeHouse(Player player) {
        super(player, "Safe House");
    }

    @Override
    public boolean onLocation() {
        System.out.println("You are in the Safe House!");
        System.out.println("Your health is recovered!");
        this.getPlayer().setHealth(this.getPlayer().getOriginalHealth());
        return true;
    }
}
