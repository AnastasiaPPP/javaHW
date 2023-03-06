package terminal.commandExecutable;

import zoo.Zoo;

public class LoggingCommandExecutableFactory extends CommandExecutableFactoryImpl {
    public LoggingCommandExecutableFactory(Zoo zoo) {
        super(zoo);
    }
    @Override
    public CommandExecutable create(Command command) {
        if(command.isCreateLion()){
            System.out.println(String.format("Вы ввели команду 'Создать льва' с параметрами: \nВозраст - %d\nВес - %d\n" +
                    "количество лап - %d\nОбъем гривы - %d", command.setFirstParam(), command.setSecondParam(),
                    command.setThirdParam(), command.setFourthParam())); }
        else if(command.isCreateWolf()){
            System.out.println(String.format("Вы ввели команду 'Создать волка' с параметрами: \nВозраст - %d\nВес - %d\n" +
                                "количество лап - %d\nВвсота в холке - %d", command.setFirstParam(), command.setSecondParam(),
                        command.setThirdParam(), command.setFourthParam())); }
        else if(command.isCreateSnake()){
            System.out.println(String.format("Вы ввели команду 'Создать змею' с параметрами: \nВозраст - %d\nВес - %d\n" +
                            "количество лап - %d\nДлина тела - %d", command.setFirstParam(), command.setSecondParam(),
                    command.setThirdParam(), command.setFourthParam())); }
        else if(command.isDeleteLion()) System.out.println("Вы ввели команду 'Удалить льва'");
        else if(command.isDeleteWolf()) System.out.println("Вы ввели команду 'Удалить волка'");
        else if(command.isDeleteSnake()) System.out.println("Вы ввели команду 'Удалить змею'");
        CommandExecutable com = super.create(command);
        if(command.isCreateLion()) System.out.println("Лев успешно создан и добавлен в клетку");
        else if(command.isCreateWolf()) System.out.println("Волк успешно создан и добавлен в клетку");
        else if(command.isCreateSnake()) System.out.println("Змея успешно создан и добавлен в клетку");
        else if(command.isDeleteLion()) System.out.println("Случайный лев удален из клетки");
        else if(command.isDeleteWolf()) System.out.println("Случайный волк удален из клетки");
        else if(command.isDeleteSnake()) System.out.println("Случайня змея удалена из клетки");
        return com;
    }
}
