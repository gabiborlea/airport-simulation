package repository;

import model.ObjectInterface;

import java.util.ArrayList;

public class Repository implements RepositoryInterface{
    public ArrayList<ObjectInterface> objects;

    public Repository(){
        objects = new ArrayList<>();
    }

    @Override
    public void add(ObjectInterface obj) {
        objects.add(obj);
    }

    @Override
    public void remove(ObjectInterface obj) {
        objects.remove(obj);
    }

    @Override
    public int search(ObjectInterface obj) {
        for (int i=0; i<objects.size(); i++)
            if (objects.get(i).getID() == obj.getID())
                return i;
        return -1;
    }

    @Override
    public ObjectInterface getByID(int id) {
        for(var obj: objects)
            if (obj.getID() == id)
                return obj;

        return null;
    }
}
