package terminal.parsing;

import terminal.Command;

public interface CommandParser {

    Command parseCommand(String input);
}

