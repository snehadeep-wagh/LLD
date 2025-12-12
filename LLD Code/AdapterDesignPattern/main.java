package AdapterDesignPattern;

import AdapterDesignPattern.Adaptee.WeightMachine;
import AdapterDesignPattern.Adaptee.WeightMachingForChildren;
import AdapterDesignPattern.Adapter.WeightMachineAdapter;
import AdapterDesignPattern.Adapter.WeightMachineAdapterImpl;

public class main {
    public static void main(String[] args) {
        WeightMachine weightMachine = new WeightMachingForChildren();
        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(weightMachine);
        double wtInKgs = weightMachineAdapter.getWeightInKgs();
        System.out.println("Wt in Kgs for child is: " + wtInKgs);
    }
}
