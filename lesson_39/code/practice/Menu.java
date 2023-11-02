package practice;

public enum Menu {
    ADD(1, "Добавить запись"),
    VIEW_ALL(2, "Посмотреть все записи"),
    DELETE(3, "Удалить запись (по номеру)"),
    EXIT(4, "Выйти");

    private int number;
    private String action;

    Menu(int number, String action) {
        this.number = number;
        this.action = action;
    }

    public int getNumber() {
        return number;
    }

    public String getAction() {
        return action;
    }
    public void printMenu() {
        System.out.println("1. Добавить запись" + "2. Посмотреть все записи" +
                "3. Удалить запись (по номеру)" + "4. Выйти");
    }
}
