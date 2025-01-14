//Griffin Hampton CSE 220
/*
Getting used to java syntax

things to remember:
it is "true" not "True" with bools
System.out.println("Hello" + variableName);

The byte data type can store whole numbers from -128 to 127.
This can be used instead of int or other integer types to save memory when you are certain
that the value will be within -128 and 127.

The 'short' data type can store whole numbers from -32768 to 32767.

The long data type can store whole numbers from -9223372036854775808 to 9223372036854775807.
This is used when int is not large enough to store the value.
Note that you should end the value with an "L".

The float and double data types can store fractional numbers.
Note that you should end the value with an "f" for floats and "d" for doubles:
d=more decimal points, f=less.

A floating point number can also be a scientific number with an "e" to indicate the power of 10:
float f1 = 35e3f;
double d1 = 12E4d;

smallest to largest:
byte -> short -> char -> int -> long -> float -> double

String len found w .length()

.toLowerCase()
.toUpperCase()
JAVA HAS IT YES!!!!

.indexOf("letter") finds the position of a certain item in a string, im sure it works w arrays
too

System.out.println(string1.concat(string2));
puts both strings together like System.out.println(string1+""+string2);

to use an escape character put a backslash in front of it

Math dictionary has min(x,y),max(x,y),sqrt(square root),abs(absolute value),random (between 0.0, 1.0)
multiply it to get bigger random numbers

bool can be (10<9) returns false bc not true, 10==10 returns true

? and : can work as an if else statement
EX:
String result = (time < 18) ? "Good day." : "Good evening.";
if time<18 it prints "Good day." otherwise it prints "Good evening"

switch statements function as if else
EX:
int day=4;
switch(day){
case 1:
System.out.println("monday");
break;
ETCETERA ETCETERA
default:
System.out.println("not a day in the week");
}

default works like the final else

do{
}
while(conditions);
works too

for each works like for each item in list run loop yf
EX:
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
for (String i : cars) {
  System.out.println(i);
}
would run 4 times

continue; stops a loop for one iteration, slightly less powerful break;

ARRAYS WORK LIKE PYTHON NOT C!!!
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

A multidimensional array is an array of arrays.
Multidimensional arrays are useful when you want to store data as a tabular form, like a table with rows and columns.
To create a two-dimensional array, add each array within its own set of curly braces:

int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
for (int i = 0; i < myNumbers.length; ++i) {
  for (int j = 0; j < myNumbers[i].length; ++j) {
    System.out.println(myNumbers[i][j]);
  }
}
int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
for (int[] row : myNumbers) {
  for (int i : row) {
    System.out.println(i);
  }
}
both do the same thing

If you want the method to return a value,
you can use a primitive data type (such as int, char, etc.) instead of void,
 and use the return keyword inside the method:

public class Main {
  static int myMethod(int x, int y) {
    return x + y;
  }

  public static void main(String[] args) {
    System.out.println(myMethod(5, 3));
  }
}
Outputs 8 (5 + 3)

 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String[] pages ={
                "Getting used to java syntax\n" +
                        "\n" +
                        "things to remember:\n" +
                        "it is \"true\" not \"True\" with bools\n" +
                        "System.out.println(\"Hello\" + variableName);\n" +
                        "\n" +
                        "The byte data type can store whole numbers from -128 to 127.\n" +
                        "This can be used instead of int or other integer types to save memory when you are certain\n" +
                        "that the value will be within -128 and 127.\n" +
                        "\n" +
                        "The 'short' data type can store whole numbers from -32768 to 32767.\n" +
                        "\n" +
                        "The long data type can store whole numbers from -9223372036854775808 to 9223372036854775807.\n" +
                        "This is used when int is not large enough to store the value.\n" +
                        "Note that you should end the value with an \"L\".\n" +
                        "\n" +
                        "The float and double data types can store fractional numbers.\n" +
                        "Note that you should end the value with an \"f\" for floats and \"d\" for doubles:\n" +
                        "d=more decimal points, f=less.\n" +
                        "\n" +
                        "A floating point number can also be a scientific number with an \"e\" to indicate the power of 10:\n" +
                        "float f1 = 35e3f;\n" +
                        "double d1 = 12E4d;\n" +
                        "\n" +
                        "smallest to largest:\n" +
                        "byte -> short -> char -> int -> long -> float -> double\n" +
                        "\n" +
                        "String len found w .length()\n" +
                        "\n" +
                        ".toLowerCase()\n" +
                        ".toUpperCase()\n" +
                        "JAVA HAS IT YES!!!!\n" +
                        "\n" +
                        ".indexOf(\"letter\") finds the position of a certain item in a string, im sure it works w arrays\n" +
                        "too\n" +
                        "\n" +
                        "System.out.println(string1.concat(string2));\n" +
                        "puts both strings together like System.out.println(string1+\"\"+string2);\n" +
                        "\n" +
                        "to use an escape character put a backslash in front of it\n" +
                        "\n" +
                        "Math dictionary has min(x,y),max(x,y),sqrt(square root),abs(absolute value),random (between 0.0, 1.0)\n" +
                        "multiply it to get bigger random numbers\n" +
                        "\n" +
                        "bool can be (10<9) returns false bc not true, 10==10 returns true\n" +
                        "\n" +
                        "? and : can work as an if else statement\n" +
                        "EX:\n" +
                        "String result = (time < 18) ? \"Good day.\" : \"Good evening.\";\n" +
                        "if time<18 it prints \"Good day.\" otherwise it prints \"Good evening\"\n" +
                        "\n" +
                        "switch statements function as if else\n" +
                        "EX:\n" +
                        "int day=4;\n" +
                        "switch(day){\n" +
                        "case 1:\n" +
                        "System.out.println(\"monday\");\n" +
                        "break;\n" +
                        "ETCETERA ETCETERA\n" +
                        "default:\n" +
                        "System.out.println(\"not a day in the week\");\n" +
                        "}\n" +
                        "\n" +
                        "default works like the final else\n" +
                        "\n" +
                        "do{\n" +
                        "}\n" +
                        "while(conditions);\n" +
                        "works too\n" +
                        "\n" +
                        "for each works like for each item in list run loop yf\n" +
                        "EX:\n" +
                        "String[] cars = {\"Volvo\", \"BMW\", \"Ford\", \"Mazda\"};\n" +
                        "for (String i : cars) {\n" +
                        "  System.out.println(i);\n" +
                        "}\n" +
                        "would run 4 times\n" +
                        "\n" +
                        "continue; stops a loop for one iteration, slightly less powerful break;\n" +
                        "\n" +
                        "ARRAYS WORK LIKE PYTHON NOT C!!!\n" +
                        "String[] cars = {\"Volvo\", \"BMW\", \"Ford\", \"Mazda\"};\n" +
                        "\n" +
                        "A multidimensional array is an array of arrays.\n" +
                        "Multidimensional arrays are useful when you want to store data as a tabular form, like a table with rows and columns.\n" +
                        "To create a two-dimensional array, add each array within its own set of curly braces:\n" +
                        "\n" +
                        "int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };\n" +
                        "for (int i = 0; i < myNumbers.length; ++i) {\n" +
                        "  for (int j = 0; j < myNumbers[i].length; ++j) {\n" +
                        "    System.out.println(myNumbers[i][j]);\n" +
                        "  }\n" +
                        "}\n" +
                        "int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };\n" +
                        "for (int[] row : myNumbers) {\n" +
                        "  for (int i : row) {\n" +
                        "    System.out.println(i);\n" +
                        "  }\n" +
                        "}\n" +
                        "both do the same thing\n"
        };
        try {
            File tutorialText = new File("tutorialJournal.txt");
            FileWriter tutorialWriter = new FileWriter("tutorialJournal.txt");
            if(tutorialText.createNewFile()) {
                System.out.println("file created");

            }else{
                System.out.println("file exists + adding to it now");
                /*
                tutorialWriter.write(pages[0]);
                tutorialWriter.close();
                */

            }
        }catch(IOException e){
            System.out.println("oopsie error");
            e.printStackTrace();
        }

        
    }
}