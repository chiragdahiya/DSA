package LLD;

import LLD.solidPrinciples.Vehicle;

//SOLID 
//Single responsisbility
//open/closed principles
//Liskov substitution principles
public class solidPrinciples {

     
    //open/closed principles
    abstract class Shape {
        abstract double calculateArea();

        
    }

    class Circle extends Shape{
        private double radius;
        @Override
        public double calculateArea(){
            return Math.PI* radius *radius;
        }

    }

    class Rectangle extends Shape{
        private double width;
        private double hieght;

        @Override
        public double calculateArea(){
            return width * hieght; 
        }
    }



    //Liskov substitution principles

    abstract class Vehicle{
        public void move(){

        }
    }

    abstract class EngineVehicle extends Vehicle{
        public void startEngine(){

        }
    }

     abstract class NonEngineVehicle extends Vehicle{
        public void startEngine(){

        }
    }

    class Car extends EngineVehicle{
        @Override
        public void startEngine(){

        }
    }

    class Bicycle extends NonEngineVehicle{
        @Override
        public void startEngine(){

        }
    }

    public class main{
        public static void main(String[] args){
            EngineVehicle car = new Car();
            car.startEngine();
            car.move();

            NonEngineVehicle bicycle = new Bicycle();
            bicycle.move();

        
        }

    }


    
}
