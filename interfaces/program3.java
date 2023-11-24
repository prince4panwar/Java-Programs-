/* Write a Java program to create an interfae Flyable with a method called fly_obj().
Create three classes Spacecraft, Airplane, and Helicopter that implement the flyable interface. Implement the fly_obj() method for each of the three classes.
*/


interface Flyable
{

void fly_obj();

}

class Spacecraft implements Flyable

{

public void fly_obj()
{

System.out.println("Spaceraft is ready to fly");

}


}

class Airplane implements Flyable

{

public void fly_obj()
{

System.out.println("Airplane is ready to fly");

}


}

class Helicopter implements Flyable

{

public void fly_obj()
{

System.out.println("Helicopter is ready to fly");

}

public static void main(String args[])
{

Spacecraft obj1 = new Spacecraft();
Airplane obj2 = new Airplane();
Helicopter obj3 = new Helicopter();

obj1.fly_obj();
obj2.fly_obj();
obj3.fly_obj(); 

}

}