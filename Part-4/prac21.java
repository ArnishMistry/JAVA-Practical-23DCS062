class Degree {
    public void getDegree() {
        System.out.println("I got a degree!!");
    }
}

class underGraduate {
    public void getDegree() {
        System.out.println("I am an UnderGraduate.");
    }
}

class postGraduate {
    public void getDegree() {
        System.out.println("I am a PostGraduate.");
    }
}
public class prac21 {
    public static void main(String[] args) {
        Degree degree = new Degree();
        underGraduate UnderGraduate = new underGraduate();
        postGraduate PostGraduate = new postGraduate();

        degree.getDegree();                  //Calls the getDegree() method of Degree class.
        UnderGraduate.getDegree();           //Calls the getDegree() method of underGraduate class.
        PostGraduate.getDegree();            //Calls the getDegree() method of postGraduate class.
    }
}
