# Project Structure:

.
├── bin
│   └── Student.class
├── data
│   ├── Alice_1222.txt
│   └── Bob_1211.txt
├── README.md
└── src
    └── Student.java


# Compile Statement:

javac -d bin src/Student.java 


# Run Statement:

java -cp bin Student


## Notes:

1) Once you compile and run the source code, you will find the txt files created in a folder called 'data'.

## Question:

* What are Student class capable of doing?
    - creating a Stydent type object which has a name and id property assigned by the user

    - ... <ask them to complete>
    - ...

* Should a Student object really be responsible for all of these jobs?
