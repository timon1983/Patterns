Шаблон проектирования Посредник(Mediator).
-Классы Director и EmployeeCommand реализуют интерфейс Employee c методами sendCommand и getCommand.Также имеют
static списки для хранения историй сообщений.
-В качестве посредника выступает класс ConnectionOrder который собирает в себе экземпляры класса EmployeeCommand и
реализует порядок отправки сообщений между ними , с помощью метода sendCommand().
