## File Structure
```text
.
├── README.md
└── src
    ├── app
    │   └── App.java
    └── model
        ├── modernfeatures
        │   └── Chargeable.java
        └── vehicle
            ├── Car.java
            ├── Motorcycle.java
            └── Vehicle.java

6 directories, 6 files

```

## Compile: 

-- javac -d bin $(find src -name "*.java")

## Run: 

-- java -cp bin app.App    

## Generate Documentation

-- javadoc -d docs -sourcepath src -subpackages model app