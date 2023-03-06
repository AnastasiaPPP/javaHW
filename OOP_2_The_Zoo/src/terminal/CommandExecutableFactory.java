package terminal;

import terminal.animalsExecutable.CommandExecutable;

public interface CommandExecutableFactory {
    CommandExecutable create(Command command);

}
