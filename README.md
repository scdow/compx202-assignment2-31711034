### COMPX202 -  Mobile Computing and Software Architecture
Assignment 2 - Experimenting with a big Java Package: JavaFX
========================================

#### Due on **Friday 20th March at 8pm**
 
The goal of this exercise is to experiment with the JavaFX system for building user interfaces.
JavaFX is the recommended library for making user interfaces in desktop applications with
the current version of the Java language and development system.

JavaFX is described in the documentation [here](https://openjfx.io/openjfx-docs/) (overview) and [here](https://openjfx.io/javadoc/11/) (full API).
You should also look at the explanations and resources in Week 3 materials.

This assignment has 3 parts:
 1. Taking a 'sample' program (different from the one examined in class) and experimenting to find out how it works.
 2. Extending or rewriting the sample program to layout a form in JavaFX.
 3. Adding callbacks to make your program interactive.

**You must update this README file and commit it in your repository as part of your work.**


Instructions
========

1. Fork this repository using the button at the top of the project page. KEEP THE VISIBILITY OF YOUR PROJECT PRIVATE. (Settings > expand Permissions > Project visibility: Private). Only your teachers should see your code, YOU CANNOT SHARE IT WITH YOUR CLASSMATES.
2. Clone the new repository to your computer using IntelliJ IDEA ( File > New > Project from Version Control ; insert the URL you get from YOUR repository by clicking "clone or download").  
3. Develop and test the program on your computer
as described below.
4. Remember to commit and push regularly as you work on the project!  Good Git usage, with regular commits having useful messages, will be required in the grading. You can use IntelliJ to commit and push your files (VCS > Git > ...). For more information see [https://www.jetbrains.com/help/idea/commit-and-push-changes.html](https://www.jetbrains.com/help/idea/commit-and-push-changes.html)
5. There are questions asked for each task and locations for answering each question in this document (after the task descriptions).  You should answer them in your copy of this document, which will be the README for your version of the project.


Task 1
======

1. The project includes a sample JavaFX program - called A2.java  (inside "src" folder). Make sure that your clone of the repository includes A2.java.  Try compiling and running it, to use IntelliJ IDEA you need to follow the instructions to set up a JavaFX project.  Find out what the program does when you enter text into the text boxes. Answer Question 1 (below).
2. In the same way as demonstrated in the lecture, experiment with A2.java.  Make changes to the program.  Run it and see what effects your changes have. You should focus on features not seen in the lecture.  To demonstrate your work, answer Question 2.  Your experiments should be different from those tried in the lecture and should be distinct, not be minor variations on a theme.
3. Three new JavaFX classes used in A2.java are:  HBox, Text and TextField.  Question 3 asks you to describe them.

Task 1 Questions
----------------

```
Question 1
What does A2.java do when you enter text?

*
The program can check the string in "raw input".
When find the characters same with the characters in "Censored", change them to the chars in "Replacement".
The change result is displayed in scene.
*

Question 2
Describe three experiments you conducted on A2.java and in each case explain what you learned from the results.

*
Ever test delete these statement to experiment, and resume later:
label7.setFont(new Font(24)); can change font size, when deleted, the "Censored Version" be smaller.
root.getChildren().add(hbox1); can add horizontal HBox "hbox1" in verital VBox "root".
root.getChildren().add(text3); Find what is TextField "text3".
*

Question 3
For each of the classes HBox, Text and TextField briefly describe the purpose of the class (what graphical element is it? what do you use it for?).

*
HBox: A row "box" in scene, lays out its children in a single horizontal row. For example: in "hbox1", there are "vbox11", "label2", "vbox12" locating from left to right.
Text: An area that can display strings. Eg: in A2.java, "label3" is belong to class Text, it make the "Replacement" appear in scene.
TextField: An area that can type the strings. Eg: TextField "text3" makes an area that can input the raw strings in.
*

```

Task 2
======

In this section you will extend the A2.java program to display a form that looks like this.

![Screen shot of required program with no data entered](A2ProgramEmpty.png)

The idea is that the form allows a user to enter up to 3 items that might be purchased in a shop.  For each item the user can enter the name of the item, the number being purchased and the unit price(value).  In Task 3 it will be extended to continually update labels at the right to display total price for each item and at the bottom the total price for all items. Your task here is to decide on a layout using VBox and HBox.  A good solution will make use of font size and other parameters give a good appearance.  You can assume that none of the prices displayed are never greater than $999.


Task 2 Questions
----------------

```
Question 1.
*Insert a screenshot of your form with 3 items filled in (item, number and value for each).
```
![Screen shot of Assignment2 task2](task_2.png)

Task 3
======

Using callbacks on key release for each text box: update your program to calculate item prices and final
totals.  (Update the display on every key entry to the program).  If values entered are not valid numbers,
don't display prices.


The screen shot shows the program with some data entered.

![Screen shot of program running](A2ProgramFilled.png)


Task 3 Questions
----------------

```
Question 1.
What would happen if you used the key press event rather than the key release event.

*In the situation of If entering valid numbers:
Key press event: when use keyboard type number in textField, once press, immediately begin calculating. The event lauch before release the keyboard.
Key release event: When press the first digit by keyboard, the program won't calculate price right now. The event will start after the key released.*

Question 2.
Is the use of key release satisfactory?  Are there situations in which edits are not detected? (hint: try using the mouse)

*For laptop:
I think for laptop it's convenient to use key release event to calculate items' price, becouse people always input numbers by keyboard in laptop, and I just need to type numbers, then the result will appear automatically.
For mobile phone:
But, if users has no entity keyboard (like mobile phone), only key release event will hard to be used. 
For edit data:
In this program window, the calculating results of item prices and total price, they all can't be copy, so reusing these data in other places is not easy.*

Question 3.
*Insert a screenshot of your form with 3 items and the final total calculated.
```
![Screen shot of Assignment2 task3](task_3.png)

Submission
==========

Your finished project should be in your GitHub repository (don't forget to commit and push).  
You must also export your project to a ZIP folder and submit that through Blackboard.


Grading
=======

| Weighting | Allocated to |
|:----------:|------|
| 20% | Correct repository usage and settings |
| 20% | Task 1 questions and modifications |
| 30% | Task 2 code and screenshot |
| 30% | Task 3 code and questions |
