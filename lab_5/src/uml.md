```mermaid
classDiagram
    class Parabola {
        - double a
        - double b
        - double c
        + Parabola(double a, double b, double c)
        + double getA()
        + double getB()
        + double getC()
        + double calculateY(double x)
        + double[] calculateX(double y)
        + String toString()
        + boolean equals(Object obj)
        + int hashCode()
    }

    class ForumMessage {
        - String author
        - String topic
        - String text
        - LocalDateTime createdAt
        - LocalDateTime editedAt
        + ForumMessage(String author, String topic, String text)
        + String getAuthor()
        + String getTopic()
        + String getText()
        + LocalDateTime getCreatedAt()
        + LocalDateTime getEditedAt()
        + void editMessage(String newText)
        + String toString()
        + boolean equals(Object obj)
        + int hashCode()
    }

    class Student {
            - String name
            - int course
            - String id
            + Student(String name, int course, String id)
            + int getCourse()
            + String getId()
            + String getName()
            + void printInfo()
            + String toString()
            + boolean equals(Object obj)
            + int hashCode()
        }

     class GraduateStudent {
        - String thesisTopic
        + GraduateStudent(String name, int course, String id, String thesisTopic)
        + String getThesisTopic()
        + void printInfo()
        + boolean equals(Object obj)
        + int hashCode()
    }

    GraduateStudent --> Student : inherits


        class Book {
        - String title
        - String author
        - int year
        - int edition
        - int pages
        + Book(String title, String author, int year, int edition, int pages)
        + String getAuthor()
        + int getEdition()
        + int getPages()
        + String getTitle()
        + int getYear()
        + void printInfo()
        + boolean equals(Object obj)
        + int hashCode()
    }

    class LibraryBook {
        - String inventoryNumber
        - String takenBy
        + LibraryBook(String title, String author, int year, int edition, int pages, String inventoryNumber, String takenBy)
        + String getTakenBy()
        + String getInventoryNumber()
        + void printInfo()
        + boolean equals(Object obj)
        + int hashCode()
    }

    LibraryBook --> Book : inherits
