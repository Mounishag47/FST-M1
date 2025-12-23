# Define the Car class
class Car:
    def __init__(self, manufacturer, model, make, transmission, color):
        self.manufacturer = manufacturer
        self.model = model
        self.make = make
        self.transmission = transmission
        self.color = color

    def accelerate(self):
        print(f"{self.manufacturer} {self.model} is moving")

    def stop(self):
        print(f"{self.manufacturer} {self.model} has stopped")


# Create 3 car objects
car1 = Car("Toyota", "Corolla", 2020, "Automatic", "Red")
car2 = Car("Honda", "Civic", 2019, "Manual", "Blue")
car3 = Car("Ford", "Mustang", 2021, "Automatic", "Black")

# Call methods for each car
car1.accelerate()
car1.stop()

car2.accelerate()
car2.stop()

car3.accelerate()
car3.stop()
