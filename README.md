# Java Methods Example (AddOverload)

A small Java program that shows how to define and call instance methods, including one that returns a value.

## What It Demonstrates

- A field (`a`) and two methods in the same class
- A method with no parameters (`add`)
- A method with parameters that prints and returns a result (`multiply`)
- Creating an object and calling its methods from `main`

```java
AddOverload obj = new AddOverload();
obj.add();
obj.multiply(4, 5);
```

## Note on the Name

Despite the class name, the code does not use method overloading, because each method name is used only once. To show overloading, add a second `multiply` with a different parameter list, for example:

```java
int multiply(int a, int b, int c) {
    return a * b * c;
}
```

## Output

```
Hello
c = 20
```

## Requirements

- Java Development Kit (JDK) 8 or higher

## Getting Started

```bash
git clone https://github.com/<your-username>/<your-repo-name>.git
cd <your-repo-name>
javac AddOverload.java
java AddOverload
```

## Project Structure

```
.
├── AddOverload.java
└── README.md
```

## Next Steps

- Add overloaded versions of `multiply` for three numbers and for `double` values
- Use the returned value from `multiply` instead of ignoring it
- Remove the unused field `a`
