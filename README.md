# Tofu

An easy to learn intuitive programming language.

# Running ANTLR

**Step 1**: Compile `.g4` file

```
java -jar /usr/local/lib/antlr-4.0-complete.jar Tofu.g4
```

**Step 2**: Compile the `.java` files into `.class`

```
javac -classpath /usr/local/lib/antlr-4.0-complete.jar *.java
```

**Step 3**: Running the parser with TestRig

```
java -cp ".:/usr/local/lib/antlr-4.0-complete.jar" org.antlr.v4.runtime.misc.TestRig Tofu program -gui
```
