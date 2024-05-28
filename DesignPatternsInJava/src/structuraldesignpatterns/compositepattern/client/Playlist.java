package structuraldesignpatterns.compositepattern.client;

import java.util.ArrayList;

public class Playlist implements IComponent {

    public String playlistName;
    public ArrayList<IComponent> playlist = new ArrayList<>();

    public Playlist(String playlistName) {
        this.playlistName = playlistName;
    }

    @Override
    public void play() {

    }

    @Override
    public void setPlaybackSpeed(float speed) {

    }

    @Override
    public String getName() {
        return null;
    }

    public void add(IComponent component) {

    }

    public void remove(IComponent component) {

    }
}
