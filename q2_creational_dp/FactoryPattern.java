interface Vehicle {
    int set_num_of_wheels();
    int set_num_of_passengers();
    boolean has_gas();
}

///////////////////////////////////////////////////////////////////////////////

class Car implements Vehicle {
    int set_num_of_wheels(){
        return 4;    
    }
    
    int set_num_of_passengers(){ 
        return 5;
    }

    boolean has_gas(){
        return true;
    }
}

//////////////////////////////////////////////////////////////////////////////////////

class Plane implements Vehicle {
    int set_num_of_wheels(){
        return 3;    
    }
    
    int set_num_of_passengers(){ 
        return 250;
    }

    boolean has_gas(){
        return false;
    }
}

///////////////////////////////////////////////////////////////////////////////////////

class VehicleFactory {
    Vehicle getVehicle(String type){
        if(type.equals("car") return new Car();
        if(type.equals("plane")) return new Plane();
        return null;
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////



class Solution {
    public static void main(){
        VehicleFactory factory = new VehicleFactory();
        Vehicle car = factory.getVehicle("car");
        Vehicle plane = factory.getVehicle("plane");
    }
}
