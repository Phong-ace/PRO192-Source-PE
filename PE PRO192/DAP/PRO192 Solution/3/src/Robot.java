/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class Robot 
{
    String label;
    int step;
    public Robot() {
}

public Robot(String label, int step) {
    this.label = label;
    this.step = step;
}

public String getLabel() {
    return label;
}

public int getStep() {
    return step;
}

public void setLabel(String label) {
    this.label = label;
}

public void setStep(int step) {
    this.step = step;
}

}
