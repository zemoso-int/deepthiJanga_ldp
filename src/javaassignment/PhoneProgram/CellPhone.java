package javaassignment.PhoneProgram;

public class CellPhone extends Phone implements MusicPlayer{
    @Override
    public void play() {

        System.out.println("Play from MusicPlayer");
    }

    @Override
    public void stop() {

        System.out.println("Stop from MusicPlayer");
    }

    @Override
    public void next() {

        System.out.println("Next from MusicPlayer");
    }

}
