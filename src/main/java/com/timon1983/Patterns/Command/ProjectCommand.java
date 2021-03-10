package main.java.com.timon1983.Patterns.Command;

public class ProjectCommand implements Work{

    BuildingOrganization buildingOrganization;

    public ProjectCommand(BuildingOrganization buildingOrganization) {
        this.buildingOrganization = buildingOrganization;
    }

    @Override
    public void doWork() {
        buildingOrganization.project();
    }
}
