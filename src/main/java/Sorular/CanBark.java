package Sorular;

interface HasVocalCords {
    public abstract void makeSound();
}

public interface CanBark extends HasVocalCords {
    public void bark();

}
