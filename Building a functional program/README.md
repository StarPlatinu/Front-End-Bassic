# Lab Instructions: Building a Functional Program

In this exercise you'll get hands-on practice with functional programming concepts. <br> <br> 


> ### **Tips: Before you Begin**
> #### To view your code and instructions side-by-side, select the following in your VSCode toolbar:
> - View -> Editor Layout -> Two Columns
> - To view this file in Preview mode, right click on this README.md file and `Open Preview`
> - Select your code file in the code tree, which will open it up in a new VSCode tab.
> - Drag your assessment code files over to the second column. 
> - Great work! You can now see instructions and code at the same time. 
> - Questions about using VSCode? Please see our support resources here:  
    [Visual Studio Code on Coursera](https://www.coursera.org/learn/programming-with-javascript/supplement/roMvE/visual-studio-code-on-coursera)
> #### **To run your JavaScript code**
> - Select your JavaScript file
> - Select the "Run Code" button in the upper right hand toolbar of VSCode. Ex: It looks like a triangular "Play" button. <br><br>

<br>

## Task 1: Build a function-based console log message generator
In this exercise, your task is to code a function named `consoleStyler`, which accepts four parameters:
- `color`
- `background`
- `fontSize`
- `txt`

Inside the body of the consoleStyler() function declaration, you need to do the following:

1. Create a new variable named message, and assign the following to it on the very first line inside the consoleStyler() function body.: 
    ```
    "%c" + txt;
    ```

2. Create a style variable and assign the following to it on the next line: 
    ```
    `color: ${color};`
    ```

3. Next, update the style variable (using the += operator) with the following code: 
    ```
    `background: ${background};`
    ```