package structuraldesignpatterns.compositepattern.client;

public interface IComponent {
    void play();
    void setPlaybackSpeed(float speed);
    String getName();
}
