package main.java.com.timon1983.Patterns.Command;

public class BuldCommand implements Work{

    BuildingOrganization buildingOrganization;

    public BuldCommand(BuildingOrganization buildingOrganization) {
        this.buildingOrganization = buildingOrganization;
    }

    @Override
    public void doWork() {
        buildingOrganization.build();
    }
}
