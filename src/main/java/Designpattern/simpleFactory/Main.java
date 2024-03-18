package Designpattern.simpleFactory;

public class Main {
    public static void main(String[] args) {
        Person man = Nvwa.createPerson("M");
        man.introduce();
        Person woman = Nvwa.createPerson("W");
        woman.introduce();
        Person robot = Nvwa.createPerson("R");
        robot.introduce();
    }
}


interface Person {
    void introduce();
}

class Man implements Person {
    public void introduce() {
        System.out.println("I am a man.");
    }
}

class Woman implements Person {
    public void introduce() {
        System.out.println("I am a woman.");
    }
}

class Robot implements Person {
    public void introduce() {
        System.out.println("I am a robot.");
    }
}

class Nvwa {
    public static Person createPerson(String type) {
        Person person = null;
        switch(type) {
            case "M":
                person = new Man();
                break;
            case "W":
                person = new Woman();
                break;
            case "R":
                person = new Robot();
                break;
            default:
                System.out.println("Invalid type.");
                break;
        }
        return person;
    }
}

