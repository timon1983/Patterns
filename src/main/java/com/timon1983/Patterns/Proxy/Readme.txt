Шаблон проектирования Прокси(Proxy).
-Классы NewWorkPlan и ProxyWorkPlan реализуют интерфейс WorkPlan .
-В классе ProxyWorkPlan в методе doWork() создается объект класса NewWorkPlan , в котором с помощью метода usePlan() принимается новый
план работ и метод doWork() выполняет работу по заданному плану.
