/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converttemp;

/**
 *
 * @author lenovo
 */
public class conversion {
    float celcius;

    public conversion(float celcius) {
        this.celcius = celcius;
    }
    float fahrenheit(){
        return (9 * celcius)/5 + 32;
    }
    
    float reamur(){
        return (4 * celcius)/5;
    }
    
    float kelvin(){
        return (float) (celcius + 273.15);
    }
    
    String watercondition(){
        if (celcius >=100) {
            return ("Water Condition Boiling");
            
        }else if (celcius<=0) {
            return ("Water Condition Frozen");
        }else{
            return ("Water Condition Normal");
        }
    }
}
