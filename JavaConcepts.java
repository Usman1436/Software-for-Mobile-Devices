//BoxClass contain static method / variable example and impliments interface
//Animal is an abstract class which is extanded by Dog and Cat classes , they uses abstract class and abstract /non abstract methods , final and static varibles/methods , Unchecked exceptions and impliments 2 interfaces(myInterface and myInterface2).
// Cat and Dog classes uses non static and static classes , abstract and non abstract methods
//MainClass calls all the methods from upper classes and contain Checked Exception.


import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;




class dog extends Animal{
    
    String myname = "tomy";
    static String staticname = "moti";
    public dog() {
        System.out.println("In Dog Constructor " + " (abstract class cant initialize example)");
    }
    
    public void final_method() 
    {
        System.out.println("This is a final method.");
    }
    
    @Override                                                                               //abstract example
    public void sound()
    {
        System.out.println("Dog Barking wow wow " + " (interface and abstract class example)");
        System.out.println("value of A " + a + " (static variable example)");               //static variable used
    }
    @Override
    public void belongTo()
    {
        System.out.println("This Object Belongs to :  " + s + " (abstract method and final variable example)");           //final variable used
    }
    class German_shephard                                   //can use any member of unnper class
    {
        public void speakYourName()
        {
          System.out.println("My Dog Name is : " + myname + " (non static inner nested class example)");
        }
    }
    static class puddle                                     //can only use static memebers of upper class
    {
        public void speakYourName()
        {
          System.out.println("My DOg Name is : " + staticname + " (static class example)");
        }
    }
    
}
//////////////////////////////////////////////////////////////


class cat extends Animal{
    
    public cat() {
        System.out.println("In Cat Constructor " + " (abstract class cant initialize example)");
    }
    @Override
    public void sound()
    {
        System.out.println("Cat Mew Mew " + " (interface and abstract class example)");
        System.out.println("value of A " + a + " (static variable example)");
    }
    public void belongTo()
    {
        System.out.println("This Object Belongs to :  " + s + " (abstract method and final variable example)");
    }
    final void m1() 
    {
        System.out.println("This is a final method.");
    }
    
}//////////////////////////////////////////////////////////


interface MyInterface {
    
    public void volume();
}
/////////////////////////////////////////////////////////////


class BoxClass implements MyInterface{
    double length , width , height;
    static int a = 10;
    //create construtor

    public BoxClass(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    @Override
    public void volume(){
        System.out.println("volume " + length*width*height + " (interface example)");
    }
    // static method 
    static void setCllg(int num){ 
        a = num ; 
        System.out.println("value of A " + a + " (static method and variable example)");
    }
}

/////////////////////////////////////////

interface MyInterface2 {
    public void volume2();
}

//////////////////////////////////////////

abstract class Animal implements MyInterface2 , MyInterface {
    
    static int a = 10;                                          //static variable
    final String s = "Animal Kingdom";                          //final variable
    
    public Animal() {
        
    }
    public abstract void sound();                               //abstract method
    public abstract void belongTo();
    @Override
    public void volume2(){                                       //non abstract method
        System.out.println("im at voume 2 " + " (interface example)");
    }
    public void volume(){                                       //non abstract method
        System.out.println("im at voume 1 " + " (interface example)");
    }
    public void tell(){
        System.out.println("im an Animal ");
    }
    
    
}

////////////////////////////////////////////////////////

public class MainClass {
    public static void main(String[] args ) //throws FileNotFoundException
    {
        System.out.println("--------Box Class--------");
        BoxClass myBox = new BoxClass(2, 3, 5);                         //interface
        myBox.volume();
        myBox.setCllg(9);                                               //static method
        System.out.println("--------Animal -> Dog and Cat Class--------");
        Animal myDog = new dog();                                       //interface and abstract 
        myDog.sound();
        Animal myCat = new cat();                                       //interface and abstract 
        myCat.sound();                                                  //abstract method
        
        myDog.belongTo();                                               //abstract method
        myDog.volume();                                                 //interface method
        myDog.volume2();                                                 //interface method
        dog.German_shephard i = new dog().new German_shephard();        //initializing non static
        i.speakYourName();                                              //non static inner nested classes
        dog.puddle j = new dog.puddle();                                //static nested class    
        j.speakYourName();                                              //static nested classes
        System.out.println("-------Exception Handling--------");
        //myDog.uncheck_exception();                                      
        uncheck_exception();
            //unchecked exception
        DisplayFile("me.txt");                                          //checked exception
        
         
    }
    public static void DisplayFile(String name) //throws FileNotFoundException
    {
        Scanner inputFile = null;
        File file = new File(name);
        try
        {
         inputFile = new Scanner(file);
         while(inputFile.hasNext())
            {
                //System.out.println(inputFile); //Reading file contect and putting to screen
            }
        }
        catch(FileNotFoundException ex)
               {
                   //System.out.println("1");
                    System.out.println(ex + " (checked exception example)");
                   // System.out.println("2");
               }
        
        inputFile.close();
    }
    public static void uncheck_exception()                             //unchecked exception
    {
        try{  
            //code that may raise exception  
            int data=100/0;  
           }
        catch(ArithmeticException e)
        {
            System.out.println(e + " (uunchecked exception example)");
        }    
    }
    
    
    
}