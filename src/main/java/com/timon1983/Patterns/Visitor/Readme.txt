Шаблон проекторования Посетитель(Visitor).
-Классы BuildHouse, DriveCar, TreatPeople, Skils реализуют интерфейс Work.
-Классы Builder, Driver, Doctor реализуют класс Worker.
-При создании объекта Skils создается массив объектов Work (BuildHouse, DriveCar, TreatPeople) и с помощью метода
doWork() перебирая эти объекты вызываем через них свои методы  doWork() передавая в них объекты Builder, Driver,
 Doctor.
-В итоге получаем вывод индивидульных навыков в каждой сфере каждого рабочего.