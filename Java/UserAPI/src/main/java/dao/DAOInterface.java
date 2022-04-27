package dao;

//Generic interface with two generic types ("T" and "ID")

public interface DAOInterface <T, ID> {
    //CRUD design

    //Create
    public void create(T element);

    //Retrieve
    public T get(ID id);
    // eg public user getUser(String id);

    //Update
    public void update(T element);

    //Delete
    public void delete(T element);
}
