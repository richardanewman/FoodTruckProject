## Food Truck Rating Project

### Week 2 Homework Project for Skill Distillery

###Overview

This program simulates a food truck rating interface. Users are prompted to enter up to five food trucks, give them a name, type of food served, and a rating.Each truck is given a unique ID number but this is not inputed by the user. The user can quit before entering five trucks and the program will continue. The user is then prompted with a new menu to either display all trucks with all values, average rating for all trucks entered, or the highest rated truck with all its values. The user should be able to continue selecting items or quit the program at anytime. This program is not linked to a database, so all data enter will be lost after the program exits.

### Technologies

Java Version 1.8, Eclipse IDE, Git, Github, Atom

###Topics Applied

The primary topics applied from Week 2 at Skill Distillery were Objects/Classes, Encapsulation, and Visibility.

### Lessons Learned

I found that there was a small gap between the material covered during the week and the weekend's assignment. Mainly the addition of user input used to create an instance of an object which filled an array of objects instead of simply outputting data which is embedded with the code. But mentally processing the gap only helped to clarify and solidify the material covered. Incrementing the static field gave me a little trouble at first but found the error was actually in the toString since I had changed variable names.

The introduction of Encapsulation this week has shown me the importance of hiding internal state and requiring interactions to be performed through an object's methods. This exercise developed a greater appreciation for Encapsulation and I can see the importance of using Encapsulation for real world application. I especially like the use of going so far as to create a copy of an array to use as a display instead of displaying the original array as an added measure of security.

### How to Run

You must compile this program to run it. Download or clone this FoodTruckProject repository to a local directory. Open the Eclipse IDE (or your favorite Java compiler) and import the project under the File menu. Or clone the repository directly into your IDE via terminal. Once you have compiled it, click run and follow the prompts.

Clone with SSH:

git@github.com:richardanewman/FoodTruckProject.git

Clone with HTTPS:

https://github.com/richardanewman/FoodTruckProject.git

##Context

Below you will find a copy of the assignment's tasks. I am providing this context for anyone evaluating my code. We were not given a boilerplate. For better or worse, the code is my own. The only resources referenced were from the prior weeks course material and my class notes. I do not like to copy and paste code. I am attending this bootcamp so that I can thoroughly understand how to properly develop software using Java.

### Task Overview Provided by Skill Distillery

Users will input and rate a list of food trucks, then view the average rating and the highest-rated truck.

### Structure
You will define a FoodTruck class with fields for a unique numeric id, a name ("TacoRific", "Mediterranean Medic", etc.), food type ("Tacos", "Falafel", etc.), and a numeric rating.

You will create a separate class with a main method that starts the program. It will have an array to store up to five FoodTruck objects. The main method of this class is the only static method in the entire project.

##User Stories
###User Story 1
The user is prompted to input the name, food type, and rating for up to five food trucks. For each set of input, a FoodTruck object is created, its fields set to the user's input, and it is added to the array. The truck id is not input by the user, but instead assigned automatically in the FoodTruck constructor from a static field that is incremented as each truck is created.

###User Story 2
If the user inputs quit for the food truck name, input ends immediately and the program continues.

###User Story 3
After input is complete, the user sees a menu from which they can choose to:

List all existing food trucks.
See the average rating of food trucks.
Display the highest-rated food truck.
Quit the program.

###User Story 4
After choosing a menu item, the user sees the menu again and can choose another item until the choose to quit.

###Grading
This is a graded project. You are expected to have your project completed by the start of class next week.

You will be given either a pass or fail based on whether your code works given all of the following test conditions:

Your working solution must be pushed to a Github repo named FoodTruckProject by start of class Monday morning.
Your Github repo has a README.md giving an overview of the program, topics/technologies used, and lessons you learned while working on it.
There are no static methods other than the one main method.
When a FoodTruck is created, its constructor assigns its id field the current value of a static field (such as (nextTruckId) and then increments the static field.
The user can input up to five food trucks.
The user can stop inputing trucks before entering five by entering quit as the truck name, after which all input stops and the program continues.
When a menu item is chosen, the list of all trucks entered is displayed. If less than five were input, only those trucks that were created are displayed.
When another menu item is chosen, the average rating based on the number of trucks entered is displayed.
When another menu item is chosen, the winning truck - the one that was input with the highest rating - is displayed with all its properties.
Food trucks are displayed by printing its toString, which includes all FoodTruck fields.
When the quit menu item is chosen, the program ends with a message.
If the project does work with all of the above test conditions, you will be given a 1 for this week's project.

If the project does not work with the above test conditions, you will be given a 0 for this week's project.
