
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.*;


/*
- Проверить, что экземпляр объекта Car также является экземпляром транспортного средства (используя оператор instanceof).

В этом проекте, вы будете работать с проектом ""Vehicle"", который представляет собой иерархию классов, включающую
абстрактный базовый класс ""Vehicle"" и два его подкласса ""Car"" и ""Motorcycle"".

Базовый класс ""Vehicle"" содержит абстрактные методы ""testDrive()"" и ""park()"", а также поля ""company"",
""model"", ""yearRelease"", ""numWheels"" и ""speed"".

Класс ""Car"" расширяет ""Vehicle"" и реализует его абстрактные методы. При создании объекта ""Car"", число колес
устанавливается в 4, а скорость в 0. В методе ""testDrive()"" скорость устанавливается на 60, а в методе
""park()"" - обратно в 0.

Класс ""Motorcycle"" также расширяет ""Vehicle"" и реализует его абстрактные методы. При создании объекта
""Motorcycle"", число колес устанавливается в 2, а скорость в 0. В методе ""testDrive()"" скорость устанавливается
на 75, а в методе ""park()"" - обратно в 0.
 */
class VehicleTest {
//    private Vehicle vehicle;
    private Car car;
    private Motorcycle motorcycle;


    @BeforeEach
    void setup() {
        car = new Car("VAZ", "2101", 1);
        motorcycle = new Motorcycle("Ural", "Harley&Davidson", 1);
    }
// Проверить, что экземпляр объекта Car также является экземпляром транспортного средства (используя оператор instanceof).
    @Test
    void checkCarInstance (){
        assertThat(car instanceof Vehicle);
    }
        // - Проверить, что объект Car создается с 4-мя колесами.
    @Test
    void fourWheels() {
        assertThat(car.getNumWheels()).isEqualTo(4);
    }
    // - Проверить, что объект Motorcycle создается с 2-мя колесами.
    @Test
    void twoWheels() {
        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }
    // Проверить, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()).
    @Test
    void speedTestCar() {
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }
    //- Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (используя метод testDrive()).
    @Test
    void speedTestMotorcycle() {
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }
    //- Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) машина
    //останавливается (speed = 0).
    @Test
    void parkTestCar() {
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }
    //- Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) мотоцикл
    //останавливается (speed = 0).
    @Test
    void parkTestMotorcycle() {
        motorcycle.testDrive();
        motorcycle.park();
        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }
}


