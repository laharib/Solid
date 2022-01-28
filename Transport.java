//Interface segregation
public interface Transport {
    public void driving();
}
interface FoodServices {
    public void cooking();
}
interface Cleanliness {
    public void cleaning();
}
interface Security {
    public void check_ID();
}

class BusDriver implements Transport, Cleanliness{
    public void driving(){}
    public void cleaning(){}
}

class Canteen implements FoodServices, Cleanliness{
    public void cooking(){}
    public void cleaning(){}
}

class SecurityGuards implements Security{
    public void check_ID(){}
}