public class Student<T> implements IDatabase<T>{
    
    @Override
    public boolean insert(T data) {
        // TODO Auto-generated method stub
        System.out.println("Data inserted");
        return true;
    }

    @Override
    public boolean delete(T data) {
        // TODO Auto-generated method stub
        System.out.println("Data deleted");
        return true;
    }

    @Override
    public boolean update(T data) {
        // TODO Auto-generated method stub
        System.out.println("Data updated");
        return true;
    }

    @Override
    public T select() {
        // TODO Auto-generated method stub
        System.out.println("Data selected");
        return null;
    }
}
