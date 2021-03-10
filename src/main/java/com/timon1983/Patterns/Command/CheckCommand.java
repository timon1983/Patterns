package main.java.com.timon1983.Patterns.Command;

public class CheckCommand implements Work{

    BuildingOrganization buildingOrganization;

    public CheckCommand(BuildingOrganization buildingOrganization) {
        this.buildingOrganization = buildingOrganization;
    }

    @Override
    public void doWork() {
        buildingOrganization.check();
    }
}
