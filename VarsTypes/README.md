# DataTypes

## Primitives

### Integer

| Name  | Description                     |
| :---- | :------------------------------ |
| Byte  | -128 -> 127                     |
| Short | -32,768 -> 32,767               |
| Int   | -2,147,483,648 -> 2,147,483,647 |
| Long  | Very High Limits                |

### Decimal

| Name   | Description               |
| :----- | :------------------------ |
| Float  | 8 digits after the point  |
| Double | 15 digits after the point |

### Other

| Name    | Description                   |
| :------ | :---------------------------- |
| Char    | Only one character (Ex.: 'A') |
| Boolean | True or False                 |

## Objects

### Strings

These are arrays filled with chars whose define words

Ex.: "Hello World!".

# Variables

These are spaces in memory where the data is stored. It needs to
be declared and defined giving to the variable a type and a name.

```java
  String hello = "Hello World!";
```

There could be assigned to another variable if it is needed.

```java
  byte number_one = 84;
  byte number_two = 26;
  byte subtraction = number_one - number_two;

  System.out.println(subtraction);
```
