package main.java.com.timon1983.Patterns.Command;

public class CommandDemo {
    public static void main(String[] args) {

        BuildingOrganization buildingOrganization = new BuildingOrganization();

        Worker worker = new Worker(
                new BuldCommand(buildingOrganization),
                new CheckCommand(buildingOrganization),
                new ProjectCommand(buildingOrganization)
        );

        worker.doBuild();
        worker.doCheck();
        worker.doProject();

    }
}
