public class Main {
    static void main(String[] args) {
        GameCharacter character1 = new Knight();
        GameCharacter character2 = new Troll();

        character1.fight();
        character2.fight();

        character1.setWeapon(new AxeBehavior());

        character1.fight();
        character2.fight();
    }
}
