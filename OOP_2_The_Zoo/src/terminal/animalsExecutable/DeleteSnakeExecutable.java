package terminal.animalsExecutable;

import zoo.Zoo;

public class DeleteSnakeExecutable implements CommandExecutable {
    private Zoo zoo;

    public DeleteSnakeExecutable(Zoo zoo) {
        this.zoo = zoo;
    }

    public void execute() {
        zoo.deleteSnake();
    }
}
