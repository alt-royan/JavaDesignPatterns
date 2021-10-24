package Creation.Prototype;

public class ProjectFactory {
    Project project;

    public ProjectFactory(Project project){
        this.project=project;
    }

    public Project copyProject(){
        return (Project) project.copy();
    }
}
