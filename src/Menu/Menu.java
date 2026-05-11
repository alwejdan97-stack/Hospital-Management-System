package Menu;

import Utils.MenuMessage;

public class Menu implements MenuInterface {

    @Override
    public void displayMenu() {
        System.out.println(MenuMessage.MAIN_MENU_MESSAGE);
    }

    @Override
    public void exit() {

    }
}
