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

class VehicleBuilder {
    Vehicle getCar(){
        return new Car();
    }

    Vehicle getPlane(){
        return new Plane();
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////



class Solution {
    public static void main(){
        VehicleBuilder builder = new VehicleBuilder();
        Vehicle car = builder.getCar();
        Vehicle plane = builder.getPlane();
    }
}
