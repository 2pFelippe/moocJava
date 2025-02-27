/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.HashMap;
/**
 *
 * @author PP
 */
public class VehicleRegistry {
    private HashMap<LicensePlate, String> vehicle;
    
    public VehicleRegistry(){
        this.vehicle = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner){
        if(this.vehicle.get(licensePlate) == null){
            this.vehicle.put(licensePlate, owner);
            return true;
        }
        return false;
    }
    
    public String get(LicensePlate licensePlate){
        if(this.vehicle.keySet().contains(licensePlate)){
            return this.vehicle.get(licensePlate);
        }
        return null;
    }
    
    public boolean remove(LicensePlate licensePlate){
        if(this.vehicle.keySet().contains(licensePlate)){
            this.vehicle.remove(licensePlate);
            return true;
        }
        return false;
    }
    
    public void printLicensePlates(){
        for(LicensePlate plate: this.vehicle.keySet()){
            System.out.println(plate);
        }
    }
    public void printOwners(){
        String owner = "";
        for(LicensePlate plate: this.vehicle.keySet()){
            if(!(owner.equals(this.vehicle.get(plate)))){
                System.out.println(this.vehicle.get(plate));
                owner = this.vehicle.get(plate);
            }
        }
    }
}
