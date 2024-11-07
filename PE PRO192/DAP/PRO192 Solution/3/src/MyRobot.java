import java.util.List;
import java.util.Collections;
import java.util.Comparator;
public class MyRobot implements  IRobot
{

    @Override
public int f1(List<Robot> t) {
    int totalSteps = 0;
    for (Robot robot : t) {
        String label = robot.getLabel();
        if (!label.contains("A") && !label.contains("B")) {
            totalSteps += robot.getStep();
        }
    }
    return totalSteps;
}

@Override
public void f2(List<Robot> t) 
{
    Robot minStep = null;
    for (Robot robot : t) {
        if (minStep == null || minStep.getStep() > robot.getStep()) {
            minStep = robot;
        }
        else if (minStep.getStep() == robot.getStep() && minStep.getLabel().compareTo(robot.getLabel()) < 0) {
            minStep = robot;
        }
        if (robot.getStep() % 2 == 1) {
            t.remove(robot);
            break;
        }
    }
}

@Override
public void f3(List<Robot> t) {
    Collections.sort(t.subList(1, 5), new Comparator<Robot>() {
        @Override
        public int compare(Robot r1, Robot r2) {
            if (r1.getStep() == r2.getStep()) {
                return r2.getLabel().compareTo(r1.getLabel());
            }
            return r1.getStep() - r2.getStep();
        }
    });
}

    
}