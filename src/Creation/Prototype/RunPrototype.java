package Creation.Prototype;

public class RunPrototype {
    public static void main(String[] args) {
        Project project =new Project(3, "FirstProject", "//start my project");
        System.out.println(project);
        System.out.println("=====================");
        ProjectFactory factory =new ProjectFactory(project);
        Project projectCopy =factory.copyProject();
        System.out.println(projectCopy);

    }
}
