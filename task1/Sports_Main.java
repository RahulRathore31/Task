package task1;

public class Sports_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Football football = new Football();
        Basketball basketball = new Basketball();
        Rugby rugby = new Rugby();

        football.play();
        basketball.play();
        rugby.play();
	}

}
class Sports {
    void play() {}
}

class Football extends Sports {
    void play() {
        System.out.println("Playing football.");
    }
}

class Basketball extends Sports {
    void play() {
        System.out.println("Playing basketball.");
    }
}

class Rugby extends Sports {
    void play() {
        System.out.println("Playing rugby.");
    }
}


