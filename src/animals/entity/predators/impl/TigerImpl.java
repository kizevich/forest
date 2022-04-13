package animals.entity.predators.impl;

import animals.entity.predators.Predator;
import animals.entity.predators.Tiger;

public class TigerImpl extends Predator implements Tiger  {

    public TigerImpl() {
    }

    public TigerImpl(String name, Double weight, int age, int forestMaxLength) {
        super(name, weight, age, forestMaxLength);        
    }

    @Override
    public void hunt() {
        // TODO Auto-generated method stub
        
    }

}
