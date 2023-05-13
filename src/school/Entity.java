package school;

public abstract class Entity {
    private String name;

    protected Entity(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}