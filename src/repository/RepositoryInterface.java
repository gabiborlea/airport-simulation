package repository;

import model.ObjectInterface;

public interface RepositoryInterface{
    public void add(ObjectInterface obj);
    public void remove(ObjectInterface obj);
    public int search(ObjectInterface obj);
    public ObjectInterface getByID(int id);
}
