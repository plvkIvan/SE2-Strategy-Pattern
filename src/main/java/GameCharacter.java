public abstract class GameCharacter {
    private WeaponBehavior weapon;

    public GameCharacter(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

    public void fight() {
        weapon.useWeapon();
    }
}
