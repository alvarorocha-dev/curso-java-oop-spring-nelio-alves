package exercicioNotas.entities;

public class Student {   

    public String name;
    public double quarterOne;
    public double quarterTwo;
    public double quarterThree;    

    public double finalGrade(){
        return quarterOne + quarterTwo + quarterThree;
    }

    public double missingPoints() {
        if (finalGrade() < 60.0) {
            return 60.0 - finalGrade();
        } else {
            return 0.0;
        }
    }
}
